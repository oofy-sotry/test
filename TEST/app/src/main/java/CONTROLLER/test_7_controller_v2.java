package CONTROLLER;

import SERVICE.test_7_service_v2;
import DAO.test_7_DAO_v2;
import DTO.test_7_DTO_v2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game2")
public class test_7_controller_v2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private test_7_DAO_v2 test_7_DAO_v2 = new test_7_DAO_v2();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        test_7_DTO_v2 test_7_DTO_v2 = test_7_DAO_v2.getGameModel(session);
        test_7_service_v2 gameModel = new test_7_service_v2(test_7_DTO_v2);
        String playerChoice = request.getParameter("choice");

        if (playerChoice != null && !test_7_DTO_v2.isGameOver()) {
            gameModel.playRound(playerChoice);
            test_7_DAO_v2.updateGameModel(session, test_7_DTO_v2);
        }

        request.setAttribute("test_7_DTO_v2", test_7_DTO_v2);
        request.getRequestDispatcher("test_7_v2.jsp").forward(request, response);
    }
}
