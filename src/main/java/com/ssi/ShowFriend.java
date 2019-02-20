package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

/**
 * Servlet implementation class ShowFriend
 */
public class ShowFriend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fcode=request.getParameter("fcode");
		Session session=Data.getSF().openSession();
		Friend f=session.get(Friend.class, fcode);
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Friend Details</h3>");
		out.println("<table border=2>");
		out.println("<tr>");
		out.println("<td>Name</td>");
		out.println("<td>"+f.getFname()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Address</td>");
		out.println("<td>"+f.getAddress()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Mobile</td>");
		out.println("<td>"+f.getMobile()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Email</td>");
		out.println("<td>"+f.getEmail()+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<hr>");
		out.println("<h5><a href=search.jsp>Search-More</a></h5>");
		out.println("<h5><a href=index.jsp>Home</a></h5>");
		out.println("</body>");
		out.println("</html>");
		session.close();
		out.close();
		
	}

}
