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
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Add Movie</title>

</head>

<body>

	<div class="container p-3 my-3 border">

		<h3>Add New Movie</h3>

		<form action="postMovie" method="post" enctype="multipart/form-data">

			<div class="form-group">
				<label for="exampleInputEmail1">Name</label> <input type="text"
					class="form-control" name="name" id="name"
					aria-describedby="emailHelp" placeholder="Enter Movie Name">
			</div>

			<div class="form-group">
				<label for="exampleInputEmail1">Release Year</label> <input
					type="text" class="form-control" name="year" id="name"
					aria-describedby="emailHelp" placeholder="Enter Release Year">
			</div>

			<div class="form-group">
				<label for="exampleInputEmail1">Genere</label> <input type="text"
					class="form-control" name="genere" id="name"
					aria-describedby="emailHelp" placeholder="Enter Genere">
			</div>

			<div class="form-group">
				<label for="exampleInputEmail1">Director</label> <input type="text"
					class="form-control" name="director" id="name"
					aria-describedby="emailHelp" placeholder="Enter Director">
			</div>

			<div class="form-group">
				<table>
					<tr>
						<td><form:label path="file">Select a file to upload</form:label></td>
						<td><input type="file" name="file" /></td>
					</tr>
				</table>
			</div>

			<button type="submit" class="btn btn-primary">Save</button>

		</form>

	</div>
</body>
</html>