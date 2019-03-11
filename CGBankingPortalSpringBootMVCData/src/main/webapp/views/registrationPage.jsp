<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<table align="center">
		<form:form action="openAccount" method="post" modelAttribute="account">
			<tr>
				<td>Savings or Current Account</td>
				<td><form:input path="accountType" size="30" /></td>
				<td><form:errors path="accountType" cssClass="error" />
			</tr>
			<tr>
				<td>Account Balance</td>
				<td><form:input path="accountBalance" size="30" /></td>
				<td><form:errors path="accountBalance" cssClass="error" />
			</tr>
			<tr>
				<td><input type="submit" value="Submit" />
			</tr>
		</form:form>
	</table>
</body>
</html>