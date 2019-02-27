<%
	String code=request.getParameter("fcode");
	com.ssi.FriendDAO dao=new com.ssi.FriendDAO();
	com.ssi.Friend friend=dao.searchById(code);
	String fcode=friend.getFcode();
	String fname=friend.getFname();
	String address=friend.getAddress();
	String mobile=friend.getMobile();
	String email=friend.getEmail();
%>
<html>
<body>
<h3>Friend Details</h3>
<hr>
	<table border="2">
		<tr>
			<td>Code</td>
			<td><% out.println(fcode); %></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><% out.println(fname); %></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><% out.println(address); %></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><% out.println(mobile); %></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><% out.println(email); %></td>
		</tr>
	</table>
<hr>
<a href="search.jsp">Search-Again</a><br>
<a href="index.jsp">Home</a>
</body>
</html>