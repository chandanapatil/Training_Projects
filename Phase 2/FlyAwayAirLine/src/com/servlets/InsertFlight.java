package com.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.Dao;

/**
 * Servlet implementation class InsertFlight
 */
public class InsertFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		String departure=request.getParameter("departure");
		String time=request.getParameter("time");
		String price=request.getParameter("price");
		
		HashMap<String,String> flight=new HashMap<String, String>();
		flight.put("name", name);
		flight.put("from", from);
		flight.put("to", to);
		flight.put("date", departure);
		flight.put("time", time);
		flight.put("price", price);
		
		try {
			Dao dao=new Dao();
			HttpSession session=request.getSession();
			if(dao.insertFlight(flight)) {
				
				session.setAttribute("message", "Flight Added Successfully");
			}
			else {
				session.setAttribute("message", "Invalid Details");
			}
		} catch (ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			System.out.print("error");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("AdminHome.jsp");
		
	}

}
