package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class ShowFriendByName extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		
		FriendDAO dao=new FriendDAO();
		List<Friend> flist=dao.searchByName(fname);
		
		
		/*Session session=Data.getSF().openSession();
		//fetching using QBC
		Criteria cr=session.createCriteria(Friend.class);
		Criterion crt=Restrictions.eq("fname", fname);
		cr.add(crt);
		List<Friend> flist=cr.list();*/
		
		/*
		//fetching using HQL
		String hql="from Friend where fname=:nm";
		Query qr=session.createQuery(hql);
		qr.setParameter("nm", fname);
		List<Friend> flist=qr.list();
		*/
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Friends-List</h3>");
		out.println("<table border=2>");
		out.println("<tr>");
		out.println("<th>Name</th><th>Address</th><th>Mobile</th><th>Email</th>");
		out.println("</tr>");
		
		for(Friend f:flist){
			
			out.println("<tr>");
			out.println("<td>"+f.getFname());
			out.println("<td>"+f.getAddress());
			out.println("<td>"+f.getMobile());
			out.println("<td>"+f.getEmail());
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<h5><a href=searchbyname.jsp>Search-More</a></h5>");
		out.println("<h5><a href=index.jsp>Home</a></h5>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
