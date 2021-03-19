package com.java.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.web.dao.AlienDao;
import com.java.web.model.Alien;

/**
 * Servlet implementation class GetAlienController
 */
public class GetAlienController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int aid = Integer.parseInt(request.getParameter("aid"));

		AlienDao dao = new AlienDao();
//Getting the data from dao and storing it in a1 Alien object
		Alien a1 = dao.getAlien(aid);
		
//Adding data in request object so that it can carry forward  the data to jsp page
		request.setAttribute("alien", a1);
		
//Calling jsp from servlet		
		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
	}

}
