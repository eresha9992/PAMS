
package com.revature.pams.controller;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.revature.pams.DataBaseConnection.DataBaseConnection.Dbconnection;
import com.revature.pams.model.LoginCred;

//import com.revature.pams.DataBaseConnection.DataBaseConnection.Dbconnection;

/**
 * Servlet implementation class LoginSerlvet
 */
@WebServlet("/LoginSerlvet")
public class LoginSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection myCon;
//	private static final Connection connection = null;
	
	LoginCred loginCredentials=new LoginCred();
	 public LoginSerlvet() throws SQLException {
		 System.out.println("comminig");

	    }
//       DbCon con=new DbCon();
//	Dbconnection dbconnection = null;
//	Connection connection = Dbconnection.getConnection();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("comminig");
		String url="jdbc:mysql://localhost:3307/HOSPTIAL";
//    	String username="student";
//    	String Password="student";
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			myCon=DriverManager.getConnection(url, "root", "root");
			System.out.println("connected");
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("not connected");
		}
    	

		loginCredentials.setUsername(request.getParameter("username"));
		System.out.println(request.getParameter("username"));
		loginCredentials.setPassword(request.getParameter("password"));
		System.out.println(request.getParameter("username"));
		HttpSession session=request.getSession(true);
		RequestDispatcher dispatcher;
		try {
			
			PreparedStatement PStm=myCon.prepareStatement(("select * from pams_admin where Admin_Name=? and Admin_password=? "));
			PStm.setString(1, loginCredentials.getUsername());
			PStm.setString(2, loginCredentials.getPassword());
			System.out.println(PStm);
			
			ResultSet rs=PStm.executeQuery();
			if(rs.next()) {
                dispatcher=request.getRequestDispatcher("inner-page.html");
                dispatcher.forward(request, response);
//                System.out.println(rs.getString(1));
              
                if (Objects.isNull(session)) {
                	response.setIntHeader("Refresh", 1);
//					response.sendRedirect("login.jsp");
//					System.out.println("this obj112");
					return;
				}
				session.setAttribute("username", rs.getString(1));
				System.out.println(session.getAttribute("username"));
//				System.out.println(rs.getString(1)+" hidbvkdjvksdnkjn" +rs.getString(2));

			}
            else{
                request.setAttribute("status", "failed");
                System.out.println("not availble");
                dispatcher=request.getRequestDispatcher("signIn.html");
//                            response.sendRedirect("bookappointment.html");
                dispatcher.include(request, response);
//                response.setIntHeader("Refresh", 1);
            }
		} catch (SQLException e)
		{
			e.printStackTrace();
			}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}