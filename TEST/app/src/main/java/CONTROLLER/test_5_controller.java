package CONTROLLER;

import SERVICE.test_5_service;
import java.util.List;

public class test_5_controller {
    public static void main(String[] args) {
        test_5_service service = new test_5_service();
        int numRows = 20;
        List<List<Integer>> triangle = service.generate(numRows);
        printTriangle(triangle);
    }

    public static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
