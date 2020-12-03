<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<title>Movie Database</title>
</head>
<body>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>

	<div class="container">

		<ul class="nav">
			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/login">Login</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/movies">Movies</a>
			</li>
		</ul>

	</div>

	<div class="container">

		<div class="row justify-content-center">
			<h1>Welcome to Movie Database !!</h1>
		</div>

	</div>

<div class="container p-3">

 <div class="card-columns">

	<c:forEach items="${movie}" var="movieObj">

				<div class="card bg-light text-dark" style="width: 18rem;">

					<img class="card-img-top"
						src="https://cdn.dribbble.com/users/2264632/screenshots/6708631/final.gif"
						alt="Card image cap" width="100" height="200" >

					<div class="card-body">

						<h5 class="card-title">${movieObj.name }</h5>

						<p class="card-text">Movie Description. Lorem Ipsum is simply
							dummy text of the printing and typesetting industry.</p>

						<!-- <a href="#" class="btn btn-primary">Go somewhere</a> -->

					</div>

				</div>

			

	</c:forEach>
	
	</div>
	
		</div>	


</body>

</html>