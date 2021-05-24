<%@page import="java.util.Map"%>
<%@page import="in.sakthi.service.MedicineService"%>
<%@page import="java.util.List"%>
<%@page import="in.sakthi.model.Medicine"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add a Medicine</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Medicines available in our shops</h3>
		<table class="table table-bordered">
		<caption>Medicines name List </caption>
			<thead>
				<tr>
					<th scope="col">S.no</th>
					<th scope="col">Medicine Name</th>
					<%
					Map<Integer,String>Medicine=MedicineService.getMedicines();
					int i=0;
					for(Integer serialNo:Medicine.keySet()){
						String medicineName=Medicine.get(serialNo);
						i++;
						%>
			      <tr>
			     <td><%=i%></td>
			     <td><%=medicineName%></td> 
			     <td><a href="DeleteMedicineServlet?medicineName=<%=medicineName%>"class="btn btn-danger">Delete</a>
			     </tr>
				 <% } %>
			</thead>
				</table>
				<a href="AddMedicine.jsp" >Add Medicine</a>
	</main>
</body>
</html>