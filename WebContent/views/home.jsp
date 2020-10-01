<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap Simple Data Table</title>
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Vendor CSS-->
<link type="text/css"
	href="<c:url value="/assets/vendor/select2/select2.min.css" />"
	rel="stylesheet" media="all">
<link type="text/css"
	href="<c:url value="/assets/vendor/datepicker/daterangepicker.css" />"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link type="text/css" href="<c:url value="/assets/css/main.css" />"
	rel="stylesheet" media="all">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
	$(document).ready(function() {
		$('[data-toggle="tooltip"]').tooltip();
	});
</script>
</head>
<body>
	<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
		<div class="container">
			<div class="table-responsive">
				<div class="card card-5">
					<div class="card-heading">
						<h2 class="title">Class Information</h2>
					</div>
					<div class="card-body-home">
						<div class="table-wrapper">
							<div class="table-title">
								<div class="row">
									<div class="col-sm-12">
										<h2>
											Student <b>Details</b>
										</h2>
									</div>
								</div>
							</div>
							<table class="table table-striped table-hover table-bordered">
								<thead>
									<tr>
										<th>#</th>
										<th>Name <i class="fa fa-sort"></i></th>
										<th>Mail</th>
										<th>Address <i class="fa fa-sort"></i></th>
										<th>Actions</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${students}" var="student">
										<tr>
											<td><c:out value="${student.getId()}" /></td>
											<td><c:out value="${student.getName()}" /></td>
											<td><c:out value="${student.getMail()}" /></td>
											<td><c:out value="${student.getAddress()}" /></td>
											<td>
												<a href="<c:url value="Cap-nhat-thong-tin?id=${student.getId()}" />" class="edit" title="Edit" data-toggle="tooltip"> 
													<i class="material-icons">&#xE254;</i>
												</a> 
												<a href="<c:url value="Trang-chinh?method=delete&id=${student.getId()}" />" class="delete" title="Delete" data-toggle="tooltip"> 
													<i class="material-icons">&#xE872;</i>
												</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<div>
							<a href="<c:url value="Them-moi-sinh-vien" />">
								<button class="btn btn--radius-2 btn--red" type="submit">Add</button>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
