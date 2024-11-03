package DAO;

import DTO.test_4_DTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class test_4_DAO {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";

    public List<test_4_DTO> getAllCompanies() {
        List<test_4_DTO> companies = new ArrayList<>();
        String query = "SELECT team_id, team_name, parent_team_id, team_level FROM Company";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int teamId = resultSet.getInt("team_id");
                String teamName = resultSet.getString("team_name");
                Integer parentTeamId = resultSet.getObject("parent_team_id", Integer.class);
                int teamLevel = resultSet.getInt("team_level");

                companies.add(new test_4_DTO(teamId, teamName, parentTeamId, teamLevel));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return companies;
    }
}
