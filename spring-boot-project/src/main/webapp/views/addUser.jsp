<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Add User</title>

</head>

<body>

	<div class="container p-3 my-3 border">

		<h3>Add User</h3>

		<form action="postUser" method="post">

			<div class="form-group">
				<label for="exampleInputEmail1">Name</label> <input type="text"
					class="form-control" name="name" id="name"
					aria-describedby="emailHelp" placeholder="Enter Name">
			</div>

			<div class="form-group">
				<label for="exampleInputPassword1">City</label> <input type="text"
					class="form-control" name="city" id="city"
					placeholder="Enter City">
			</div>

			<button type="submit" class="btn btn-primary">Save</button>

		</form>

	</div>
</body>
</html>