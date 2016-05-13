<html>
<head>
    <title>用户信息</title>
    <link href="${request.contextPath}/static/css/user/style.css" rel="stylesheet" type="text/css"/>
</head>
<body style="margin-top:50px;overflow: hidden;">

    <#if userModel??>
        <tr style="color:#00ba00;">
            <th colspan="5">${userModel.userName}</th>
        </tr>
    </#if>

</body>
</html>
