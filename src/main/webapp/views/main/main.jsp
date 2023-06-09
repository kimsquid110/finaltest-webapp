<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>선수 정보</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>
<h3>PLAYER_INFO 테이블: PLAYER_ID를 이용하여 선수 정보 조회하기</h3>
<form action="player/select">
    <label>조회할 선수 ID : </label>
    <input type="text" name="playerCode" id="playerCode">
    <button type="submit">조회</button>
</form>

<h3>PLAYER_INFO 테이블: 모든 선수 정보 조회 (활동 중인 선수만 조회) : /player/list (get)</h3>
<button onclick="location.href='${pageContext.servletContext.contextPath}/player/list'">선수 정보 전체 조회하기</button>

<h3>PLAYER_INFO 테이블: 신규 선수 정보 추가 : /player/insert (post)</h3>
<form action="${ pageContext.servletContext.contextPath }/player/insert" method="post">
    선수 이름 : <input type="text" name="playerName"><br>
    데뷔 연도 : <input type="text" name="launchYear"><br>
    선수 포지션 : <input type="text" name="playerRole"><br>
    선수 상세 정보 : <input type="text" name="playerDetail"><br>
    팀 이름 : <input type="text" name="teamName"><br>
    연락처 : <input type="tel" name="contact"><br>
    활동 상태 : <input type="text" name="activeStatus"><br>
    <button type="submit">등록</button>
</form>

<h3>PLAYER_INFO 테이블: 선수 정보 수정 : /player/update (post)</h3>
<form action="${ pageContext.servletContext.contextPath }/player/update" method="post">
    수정할 선수 ID를 입력하세요 : <input type="text" name="playerId"><br>

    선수 이름 : <input type="text" name="playerName"><br>
    데뷔 연도 : <input type="text" name="launchYear"><br>
    선수 포지션 : <input type="text" name="playerRole"><br>
    선수 상세 정보 : <input type="text" name="playerDetail"><br>
    팀 이름 : <input type="text" name="teamName"><br>
    연락처 : <input type="tel" name="contact"><br>
    활동 상태 : <input type="text" name="activeStatus"><br>
    <button type="submit">수정</button>
</form>

<h3>PLAYER_INFO 테이블: 선수 정보 삭제 : /player/delete (post)</h3>
<form action="${ pageContext.servletContext.contextPath }/player/delete" method="post">
    선수 ID : <input type="text" name="playerId"><br>
    <button type="submit">삭제</button>
</form>
</body>
</html>
