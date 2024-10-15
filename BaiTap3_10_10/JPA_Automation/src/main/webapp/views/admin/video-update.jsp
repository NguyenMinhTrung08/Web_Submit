<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="formbold-main-wrapper">
	<div class="formbold-form-wrapper">
		<form
			action="${pageContext.request.contextPath}/admin/video/update"
			method="post" enctype="multipart/form-data" method="post">
			<h2 class="formbold-form-label formbold-form-label-2"
				style="color: #dc3545; text-align: center; font-size: 24px; text-transform: uppercase;">Update
				video</h2>

			<!-- video ID (hidden field) -->
			<input type="text" id="videoid" name="videoid" hidden="hidden"
				value="${vid.videoId}">

			<!-- video Name Field -->
			<div class="formbold-mb-5">
				<label for="videoname" class="formbold-form-label">video
					Name <span style="color: red;">*</span>
				</label> <input type="text" id="videoname" name="videoname"
					placeholder="Enter video name" class="formbold-form-input"
					value="${vid.videoname}" required />
			</div>

			<!-- Image Field -->
			<div class="formbold-mb-5">
				<label for="multiPartServlet" class="formbold-form-label">Image
					<span style="color: red;">*</span>
				</label> <input type="file" name="multiPartServlet" id="multiPartServlet"
					class="formbold-form-input" />
			</div>

			<div class="formbold-mb-5">
				<label for="linkimage" class="formbold-form-label">Link
					Image</label> <input type="text" id="linkimage" name="linkimage"
					placeholder="Enter link image" class="formbold-form-input" />
			</div>

			<!-- active Field (Changed to text input) -->
			<div class="formbold-mb-5">
				<p class="formbold-form-label">
					active <span style="color: red;">*</span>
				</p>
				<div>
					<input type="radio" id="ston" name="active" value="1"
						${vid.active == 1 ? 'checked' : ''}> <label for="ston">Đang
						hoạt động</label>
				</div>
				<div>
					<input type="radio" id="stoff" name="active" value="0"
						${vid.active == 0 ? 'checked' : ''}> <label for="stoff">Khóa</label>
				</div>
			</div>

			<!-- Submit Button -->
			<div style="margin-top: 20px;">
				<button type="submit" class="formbold-btn w-full">Update</button>
			</div>
		</form>
	</div>
</div>

<style>
@import
	url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: "Inter", sans-serif;
}

.formbold-main-wrapper {
	display: flex;
	align-items: center;
	justify-content: center;
	padding: 48px;
}

.formbold-form-wrapper {
	margin: 0 auto;
	max-width: 550px;
	width: 100%;
	background: white;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.formbold-form-label {
	display: block;
	font-weight: 500;
	font-size: 16px;
	color: #07074d;
	margin-bottom: 8px;
}

.formbold-form-input {
	width: 100%;
	padding: 12px 16px;
	border-radius: 6px;
	border: 1px solid #e0e0e0;
	background: white;
	font-weight: 500;
	font-size: 16px;
	color: #6b7280;
	outline: none;
	resize: none;
	margin-bottom: 20px;
}

.formbold-form-input:focus {
	border-color: #6a64f1;
	box-shadow: 0px 3px 8px rgba(0, 0, 0, 0.05);
}

.formbold-btn {
	text-align: center;
	font-size: 16px;
	border-radius: 6px;
	padding: 14px 32px;
	border: none;
	font-weight: 600;
	background-color: #dc3545;
	color: white;
	cursor: pointer;
	width: 100%;
}

.formbold-btn:hover {
	background-color: #c82333;
	box-shadow: 0px 3px 8px rgba(0, 0, 0, 0.05);
}
</style>
