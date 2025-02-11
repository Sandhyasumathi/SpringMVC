<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body bgcolor="Silver">
	<center>
		<h1 style='text-align: center'>${msg}</h1>
		<form method="post">
			<table>
				<tr>
					<th>Employee id</th>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<th>Employee name</th>
					<td><input type="text" name="ename"></td>
				</tr>
				<tr>
					<th>Employee city</th>
					<td><input type="text" name="ecity"></td>
				</tr>
				<tr>
					<th>Employee salary</th>
					<td><input type="text" name="esalary"></td>
				</tr>

				<tr>
					
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>