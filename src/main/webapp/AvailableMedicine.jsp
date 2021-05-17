<%@page import="in.sakthi.service.MedicineService"%>
<%@page import="java.util.List"%>
<%@page import="in.sakthi.model.Medicine"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Medicine</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Medicines available in our shops</h3>
		<table class="table table-bordered">
		<caption>Medicines name along with  its serial number </caption>
			<thead>
				<tr>
					<th scope="col">S.no</th>
					<th scope="col">Medicine Name</th>
					<%
					List<Medicine> medicines=MedicineService.getMedicines();
					int i=0;
					for(Medicine Medicine:medicines){
						i++;
						%>
			      <tr>
			     <td><%=i%></td>
			     <td><%=Medicine.getName()%></td> 
			     <td><a href="AddMedicineServlet?medicineName=<%=Medicine.getName()%>" class="btn btn-danger">Add</a>
			     </tr>
				 <% } %>
			</thead>
				</table>
				<a href="AddMedicine.jsp" >Add Medicine</a>
	</main>
</body>
</html>