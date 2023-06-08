<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>선수 정보</title>
</head>
<body>
<jsp:include page="../common/header.jsp"/>

선수 코드 : ${ requestScope.selectedPlayer.playerId }<br>
선수 이름 : ${ requestScope.selectedPlayer.playerName }<br>
생년월일 : ${ requestScope.selectedPlayer.birthDate }<br>
포지션 : ${ requestScope.selectedPlayer.position }<br>
상세 정보 : ${ requestScope.selectedPlayer.bio }<br>
연락처 : ${ requestScope.selectedPlayer.contact }<br>
소속 팀 코드 : ${ requestScope.selectedPlayer.teamCode }<br>
활동 상태 : ${ requestScope.selectedPlayer.activeStatus }<br>
</body>
</html>
