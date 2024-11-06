<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="DTO.test_7_DTO_v2" %>
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
    <p>총 플레이한 횟수: <%= test_7_DTO.getTurns() %></p>s
    <p>비긴 횟수: <%= test_7_DTO.getTies() %></p>
    <p>승률: <%= String.format("%.2f", test_7_DTO.getWinningPercentage()) %> %</p>
<% } else { %>
    <form method="get" action="game2">
        <h3>당신의 선택:</h3>
        <button type="submit" name="choice" value="가위">가위</button>
        <button type="submit" name="choice" value="바위">바위</button>
        <button type="submit" name="choice" value="보">보</button>
    </form>
    <p>현재 점수: <%= test_7_DTO.getScore() %></p>
    <p>아웃 카운트: <%= test_7_DTO.getOutCount() %>/3</p>
    <p>진행한 횟수: <%= test_7_DTO.getTurns() %></p>
    <p>비긴 횟수: <%= test_7_DTO.getTies() %></p>
    <p>승률: <%= String.format("%.2f", test_7_DTO.getWinningPercentage()) %> %</p>
    <h3>베이스 상황</h3>
    <p>1루: <%= test_7_DTO.getBases()[0] ? "주자 있음" : "빈 베이스" %></p>
    <p>2루: <%= test_7_DTO.getBases()[1] ? "주자 있음" : "빈 베이스" %></p>
    <p>3루: <%= test_7_DTO.getBases()[2] ? "주자 있음" : "빈 베이스" %></p>
<% } %>

</body>
</html>
