<%@page import="java.sql.*" %>
<%

Class.forName("org.postgresql.Driver");
Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/tydb88","postgres","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from customer");
%>
<table border="1" width="40%">
<tr> <th>Customer No</th>
<th>Name</th>
<th>Address</th> </tr>
 <%
 while(rs.next())
  { %>
   <tr>
   <td><%= rs.getInt("cno") %></td>
	<td><%= rs.getString("cname") %></td>
 	<td><%= rs.getString("cadd") %> </tr>
 	<%
}

%>
</table>
