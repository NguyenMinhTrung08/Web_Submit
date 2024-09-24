<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Upload File</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f9f9f9;
	margin: 0;
	padding: 20px;
}

.container {
	max-width: 600px;
	margin: auto;
	padding: 20px;
	background-color: white;
	border-radius: 5px;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

.form-group {
	margin-bottom: 15px;
}

input[type="text"], input[type="email"], input[type="file"] {
	width: 100%;
	padding: 10px;
	margin: 5px 0;
	border: 1px solid #ccc;
	border-radius: 4px;
}

button {
	background-color: red;
	color: white;
	padding: 10px 15px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	width: 100%;
}

button:hover {
	background-color: darkred;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Upload File</h2>
		<form action="${pageContext.request.contextPath}/upload" method="post"
			enctype="multipart/form-data">

			<div class="form-group">
				<label for="file">Choose File:</label> <input type="file"
					name="file" id="file" required />
			</div>
			<div>
				<button type="button"
					onclick="location.href='${pageContext.request.contextPath}/update">Update</button>
			</div>
			<div>
				<button type="submit">Upload</button>
			</div>
		</form>
	</div>
</body>
</html>
