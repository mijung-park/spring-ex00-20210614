<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html>
<head>

<%@ include file="/WEB-INF/subModules/bootstrapHeader.jsp" %>

<title>Insert title here</title>
</head>
<body>
<div class="container">
	<!-- 파일전송은 항상 post로 전달하고 enctype="multipart/form-data"를 꼭 해야함 -->
	<form action="${appRoot }/upload/sub01" method="post" enctype="multipart/form-data">
		fname : <input name="fname" value="mijung" /> <br>
		file : <input type="file" name="myfile" accept="image/*" /> <br>
		<input type="submit">
	</form>
	
	<hr>
	
	<form action="${appRoot }/upload/sub02" method="post" enctype="multipart/form-data">
		name : <input name="name" value="park" /> <br>
		file : <input type="file" name="file" accept="image/*" /> <br>
		<input type="submit">
	</form>
</div>
</body>
</html>