package CONTROLLER;

import SERVICE.test_6_service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/generateMagicSquare")
public class test_6_controller extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        test_6_service magicSquareModel = new test_6_service(5);
        request.setAttribute("magicSquareModel", magicSquareModel);
        request.getRequestDispatcher("magicSquareView.jsp").forward(request, response);
    }
}