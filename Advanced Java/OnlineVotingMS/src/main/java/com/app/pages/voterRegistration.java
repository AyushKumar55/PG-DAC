package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

@WebServlet(value="/voter_register", loadOnStartup = 2)
public class voterRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private UserDaoImpl userdao;
	
	public void init() throws ServletException{
		try {
			// create userdao instance
			userdao = new UserDaoImpl();
		}
		catch(Exception e) {
			// re - throw the exception to Web Container to inform about init failure
			throw new ServletException("in init of voter_register "+getClass(),e);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. set response content type
		response.setContentType("text/html");
		
		//2. get PW to send text, buffered response
		try(PrintWriter pw = response.getWriter()){
			
			//3. read request parameters
			String fname = request.getParameter("fn");
			String lname = request.getParameter("ln");
			String email = request.getParameter("email");
			String pword = request.getParameter("password");
			Date dob  = Date.valueOf(request.getParameter("dob"));
			
			LocalDate birthdate = dob.toLocalDate();
			
			//4. Validating if age is greater or equal to 21 or above
			if((LocalDate.now().getYear() - birthdate.getYear()) >= 21 ) {
				//5. Creating a new User Object
				User newVoter = new User(fname,lname,email,pword,dob);
				//6. Method is called with new user as the parameter 
				String msg = userdao.voterRegistration(newVoter);
				//7. Link provided for user to get back to login page after successful signUp
				pw.print("<h5>Registration Successful, Click <a href='./login/login.html'>here</a> to Login");
			}
			else {
				//8. Link provided for user to retry signUp after unsuccessful signUp
				pw.print("<h5> Invalid Registration, Age should be 21 or above. Click <a href='./voterRegistration/voter_registration.html'>here</a> to Retry");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void destroy() {
		try {
			userdao.cleanUp();
		}
		catch(Exception e) {
			System.out.println("err in destroy of"+getClass());
		}
		
	}

}
