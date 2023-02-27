<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-02-21
  Time: 오후 5:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

<html>
<head>
    <title>board</title>
</head>
<body>
<%--<h1>${dto.bSeq}</h1>--%>
<h1>TEST board</h1>

boardList
<c:forEach var="boardList" items="${boardList}">
    <ul>
        <li>${boardList.vSeqId}</li>
        <li>${boardList.bName}</li>
        <li>${boardList.bTitle}</li>
        <li>${boardList.bContent}</li>
        <li>${boardList.bDate}</li>
        <li>${boardList.bRef}</li>
        <li>${boardList.bStep}</li>
        <li>${boardList.bDept}</li>
    </ul>
</c:forEach>

</body>

</html>
