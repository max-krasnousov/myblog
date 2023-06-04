<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <style>
        .profile-wrp,
        .add-post-wrp,
        .add-comment-wrp {
            font-family: 'Open Sans', sans-serif;
            border: 1px solid #5BA1E7;
            background: #B2CDE7;
            border-radius: 10px;
            padding: 30px;
            max-width: 400px;
            margin: 0 auto;
        }
        .add-post-wrp,
        .add-comment-wrp {
            max-width: 800px;
        }
        .d-grid {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
        }
        .text-right {
            text-align: right !important;
        }
    </style>
</head>

<%
    String username=(String)session.getAttribute("current_username");
    String userId=(String)session.getAttribute("current_user_id");
%>

<c:url value='/logout' var="logoutURL"/>
<c:url value='/redirect/add/post' var="addPostURL"/>
<c:url value='/show/profile' var="currentUserURL">
    <c:param name="userId" value="<%=userId%>"/>
</c:url>
<c:url value='/show/post-list' var="postListURL"/>

<header>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav">
                    <li><a href="<c:out value="${postListURL}"/>"><span class="glyphicon glyphicon-home" aria-hidden="true"></span></a></li>


                    <li><a href="<c:out value="${addPostURL}"/>">Create New Post</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="<c:out value="${currentUserURL}"/>"><%=username%></a>
                    </li>
                    <li>
                        <a href="<c:out value="${logoutURL}"/>">Logout</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
