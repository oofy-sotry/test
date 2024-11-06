<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="SERVICE.test_6_service_v2" %>
<html>
<head>
    <title>Magic Square</title>
</head>
<body>
<h2>사용자 입력 5x5 매직 스퀘어</h2>
<form method="post" action="generateMagicSquare2">
    <table border="1">
        <%
            test_6_service_v2 magicSquareModel = (test_6_service_v2) request.getAttribute("magicSquareModel");
            int[][] magicSquare = magicSquareModel.getMagicSquare();
            int randomRow = magicSquareModel.getRandomRow();
            int randomCol = magicSquareModel.getRandomCol();

            for (int i = 0; i < magicSquare.length; i++) {
        %>
            <tr>
                <%
                    for (int j = 0; j < magicSquare[i].length; j++) {
                        if (i == randomRow && j == randomCol) {
                %>
                    <td><input type="number" value="1" readonly /></td>
                <%
                        } else {
                %>
                    <td><input type="number" name="cell_<%= i %>_<%= j %>" /></td>
                <%
                        }
                    }
                %>
            </tr>
        <%
            }
        %>
    </table>
    <button type="submit">매직 스퀘어 확인</button>
</form>

<%
    Boolean isCorrect = (Boolean) request.getAttribute("isCorrect");
    if (isCorrect != null) {
        if (isCorrect) {
%>
            <p style="color: green;">축하합니다! 각 행과 열의 합이 올바릅니다.</p>
<%
        } else {
%>
            <p style="color: red;">행 또는 열의 합이 올바르지 않습니다. 다시 시도해보세요!</p>
<%
        }
    }
%>
</body>
</html>
