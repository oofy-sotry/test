package CONTROLLER;

import SERVICE.test_7_service;
import DAO.test_7_DAO;
import DTO.test_7_DTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class test_7_controller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private test_7_DAO test_7_DAO = new test_7_DAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        test_7_DTO test_7_DTO = test_7_DAO.getGameModel(session);
        
        test_7_service gameModel = new test_7_service(test_7_DTO);

        String playerChoice = request.getParameter("choice");
        if (playerChoice != null && !test_7_DTO.isGameOver()) {
            gameModel.playRound(playerChoice);
            test_7_DAO.updateGameModel(session, test_7_DTO);
        }

        request.setAttribute("test_7_DTO", test_7_DTO);
        request.getRequestDispatcher("test_7.jsp").forward(request, response);
    }
}
