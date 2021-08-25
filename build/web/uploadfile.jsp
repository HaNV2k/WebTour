
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload file</title>
</head>
<body>
	<div>
		<h1>Upload image for tour</h1>
		<form action="${pageContext.request.contextPath}//UploadFileController?image=${image}" method="post" enctype="multipart/form-data" >
			<label>Upload image : </label>
			<input type="file" value="Upload file" name="hinhanh"  /> <br />
			<input type="submit" value="Submit" name="thuchien"  />
		</form>
	</div>
</body>
</html>