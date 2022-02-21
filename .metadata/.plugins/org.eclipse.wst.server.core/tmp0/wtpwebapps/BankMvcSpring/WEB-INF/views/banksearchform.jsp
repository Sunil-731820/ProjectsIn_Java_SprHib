<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
        <h1>Edit Details</h1>
        <form:form action="updatebank" method="post" modelAttribute="bank">
        <table border="10" align="center">
             <tr>
                <td>Account No:</td>
                <td><form:input path="accountNo" readonly="readonly" /></td>
            </tr>
            <tr>
                <td>first Name:</td>
                <td><form:input path="firstName" /></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><form:input path="lastName" /></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><form:input path="city" /></td>
            </tr>
            <tr>
                <td>State:</td>
                <td><form:input path="state" /></td>
            </tr>
             <tr>
                <td>Amount:</td>
                <td><form:input path="amount" /></td>
            </tr>
             <tr>
                <td>CheqFacil:</td>
                <td><form:input path="cheqFacil" /></td>
            </tr>
             <tr>
                <td>Account Type:</td>
                <td><form:input path="accountType" /></td>
            </tr>
             <tr>
                <td>Status:</td>
                <td><form:input path="status" /></td>
            </tr>
             <tr>
                <td>Date Of Open :</td>
                <td><form:input path="dateOfOpen" /></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>

</body>
</html>