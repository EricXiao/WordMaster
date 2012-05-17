<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Welcome to WordMaster</title>
</head>
<body>

<c:choose>
<c:when test="${!empty param.loginID}">
  <jsp:forward page="/wordmaster/main.jsp">
    <jsp:param name="userID" value="${param.loginID}"/>
  </jsp:forward>
</c:when>
<c:otherwise>
  <p>Please input login ID.</p>
</c:otherwise>
</c:choose>

</body>
</html>