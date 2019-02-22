package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteFriend extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String fcode=req.getParameter("fcode");
		FriendDAO dao=new FriendDAO();
		dao.removeById(fcode);
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>My-Friends-App</h3>");
		out.println("<h4>Record Removed</h4>");
		out.println("<h5><a href=removefriend.jsp>Remove-More</a><br>");
		out.println("<h5><a href=index.jsp>Home</a><br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
	}

	
	
}
