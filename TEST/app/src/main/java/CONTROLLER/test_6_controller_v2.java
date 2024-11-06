package CONTROLLER;

import SERVICE.test_6_service_v2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/generateMagicSquare2")
public class test_6_controller_v2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        test_6_service_v2 magicSquareModel = new test_6_service_v2(5);
        request.setAttribute("magicSquareModel", magicSquareModel);
        request.getRequestDispatcher("/WEB-INF/views/test_6_v2.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        test_6_service_v2 magicSquareModel = (test_6_service_v2) request.getAttribute("magicSquareModel");
        int size = magicSquareModel.getSize();
        int[][] userSquare = new int[size][size];
        boolean isCorrect = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String param = request.getParameter("cell_" + i + "_" + j);
                userSquare[i][j] = param != null ? Integer.parseInt(param) : 0;
            }
        }

        isCorrect = magicSquareModel.checkMagicSquare(userSquare);

        request.setAttribute("userSquare", userSquare);
        request.setAttribute("isCorrect", isCorrect);
        request.getRequestDispatcher("/WEB-INF/views/test_6_v2.jsp").forward(request, response);
    }
}
