package org.webapp;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// import org.webapp.DisplayData;

/**
 * Servlet implementation class Admission
 */
public class Admission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admission() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("Insertion start-------!!");
		String stname=request.getParameter("stname");
		String rollno=request.getParameter("roll");
		String course=request.getParameter("course");
		String fees=request.getParameter("fees");
		
		DisplayData disp=new DisplayData();
		disp.setName(stname);
		disp.setRollno(rollno);
		disp.setCourse(course);
		disp.setFees(fees);
		RequestDispatcher req = request.getRequestDispatcher("/Welcome.jsp");
		
		request.setAttribute("display", disp);
		req.forward(request, response);

	}

}
