<%@page import="com.entity.Expense"%>
<%@page import="com.db.Hibernate"%>
<%@page import="com.dao.ExpenseDao"%>
<%@page import="javax.persistence.Id"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit Expense</title>
<%@include file="../components/all_css.jsp"%>
<style type="text/css">
.card-sh {
	box-shadow: 0 0 6px 0 rgba(0, 0, 0, 0.3);
}
</style>

</head>
<body class="bg-light">

	<c:if test="${empty loginuser }">
		<c:redirect url="../login.jsp"></c:redirect>

	</c:if>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	ExpenseDao dao = new ExpenseDao(Hibernate.getSessionFactory());
	Expense ex = dao.getExpensebyId(id);
	%>

	<%@include file="../components/navbar.jsp"%>
	<div class="container p-5">
		<div class="row">
			<div class=" col-md-6 offset-md-4">
				<div class="card">
					<div class="card-header text-center">
						<p class="fs-3">Edit Expense</p>
						<c:if test="${not empty msg }">
							<p class="text-center text-success fs-4">${msg}</p>
							<c:remove var="msg" />
						</c:if>

					</div>
					<div class="card-body">
						<form action="../updateExpense" method="post">
							<div class="mb-3">
								<label>Title</label> <input type="text" name="title"
									value="<%=ex.getTitle()%>" class="form-control">

							</div>
							<div class="mb-3">
								<label>Date</label> <input type="date" name="date"
									value="<%=ex.getDate()%>" class="form-control">

							</div>
							<div class="mb-3">
								<label>Time</label> <input type="time" name="time"
									value="<%=ex.getTime()%>" class="form-control">

							</div>
							<div class="mb-3">
								<label>Description</label> <input type="text" name="description"
									value="<%=ex.getDescription()%>" class="form-control">

							</div>
							<div class="mb-3">
								<label>Price</label> <input type="text" name="price"
									value="<%=ex.getPrice()%>" class="form-control">

							</div>
							<input type="hidden" name="id" value="<%=ex.getId()%>">
							<button class="btn btn-success col-md-12">Update</button>



						</form>

					</div>


				</div>


			</div>


		</div>
	</div>

</body>
</html>