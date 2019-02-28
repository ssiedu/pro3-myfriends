<%!
	String convert(String s){
		return s.toUpperCase();
    }

%>

<%
	com.ssi.FriendDAO dao=new com.ssi.FriendDAO();
	java.util.List<com.ssi.Friend> flist=dao.getAllFriends();
%>

<html>
<body>
<h3>My-All-Friends</h3>
<hr>
<table border="2">
<tr>
<th>Code</th><th>Name</th><th>Address</th><th>Mobile</th><th>Email</th>
</tr>

<%
	for(com.ssi.Friend f:flist){
		//String fcode=f.getFcode();
		String fname=convert(f.getFname());
		String address=f.getAddress();
		String mobile=f.getMobile();
		String email=f.getEmail();
%>
<tr>
<td><%=convert(f.getFcode())%></td>
<td><%=fname%></td>
<td><%=address%></td>
<td><%=mobile%></td>
<td><%=email%></td>
</tr>
<%
	}
%>
</table>
<hr>
<a href="index.jsp">Home</a>
</body>
</html>
