<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="SERVICE.test_6_service" %>
<html>
<head>
    <title>Magic Square</title>
</head>
<body>
<h2>5x5 Magic Square</h2>
<table border="1">
    <%
        test_6_service magicSquareModel = (test_6_service) request.getAttribute("magicSquareModel");
        int[][] magicSquare = magicSquareModel.getMagicSquare();
        for (int i = 0; i < magicSquare.length; i++) {
    %>
        <tr>
            <%
                for (int j = 0; j < magicSquare[i].length; j++) {
            %>
                <td><%= magicSquare[i][j] %></td>
            <%
                }
            %>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
