package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/candidate_list")
public class CandidateList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. set response content type
		response.setContentType("text/html");

		// 2. get PW to send text
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5>Candidate List Page");

			// 3. Read cookies from the request headerF
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie c : cookies) {
					pw.print("<h5> User Details" + c.getValue() + "</h5>");
					break;
				}
			} else {
				pw.print("<h5>No Cookies!!!</h5>");
			}
		}
	}
}
