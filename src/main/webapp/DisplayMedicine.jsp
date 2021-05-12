<%@page import="in.sakthi.DisplayMedicine"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
	<h1> Display Medicine Name</h1>
<table class="table table-bordered">
<thead>
<tr>
<th> Sno</th><th>Medicine Name</tr>
</thead>
<tbody>
    <% 
       List<String> medicines = DisplayMedicine.getMedicines();
	   int i =0;
	   for(String medicine : medicines){
	   i++;				
    %>
		<tr>
		<td><%=i%>
		<td><%=medicine%> </td> 
		</tr>
		<% } %>
</tbody>
</table>
	</main>
	
</body>
</html>