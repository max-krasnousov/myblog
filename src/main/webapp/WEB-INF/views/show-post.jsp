<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!--- document.getElementById("commentText").value = ""; //or innerText --->
<html>
<head>
    <title>Post Page</title>
    <link rel="shortcut icon" href="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBzdGFuZGFsb25lPSJubyI/Pgo8IURPQ1RZUEUgc3ZnIFBVQkxJQyAiLS8vVzNDLy9EVEQgU1ZHIDIwMDEwOTA0Ly9FTiIKICJodHRwOi8vd3d3LnczLm9yZy9UUi8yMDAxL1JFQy1TVkctMjAwMTA5MDQvRFREL3N2ZzEwLmR0ZCI+CjxzdmcgdmVyc2lvbj0iMS4wIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciCiB3aWR0aD0iMjU2LjAwMDAwMHB0IiBoZWlnaHQ9IjI1Ni4wMDAwMDBwdCIgdmlld0JveD0iMCAwIDI1Ni4wMDAwMDAgMjU2LjAwMDAwMCIKIHByZXNlcnZlQXNwZWN0UmF0aW89InhNaWRZTWlkIG1lZXQiPgoKPGcgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMC4wMDAwMDAsMjU2LjAwMDAwMCkgc2NhbGUoMC4xMDAwMDAsLTAuMTAwMDAwKSIKZmlsbD0iIzAwMDAwMCIgc3Ryb2tlPSJub25lIj4KPHBhdGggZD0iTTkzMCAyNTQyIGMtMzUgLTE5IC01MDQgLTMxNyAtNTkwIC0zNzQgLTU4IC0zOSAtODcgLTc2IC0xMTYgLTE0NgpsLTI0IC01NyAwIC02NzMgYzAgLTczNSAtMiAtNzEyIDU4IC03NzUgMzggLTQwIDEzMiAtODYgMjExIC0xMDMgMTQ1IC0zMCAzNDUKLTEwIDM4NyA0MCAyMiAyNSAyMiAyOCAyNiA1ODMgNiA3NzAgLTIyIDcwMCAzOTggOTgzIDI0OCAxNjcgMjc2IDE4OSAyODcgMjIyCjI0IDc0IC0xNiAxMzggLTg3IDEzOCAtNDAgMCAtODkgLTI4IC0zODUgLTIyNyAtNDA3IC0yNzIgLTUzNiAtMzQzIC02MTkgLTM0MwotNTAgMCAtNzkgMjggLTc5IDc2IDAgNjYgMjQgOTcgMTIzIDE1OSA1MCAzMCAxNTMgOTUgMjI5IDE0NCBsMTM4IDg4IDMxIC0yOQpjNDQgLTM5IDkzIC0zOCAxMzMgMSAyOSAyOSAyOSAzMSAyOSAxNDAgMCAxMDAgLTIgMTEyIC0yMiAxMzYgLTMxIDM1IC04MyA0MgotMTI4IDE3eiIvPgo8cGF0aCBkPSJNMTczMCAyMjAyIGMtNDcgLTIyIC01OTIgLTQwMiAtNjM4IC00NDYgLTYyIC01OCAtODkgLTExMSAtMTAyIC0xOTIKLTcgLTQ3IC0xMCAtMjc5IC04IC03MDAgMyAtNjIzIDMgLTYyOSAyNSAtNjY5IDkxIC0xNzAgMzc0IC0yNDQgNTg0IC0xNTQgNzcKMzQgNzE4IDUxMSA3NTQgNTYyIDEzIDE5IDE1IDExMCAxNSA3MDAgbDAgNjc4IC0yNSAyNCBjLTE4IDE5IC0zNSAyNSAtNjkgMjUKLTQwIDAgLTU0IC04IC0xNDMgLTc1IC02MTIgLTQ2OSAtNjgxIC01MTMgLTgxMyAtNTIzIC02NyAtNCAtNzAgLTQgLTEwMSAyNwotMjYgMjcgLTMxIDM3IC0yNiA2NiAzIDE4IDEzIDQ1IDIyIDU4IDkgMTQgMTA5IDkwIDIyMyAxNzAgMjc1IDE5MiAyNDYgMTc2CjI3NyAxNDcgMzkgLTM3IDEwOCAtMzUgMTQxIDMgMjIgMjYgMjQgMzYgMjQgMTM4IDAgMTA5IDAgMTExIC0yOSAxNDAgLTI5IDI5Ci03NCAzNyAtMTExIDIxeiBtNDQwIC04MDQgbC0xIC05MyAtMjQwIC0xODUgYy0xMzIgLTEwMiAtMjQ0IC0xODYgLTI0OSAtMTg4Ci02IC0yIC0xMCAzMyAtMTAgODcgbDAgOTAgMjQzIDE5MCBjMTMzIDEwNCAyNDUgMTkwIDI1MCAxOTAgNCAxIDcgLTQxIDcgLTkxeiIvPgo8L2c+Cjwvc3ZnPgo=" />
</head>

<%String username=(String)session.getAttribute("current_username");%>

<body>
<jsp:include page="header.jsp" />
<div class="container-fluid">
    <div class="row content my-c">
        <div class="col-xs-12">

            <div class="row">
                <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                    <h3>Post</h3>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="d-grid">
                                <div class="d-grid-col">${post.getPostName()}</div>
                                <div class="d-grid-col">(Posted by: ${postUser.getFullName()})</div>
                                <div class="d-grid-col text-right">(Posted: ${post.getPostDateTime()})</div>
                            </div>
                        </div>
                        <div class="panel-body">
                            ${post.getPostText()}
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                    <h3>Comments</h3>
                    <c:forEach var="c" items="${comments}">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="d-grid">
                                    <div class="d-grid-col">${c.getCommentUser().getFullName()}</div>
                                    <div class="d-grid-col">(Posted: ${c.getComment().getCommentDateTime()})</div>
                                    <div class="d-grid-col text-right">
                                        <c:if test="${not empty c.getComment().getCommentParentId()}">
                                            [Replied to: ${c.getParentUser().getFullName()}]
                                        </c:if>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <c:choose>
                                    <c:when test="${not empty c.getComment().getCommentParentId()}">
                                        <td class="bg-success" colspan="4">${c.getComment().getCommentText()}</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td class="bg-success" colspan="3">${c.getComment().getCommentText()}</td>
                                    </c:otherwise>
                                </c:choose>
                            </div>
                            <div class="panel-heading">
                                <input type="hidden" name="commentId" class="commentId" value="${c.getComment().getCommentId()}">
                                <input type="hidden" name="commentUserName" class="commentUserName" value="${c.getCommentUser().getFullName()}">
                                <button type="button" class="btn btn-primary">Reply</button>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                    <div class="add-comment-wrp">
                        <form class="my" action="<c:url value='/add/comment?postId=${post.getPostId()}' />" method="POST">
                            <div class="form-group">
                                <label for="commentText"><span><%=username%></span></label><span style="display: none" id="replyTo"></span>
                                <textarea name="commentText"
                                          id="commentText"
                                          class="form-control"
                                          cols="46"
                                          rows="10"
                                          maxlength="3900"
                                          placeholder="Enter Comment Text..." required></textarea>
                                <input type="hidden" name="parentId" id="parentId" value="">
                            </div>
                            <button type="submit" class="btn btn-primary">Create Comment</button>
                            <button type="button" class="btn btn-danger" id="btn-cancel">Cancel</button>
                        </form>
                    </div>
                </div>
            </div>


        </div>
    </div>
</div>
<br /><br />
</body>
</html>
<script>
    document.querySelectorAll(".btn-reply").forEach(reply => {
        reply.addEventListener("click", function handleClick(event) {
            document.getElementById("parentId").value = reply.parentNode.querySelector(".commentId").value;
            document.getElementById("replyTo").style.display="inline";
            document.getElementById("replyTo").innerText = " [replays to " + reply.parentNode.querySelector(".commentUserName").value + "]";
        });
    });

    document.querySelectorAll("#btn-cancel").forEach(btnCancel => {
        btnCancel.addEventListener("click", function handleClick(event) {
            document.getElementById("parentId").value = "";
            document.getElementById("replyTo").style.display="none";
            document.getElementById("replyTo").innerText = "";
            document.getElementById("commentText").value = "";
        });
    });
</script>
