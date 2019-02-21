package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Servlet implementation class SaveFriend
 */
public class SaveFriend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//read the data
		String fcode=request.getParameter("fcode");
		String fname=request.getParameter("fname");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		//store to DB
		Friend f=new Friend(fcode,fname,address,mobile,email);
		FriendDAO dao=new FriendDAO();
		dao.addFriend(f);
		
		
		/*
		 * Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(f);
		tr.commit();
		session.close();
		*/
		//response
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>My-Friends-App</h3>");
		out.println("<h4>Details Stored</h4>");
		out.println("<h5><a href=addfriend.jsp>Add-More</a><br>");
		out.println("<h5><a href=index.jsp>Home</a><br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

}
