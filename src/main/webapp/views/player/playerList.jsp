<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>선수 목록 전체 조회</title>
</head>
<body>
<h1>선수 목록 전체 조회</h1>
<table>
    <tr>
        <th>선수 코드</th>
        <th>선수 이름</th>
        <th>생년월일</th>
        <th>포지션</th>
        <th>상세 정보</th>
        <th>연락처</th>
        <th>소속 팀 코드</th>
        <th>활동 상태</th>
    </tr>
    <c:forEach items="${ requestScope.playerList }" var="player">
        <tr>
            <td>${ player.playerCode }</td>
            <td>${ player.playerName }</td>
            <td>${ player.birthDate }</td>
            <td>${ player.position }</td>
            <td>${ player.bio }</td>
            <td>${ player.contact }</td>
            <td>${ player.teamCode }</td>
            <td>${ player.activeStatus }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
