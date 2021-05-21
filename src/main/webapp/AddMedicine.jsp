<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>AddMedicine</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
<h1>Add Medicine</h1>
<form action= "AddMedicineServlet" method="Get">
		<label for="medicineName">Medicine Name:</label>
		<input type="text" name="medicineName" placeholder="Enter Medicine Name" required><br> 
        <button>Submit</button>

</form>
</main>
</body>
</html>