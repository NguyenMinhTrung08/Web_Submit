<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Upload File</title>
    <style>
    
    </style>
</head>
<body>
    <div class="container">
        <h2>Upload File</h2>
        <form action="${pageContext.request.contextPath }/upload" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <input type="file" name="file" required />
            </div>
            <div>
                <button type="submit">Upload</button>
            </div>
        </form>
    </div>
</body>
</html>
