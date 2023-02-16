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
import com.revature.entity.Receptionist;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name=request.getParameter("R_NAME");
int id=Integer.parseInt(request.getParameter("R_ID"));

System.out.println(id);

String Gender=request.getParameter("R_GENDER");
String Desigination=request.getParameter("R_DESIGINATION");
String DateOfBirth=request.getParameter("R_DATE_OF_BIRTH");
int Age=Integer.parseInt(request.getParameter("R_AGE"));
String ShiftTime=request.getParameter("R_SHIFT_TIME");
String ContactNumber=request.getParameter("R_CONTACT_NUMBER");
String Address=request.getParameter("R_ADDRESS");

		
		
Receptionist receptionist=new Receptionist(name,id,Gender,Desigination,DateOfBirth,Age,ShiftTime,ContactNumber,Address);
System.out.println(receptionist);
ReceptionistDao  dao=new ReceptionistDao(DatabaseConnection.getConnection());
HttpSession session=request.getSession();
boolean f=dao.updateDetails(receptionist);
if(f) {
	session.setAttribute("succMsg","Receptionist details update sucessfully");
	response.sendRedirect("List.jsp");
}else {
	session.setAttribute("errorMsg","Something wrong on server");
	response.sendRedirect("List.jsp");

	}

}
}