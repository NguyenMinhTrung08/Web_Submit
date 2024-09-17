<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Đăng Ký</title>
</head>
<style>
* {
	box-sizing: border-box
}

/* Add padding to containers */
.container {
	padding: 16px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit/register button */
.registerbtn {
	background-color: #04AA6D;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
<body>
	<form action="/Web_MinChul/register" method="post">
		<c:if test="${alert !=null}">
			<h3 class="alert alertdanger">${alert}</h3>
		</c:if>
		<div class="container">
			<h1>ĐĂNG KÝ TÀI KHOẢN</h1>
			<p>Điền vào bảng thông tin dưới đây để đăng ký tài khoản</p>
			<hr>

			<label for="username"><b>Username</b></label> <input type="text"
				placeholder="Enter UserName" name="uname" id="username" required>

			<label for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="psw" id="psw" required>


			<p>
				By creating an account you agree to our <a href="#">Terms &
					Privacy</a>.
			</p>
			<button type="submit" class="registerbtn">Register</button>
		</div>

		<div class="container signin">
			<p>
				Already have an account? <a href="/Web_MinChul/login">Sign in</a>.
			</p>
		</div>
	</form>
</body>
</html>