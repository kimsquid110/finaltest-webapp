<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    (function() {
        const successCode = '${ requestScope.successCode }';

        let successMessage = '';
        let movePath = '';

        switch(successCode) {
            case 'insertPlayer' :
                successMessage = '신규 선수 등록 성공!';
                movePath = '${pageContext.servletContext.contextPath}/player/list';
                break;
            case 'updatePlayer' :
                successMessage = '선수 정보 수정 성공!';
                movePath = '${pageContext.servletContext.contextPath}/player/list';
                break;
            case 'deletePlayer' :
                successMessage = '선수 정보 삭제 성공!';
                movePath = '${pageContext.servletContext.contextPath}/player/list';
                break;
        }

        alert(successMessage);
        location.href = movePath;

    })();
</script>
</body>
</html>
