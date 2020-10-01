<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Colorlib Templates">
<meta name="author" content="Colorlib">
<meta name="keywords" content="Colorlib Templates">

<!-- Title Page-->
<title>Au Register Forms by Colorlib</title>

<!-- Icons font CSS-->
<link type="text/css"
	href="<c:url value="/assets/vendor/mdi-font/css/material-design-iconic-font.min.css" />"
	rel="stylesheet" media="all">
<link type="text/css"
	href="<c:url value="/assets/vendor/font-awesome-4.7/css/font-awesome.min.css" />"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link type="text/css"
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i"
	rel="stylesheet">

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
</head>

<body>
	<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
		<div class="wrapper wrapper--w790">
			<div class="card card-5">
				<div class="card-heading">
					<h2 class="title">New Student Information</h2>
				</div>
				<div class="card-body">
					<form name="insertNewStudent" method="POST" action="Them-moi-sinh-vien">
						<div class="form-row">
							<div class="name">Fullname</div>
							<div class="value">
								<div class="input-group">
									<input class="input--style-5" type="text" name="name" autofocus />
								</div>
							</div>
						</div>
						<div class="form-row">
							<div class="name">Email</div>
							<div class="value">
								<div class="input-group">
									<input class="input--style-5" type="email" name="mail" />
								</div>
							</div>
						</div>
						<div class="form-row">
							<div class="name">Address</div>
							<div class="value">
								<div class="input-group">
									<input class="input--style-5" type="text" name="address" />
								</div>
							</div>
						</div>
						<div>
							<button class="btn btn--radius-2 btn--red" type="submit">Comfirm</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Jquery JS-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<!-- Vendor JS-->
	<script src="vendor/select2/select2.min.js"></script>
	<script src="vendor/datepicker/moment.min.js"></script>
	<script src="vendor/datepicker/daterangepicker.js"></script>

	<!-- Main JS-->
	<script src="js/global.js"></script>

</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->
