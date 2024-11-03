package CONTROLLER;

import DAO.test_4_DAO;
import DTO.test_4_DTO;
import SERVICE.test_4_service;

import java.util.List;

public class test_4_controller {
    public static void main(String[] args) {
        test_4_DAO companyDAO = new test_4_DAO();
        List<test_4_DTO> companies = companyDAO.getAllCompanies();

        test_4_service companyService = new test_4_service(companies);
        companyService.printTeamName();
    }
}
