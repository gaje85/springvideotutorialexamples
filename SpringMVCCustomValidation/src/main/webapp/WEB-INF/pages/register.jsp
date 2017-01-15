<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form Validation</title>
</head>

<body>
	<h2>Enter below details to Register</h2>
    
	<form:form method="POST" modelAttribute="customer" action="doRegister">
		<table>
			
			<tr>
				<td>Enter your E-mail:</td>
				<td><form:input path="emailId" /></td>
				<td><form:errors path="emailId" cssStyle="color: #ff0000;" /></td>
			</tr>
			
			<tr>
				<td>Enter your Age:</td>
				<td><form:input path="age"/></td>
				<td><form:errors path="age" cssStyle="color: #ff0000;"/></td>
			</tr>
			
			<tr>
				<td>Enter your password:</td>
				<td><form:password path="password"  showPassword="true"/></td>
				<td><form:errors path="password" cssStyle="color: #ff0000;"/></td>
			</tr>
			
				<tr>
				<td>Confirm your password:</td>
				<td><form:password path="confPassword"  showPassword="true"/></td>
				<td><form:errors path="confPassword" cssStyle="color: #ff0000;"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" name="submit" value="Click here to Register"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>