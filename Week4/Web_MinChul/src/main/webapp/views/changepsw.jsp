<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #00b4db, #0083b0);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #fff;
        }
        .container {
            background: #fff;
            color: #333;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 350px;
            max-width: 90%;
            box-sizing: border-box;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
            font-size: 24px;
            color: #333;
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            display: block;
            font-size: 14px;
            margin-bottom: 5px;
            font-weight: 600;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 8px;
            font-size: 16px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 8px;
            background: #28a745;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s;
        }
        input[type="submit"]:hover {
            background: #218838;
        }
        .alert {
            color: #d9534f;
            font-size: 14px;
            margin-top: 10px;
            text-align: center;
        }
        .alert.success {
            color: #5bc0de;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Change Password</h2>
        
        <form action="/Web_MinChul/changepassword" method="post">
            <div class="form-group">
                <label for="uname">Username:</label>
                <input type="text" id="uname" name="uname" placeholder="Enter your username" required>
            </div>
            <div class="form-group">
                <label for="newPsw">New Password:</label>
                <input type="password" id="newPsw" name="newPsw" placeholder="Enter new password" required>
            </div>
            <div>
                <input type="submit" value="Change Password">
            </div>
            <div class="alert">
                <c:if test="${not empty alert}">
                    <p>${alert}</p>
                </c:if>
            </div>
        </form>
    </div>
</body>
</html>
