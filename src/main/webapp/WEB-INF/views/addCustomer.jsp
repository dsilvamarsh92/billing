<!-- 
#-------------------------------------------------------------------------------
# Copyright (C) 2018, Dsilva Software Solutions
# All rights reserved.
# 
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are met:
# 
# 1. Redistributions of source code must retain the above copyright notice,
#    this list of conditions and the following disclaimer.
# 
# 2. Redistributions in binary form must reproduce the above copyright notice,
#    this list of conditions and the following disclaimer in the documentation
#    and/or other materials provided with the distribution.
# 
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
# AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
# IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
# ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
# LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
# CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
# SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
# INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
# CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
# ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
# POSSIBILITY OF SUCH DAMAGE.
#-------------------------------------------------------------------------------
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Billing</title>
</head>
<body>


	<div class="w3-container">
		<form:form modelAttribute="customerModel" method="POST"
			action="saveCustomer">
			<table>

				<tr>
					<td><form:label path="cust_name"  title="Customer name"/>Customer name</td>
					<td><form:input path="cust_name" /></td>
				</tr>
				<tr>
					<td><form:label path="cust_mobile" title="Mobile No"/>Mobile No</td>
					<td><form:input path="cust_mobile" /></td>
				</tr>
				<tr>
					<td><form:label path="cust_address" title="Address"/>Address</td>
					<td><form:input path="cust_address" /></td>
				</tr>
			</table>

			<form:button name="submit" value="submit">SUBMIT</form:button>



		</form:form>




	</div>


	<div class="w3-container">

		<%-- <h3>Display existing customers for testing </h3>	
		<c:choose>
			<c:
		
		</c:choose>
		 --%>



	</div>
${pageContext.servletContext.contextPath}

</body>
</html>
