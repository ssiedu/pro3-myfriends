package com.ssi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveFriend
 */
public class RemoveFriend extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id=request.getParameter("id");
		FriendDAO dao=new FriendDAO();
		dao.removeById(id);
		response.sendRedirect("ShowAllFriends");
	}

}
