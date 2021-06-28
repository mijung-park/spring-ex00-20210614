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
<h3>
<%= Math.random() %>
</h3>
<div class="container">
	<script>
	$(function() {
		$("#btn1").click(function() {
			console.log("click btn1");
			$.ajax("${appRoot}/rest06/sub01");
		})
		
		$("#btn11").click(function() {
			$.ajax({
				url: "${appRoot}/rest06/sub01"
			})
		})
	})
	</script>
	<button id="btn1">BUTTON1</button>
	<button id="btn11">BUTTON1-1</button>
	
	<script>
	$(function() {
		$("#btn2").click(function() {
			var jqXHR = $.ajax("${appRoot}/rest06/sub02");
			jqXHR.done(function(data) {
				console.log("btn2 done function");
				console.log(data);
			});
		});
	});
	</script>
	
	<button id="btn2">BUTTON2</button>
	
	<script>
	$(function() {
		$("#btn3").click(function() {
			$.ajax("${appRoot}/rest06/sub02").done(function(res) {
				console.log("btn3 done function");
				console.log(res);
			});
		});
		
		$("#btn31").click(function() {
			$.ajax({
				url : "${appRoot}/rest06/sub02",
				success : function(res) {
					console.log("btn3-1 success function");
					console.log(res);
				}
			})
		})
	});
	</script>
	<button id="btn3">BUTTON3</button>
	<button id="btn31">BUTTON3-1</button>
	
	<script>
	$(function() {
		$("#btn4").click(function() {
			$.ajax("${appRoot}/rest06/sub04")
			.done(function() {
				console.log("성공쓰!!!!");
			})
			.fail(function() {
				console.log("실패쓰!!!! from btn4 fail");
			})
		});
		
		$("#btn41").click(function() {
			$.ajax ({
				url : "${appRoot}/rest06/sub04",
				error : function() {
					console.log("실패쓰!!!! from btn4-1 error option")
				}
			});
		});
	});
	</script>
	<button id="btn4">BUTTON4</button>
	<button id="btn41">BUTTON4-1</button>	
	
	<script>
	$(function() {
		$("#btn5").click(function() {
			$.ajax({
				url: "${appRoot}/rest06/sub05",
				type: "delete" // method로 교체가능
			});
		});
	})
	</script>
	<button id="btn5">BUTTON5</button>
	
</div>
</body>
</html>