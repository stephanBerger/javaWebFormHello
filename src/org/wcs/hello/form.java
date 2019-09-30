package org.wcs.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleHelloServlet
 */
@WebServlet(name = "form", urlPatterns = { "/form" })
public class form extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String time = req.getParameter("time");
		String customMessage = "";
		String[] heure = time.split(":");
		String moment = "";

		int h = Integer.parseInt(heure[0]);
		if (h >= 0 && h <= 12) {
			moment = "Good morning ";
		} else if (h > 12 && h <= 18) {
			moment = "Good afternoon ";
		} else {
			moment = "Good evening ";
		}

		customMessage = moment + name + " " + lastname;
		req.setAttribute("heure", h);
		req.setAttribute("customMessage", customMessage);
		req.getRequestDispatcher("/WEB-INF/customMessage.jsp").forward(req, resp);

	}

}
