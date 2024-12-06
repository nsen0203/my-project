
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<h3>Complex Form</h3>
	<!-- <div class="alert alert-danger" role="alert">Please Enter Valid details!</div> -->
	<div class="alert alert-danger" role="alert">
	
	<form:errors path="student.*"/>
	
	</div>
	<form action="handleform" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">Your Name</label> <input name="name"
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter name"> <small
				id="emailHelp" class="form-text text-muted">We'll never
				share your email with anyone else.</small>
		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Your Email Id</label> <input
				name="email" type="text" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp"
				placeholder="Enter Email Id">
		</div>

		<div class="form-group">
			<label for="exampleInputPassword1">Your DOB</label> <input
				name="dateOfBirth" type="text" class="form-control"
				id="exampleInputPassword1" aria-describedby="emailHelp"
				placeholder="Enter Date Of Birth dd/mm/yyyy">
		</div>

		<div class="form-group">
			<label for="exampleFormControlSelect1">Select Course</label> <select
				name="courses" class="form-control" id="exampleFormControlSelect1"
				multiple>
				<option>Java</option>
				<option>Pyhton</option>
				<option>C++</option>
				<option>Spring</option>
				<option>Collection Framework</option>
			</select>
		</div>

		<div class="form-group">
			<span>Select Gender</span>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					id="exampleRadios1" value="male"> <label
					class="form-check-label" for="exampleRadios1"> Male </label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					id="exampleRadios2" value="female"> <label
					class="form-check-label" for="exampleRadios2"> Female </label>
			</div>
		</div>

		<div class="form-group">
			<label for="exampleFormControlSelect1">Select Type</label> <select
				name="type" class="form-control" id="exampleFormControlSelect1">
				<option value="oldstudent">Old Student</option>
				<option value="normalstudent">Normal Student</option>
			</select>
		</div>

		<div class="card">
			<div class="card-body">
				<p>Your Address</p>
				<div class="form-group">
					<input name="address.street" type="text" class="form-control"
						placeholder="Enter Street" />
				</div>
				<div class="form-group">
					<input name="address.city" type="text" class="form-control"
						placeholder="Enter City" />
				</div>
			</div>
		</div>

		<div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>

	</form>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>