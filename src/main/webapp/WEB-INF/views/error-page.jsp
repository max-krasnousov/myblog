<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Error</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="shortcut icon" href="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBzdGFuZGFsb25lPSJubyI/Pgo8IURPQ1RZUEUgc3ZnIFBVQkxJQyAiLS8vVzNDLy9EVEQgU1ZHIDIwMDEwOTA0Ly9FTiIKICJodHRwOi8vd3d3LnczLm9yZy9UUi8yMDAxL1JFQy1TVkctMjAwMTA5MDQvRFREL3N2ZzEwLmR0ZCI+CjxzdmcgdmVyc2lvbj0iMS4wIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciCiB3aWR0aD0iMjU2LjAwMDAwMHB0IiBoZWlnaHQ9IjI1Ni4wMDAwMDBwdCIgdmlld0JveD0iMCAwIDI1Ni4wMDAwMDAgMjU2LjAwMDAwMCIKIHByZXNlcnZlQXNwZWN0UmF0aW89InhNaWRZTWlkIG1lZXQiPgoKPGcgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMC4wMDAwMDAsMjU2LjAwMDAwMCkgc2NhbGUoMC4xMDAwMDAsLTAuMTAwMDAwKSIKZmlsbD0iIzAwMDAwMCIgc3Ryb2tlPSJub25lIj4KPHBhdGggZD0iTTkzMCAyNTQyIGMtMzUgLTE5IC01MDQgLTMxNyAtNTkwIC0zNzQgLTU4IC0zOSAtODcgLTc2IC0xMTYgLTE0NgpsLTI0IC01NyAwIC02NzMgYzAgLTczNSAtMiAtNzEyIDU4IC03NzUgMzggLTQwIDEzMiAtODYgMjExIC0xMDMgMTQ1IC0zMCAzNDUKLTEwIDM4NyA0MCAyMiAyNSAyMiAyOCAyNiA1ODMgNiA3NzAgLTIyIDcwMCAzOTggOTgzIDI0OCAxNjcgMjc2IDE4OSAyODcgMjIyCjI0IDc0IC0xNiAxMzggLTg3IDEzOCAtNDAgMCAtODkgLTI4IC0zODUgLTIyNyAtNDA3IC0yNzIgLTUzNiAtMzQzIC02MTkgLTM0MwotNTAgMCAtNzkgMjggLTc5IDc2IDAgNjYgMjQgOTcgMTIzIDE1OSA1MCAzMCAxNTMgOTUgMjI5IDE0NCBsMTM4IDg4IDMxIC0yOQpjNDQgLTM5IDkzIC0zOCAxMzMgMSAyOSAyOSAyOSAzMSAyOSAxNDAgMCAxMDAgLTIgMTEyIC0yMiAxMzYgLTMxIDM1IC04MyA0MgotMTI4IDE3eiIvPgo8cGF0aCBkPSJNMTczMCAyMjAyIGMtNDcgLTIyIC01OTIgLTQwMiAtNjM4IC00NDYgLTYyIC01OCAtODkgLTExMSAtMTAyIC0xOTIKLTcgLTQ3IC0xMCAtMjc5IC04IC03MDAgMyAtNjIzIDMgLTYyOSAyNSAtNjY5IDkxIC0xNzAgMzc0IC0yNDQgNTg0IC0xNTQgNzcKMzQgNzE4IDUxMSA3NTQgNTYyIDEzIDE5IDE1IDExMCAxNSA3MDAgbDAgNjc4IC0yNSAyNCBjLTE4IDE5IC0zNSAyNSAtNjkgMjUKLTQwIDAgLTU0IC04IC0xNDMgLTc1IC02MTIgLTQ2OSAtNjgxIC01MTMgLTgxMyAtNTIzIC02NyAtNCAtNzAgLTQgLTEwMSAyNwotMjYgMjcgLTMxIDM3IC0yNiA2NiAzIDE4IDEzIDQ1IDIyIDU4IDkgMTQgMTA5IDkwIDIyMyAxNzAgMjc1IDE5MiAyNDYgMTc2CjI3NyAxNDcgMzkgLTM3IDEwOCAtMzUgMTQxIDMgMjIgMjYgMjQgMzYgMjQgMTM4IDAgMTA5IDAgMTExIC0yOSAxNDAgLTI5IDI5Ci03NCAzNyAtMTExIDIxeiBtNDQwIC04MDQgbC0xIC05MyAtMjQwIC0xODUgYy0xMzIgLTEwMiAtMjQ0IC0xODYgLTI0OSAtMTg4Ci02IC0yIC0xMCAzMyAtMTAgODcgbDAgOTAgMjQzIDE5MCBjMTMzIDEwNCAyNDUgMTkwIDI1MCAxOTAgNCAxIDcgLTQxIDcgLTkxeiIvPgo8L2c+Cjwvc3ZnPgo=" />
    <style>
        .error-form {
            font-family: 'Open Sans', sans-serif;
            border: 1px solid #E72B1E;
            background: #E7827A;
            border-radius: 10px;
            padding: 30px;
            max-width: 400px;
            margin: 0 auto;
        }
        .login-form h1 {
            margin: 0 0 20px;
        }
        .my-20 {
            margin: 20px 0 0;
        }
        .form-horizontal,
        .my-20 p {
            margin: 0;
        }
        .text-center {
            text-align: center;
        }
    </style>
</head>
<%
    String username=(String)session.getAttribute("current_username");
    String userId=(String)session.getAttribute("current_user_id");
%>
<c:url value='/redirect/login' var="loginURL"/>
<c:url value='/show/profile' var="currentUserURL">
    <c:param name="userId" value="<%=userId%>"/>
</c:url>
<body>
<header>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="<c:out value="${registrationURL}"/>">Registration</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>


<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-xs-12 col-sm-6 col-sm-offset-3">
            <div class="error-form">

                <h1>Error</h1>
                <c:choose>
                <c:when test="${empty ExceptionMessage}">
                <div>
                    <p>Error: ${ExceptionMessage}</p>
                    </c:when>
                    <c:otherwise>
                    <div>
                        <p>Unexpected error!</p>
                        </c:otherwise>
                        </c:choose>
                        <c:choose>
                        <c:when test="${empty current_user_id}">
                        <label>Return to login page: <a href="<c:out value="${loginURL}"/>">Login</a></label>
                    </div>
                    </c:when>
                    <c:otherwise>
                    <label>Return to profile page: <a href="<c:out value="${currentUserURL}"/>"><%=username%></a></label>
                </div>
                </c:otherwise>
                </c:choose>

            </div>

        </div>
    </div>
</div>

</body>
</html>