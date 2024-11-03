<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="DTO.test_7_DTO" %>
<!DOCTYPE html>
<html>
<head>
    <title>묵찌빠 야구 게임</title>
</head>
<body>
<h1>묵찌빠 야구 게임</h1>

<%
    test_7_DTO test_7_DTO = (test_7_DTO) request.getAttribute("test_7_DTO");
%>

<% if (test_7_DTO.isGameOver()) { %>
    <h2>게임 종료!</h2>
    <p>점수: <%= test_7_DTO.getScore() %></p>
    <p>진행한 횟수: <%= test_7_DTO.getTurns() %></p>
    <p>비긴 횟수: <%= test_7_DTO.getTies() %></p>
    <p>승률: <%= String.format("%.2f", test_7_DTO.getWinningPercentage()) %> %</p>
<% } else { %>
    <form method="get" action="game">
        <h3>당신의 선택:</h3>
        <button type="submit" name="choice" value="가위">가위</button>
        <button type="submit" name="choice" value="바위">바위</button>
        <button type="submit" name="choice" value="보">보</button>
    </form>
    <p>현재 점수: <%= test_7_DTO.getScore() %></p>
    <p>진행한 횟수: <%= test_7_DTO.getTurns() %></p>
    <p>비긴 횟수: <%= test_7_DTO.getTies() %></p>
    <p>승률: <%= String.format("%.2f", test_7_DTO.getWinningPercentage()) %> %</p>
<% } %>

</body>
</html>
