<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="ctx" ></c:set>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
    <meta name="description" content="">
    <meta http-equiv="x-dns-prefetch-control" content="on">

    <title>错误</title>
    <style type="text/css">
        html{
            font-size: 18px;
            font-family:Arial, Microsoft Yahei, "微软雅黑", sans-serif;
            color:#333;
            background-color: #0079c0;
            padding: 4%;
            overflow: hidden;
        }
        body{margin:0;}
        .wrap{
            position: relative;
            overflow: hidden;
            background-color: #fff;
            -webkit-border-radius: 10px;
            -moz-border-radius: 10px;
            border-radius: 10px;
            margin-top: 50px;
        }
        .followinfo{
            margin-left: auto;
            margin-right: auto;
            width: 90%;
            margin-top: 120px;
            line-height: 22px;
            font-size: 13px;
            text-align: center;
            margin-bottom: 40px;
        }
        .followcode{
            margin-left: auto;
            margin-right: auto;
            width: 90%;
            line-height: 20px;
            font-size: 14px;
            text-align: center;
        }
        .follwwarning{
            width: 90px;
            height: 90px;
            margin-left: auto;
            margin-right: auto;
            margin-top: 40px;
        }
        .signoktext{
            font-size: 18px;
            text-align: center;
            padding-bottom: 10px;
            margin-left: auto;
            margin-right: auto;
            width: 90%;
            margin-top: 30px;
            font-weight: bold;
            line-height: 24px;
        }
        .blue{
            color: #0079c0;
        }
        button {
            background-color: #0079c0;
            -webkit-border-radius: 0.2rem;
            -moz-border-radius: 0.2rem;
            border-radius: 0.2rem;
            color: #fff;
            cursor: pointer;
            border: 0;
            height: 36px;
            width: 70%;
            font-size: 14px;
        }

        button:hover {
            background-color: #00619a;
            -webkit-border-radius: 0.2rem;
            -moz-border-radius: 0.2rem;
            border-radius: 0.2rem;
            color: #fff;
            cursor: pointer;
            border: 0;
        }
    </style>
</head>

    <div class="signoktext">
        页面加载失败，请稍后再试。
    </div>
</div>
</body>
</html>
