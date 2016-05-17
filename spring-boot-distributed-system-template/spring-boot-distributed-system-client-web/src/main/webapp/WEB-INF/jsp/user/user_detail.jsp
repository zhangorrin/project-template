<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="ctx" ></c:set>
<html>
<head>
    <title>用户信息</title>
    <link href="${request.contextPath}/resources/css/user/style.css" rel="stylesheet" type="text/css"/>
</head>
<body style="margin-top:50px;background-color: #dedede">

${userModel.userName}

</body>
</html>
