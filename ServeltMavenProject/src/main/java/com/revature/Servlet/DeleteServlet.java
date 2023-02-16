package com.revature.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbcon.DatabaseConnection;
import com.revature.Dao.ReceptionistDao;

@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("R_ID"));
		System.out.println(id);
		ReceptionistDao  dao=new ReceptionistDao(DatabaseConnection.getConnection());
		boolean f=dao.deleteReceptionist(id);
		HttpSession session=request.getSession();
		if(f) {
			session.setAttribute("succMsg","Receptionist details update sucessfully");
			response.sendRedirect("List.jsp");
		}else {
			session.setAttribute("errorMsg","Something wrong on server");
			response.sendRedirect("List.jsp");

			}
		
	}

	

}
