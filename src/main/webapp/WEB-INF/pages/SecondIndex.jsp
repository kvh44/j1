<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Second Index</title>
</head>
<body>
<jsp:include page="include/menu1.jsp" />
<jsp:include page="include/include1.jsp" />


	<c:forEach var="element" items="${map1}">
		<c:out value="${element.key}"/>
		<c:out value="${element.value}"/>
	</c:forEach>
	
	<c:forEach var="user" items="${userList}">
		<c:out value="${user.id}"/>
		<c:out value="${user.username}"/>
		<c:out value="${user.password}"/>
	</c:forEach>


</body>
</html>