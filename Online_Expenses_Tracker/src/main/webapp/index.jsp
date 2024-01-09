<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.db.Hibernate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online_tracker</title>
<%@include file="components/all_css.jsp"%>
<body>
	<%@include file="components/navbar.jsp"%>
	
	
	<div id="carouselExampleControls" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/imgn.jpg" class="d-block w-100" alt="..." height="600px">
			</div>
			<div class="carousel-item">
				<img src="img/ex11.jpg" class="d-block w-100" alt="..." height="600px">
			</div>
			<div class="carousel-item">
				<img src="img/exx1.jpg" class="d-block w-100" alt="..." height="600px">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleControls" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleControls" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
</body>

</html>