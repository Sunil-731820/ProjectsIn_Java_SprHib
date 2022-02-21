<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
      <table border="10" align="center">
        	<tr>
        		<th>Account number</th>
        		<th>first Name</th>
        		<th>last Name </th>
        		<th>City </th>
        		<th>State</th>
        		<th>Amount </th>
        		<th>CheqFacil</th>
        		<th>AccountType</th>
        		<th>Status</th>
        		<th>DateOfOpen</th>
        	</tr>
        	<c:forEach var="bank" items="${listBank}">
        		<tr>
        			<td>${bank.accountNo} </td>
        			<td>${bank.firstName}</td>
        			<td>${bank.lastName}</td>
        			<td>${bank.city}</td>
        			<td>${bank.state}</td>
        			<td>${bank.amount}</td>
        			<td>${bank.cheqFacil}</td>
        			<td>${bank.accountType}</td>
        			<td>${bank.status}</td>
        			<td>${bank.dateOfOpen}</td>
        			<td>
        				<a href="editbank?accountNo=${bank.accountNo}">Edit Details</a>
        			</td>
        			<td>
        				<a href="deletebank?accountNo=${bank.accountNo}">Delete Details</a>
        			</td>
        			
        			
        		</tr>
        	</c:forEach>
        </table>
        <h3><a href="newBankAccount">New bank</a></h3>
        
        
    </body>
</html>
