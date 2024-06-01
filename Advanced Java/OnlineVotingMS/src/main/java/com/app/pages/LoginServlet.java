package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

@WebServlet(value="/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDaoImpl userdao;

	public void init() throws ServletException {
		try {
			// create userdao instance
			userdao = new UserDaoImpl();
		} catch (Exception e) {
			// re - throw the exception to Web Container to inform about init failure
			throw new ServletException("err in init of" + getClass(), e);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1. set response content type
		response.setContentType("text/html");
		//2. get PW to send text, buffered response
		try (PrintWriter pw = response.getWriter()) {

			// 3. read request parameters
			String email = request.getParameter("email");
			String pword = request.getParameter("pword");

			// 4.invoke dao's method for user authentication
			User user = userdao.signIn(email, pword);
			if (user == null) {
				pw.print("<h5>Login Unsuccessful, Please <a href='login.html'>Retry</a></h5>");
			} else {
				// 5.Create a cookie holding valid user details
				Cookie c1 = new Cookie("user_info", user.toString());

				// 6. Add the cookie in response header
				response.addCookie(c1);
				pw.print("Login Successful"); // contents are discarded
				// pw.flush();
				// valid login, continue to role based authorization
				if (user.getRole().equals("admin")) {
					response.sendRedirect("admin_page");
				} else {
					if (user.isStatus()) {
						response.sendRedirect("logout");
					} else
						response.sendRedirect("candidate_list");
				}
			}
		} catch (Exception e) {
			throw new ServletException("in do-post error " + getClass(), e);
		}
	}

	public void destroy() {
		try {
			// clean up dao
			userdao.cleanUp();
		} catch (Exception e) {
			System.out.println("err in destroy !");
		}
	}

}
