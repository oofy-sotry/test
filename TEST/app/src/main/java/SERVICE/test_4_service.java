package SERVICE;

import DTO.test_4_DTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test_4_service {
    private Map<Integer, List<test_4_DTO>> companyMap;

    public test_4_service(List<test_4_DTO> companies) {
        companyMap = new HashMap<>();
        for (test_4_DTO company : companies) {
            companyMap.computeIfAbsent(company.getParentTeamId(), k -> new ArrayList<>()).add(company);
        }
    }

    public void printTeamName() {
        printTeamNameClass(null, 0);
    }

    private void printTeamNameClass(Integer parentId, int level) {
        List<test_4_DTO> teams = companyMap.get(parentId);
        if (teams == null) {
            return;
        }

        for (test_4_DTO team : teams) {
            System.out.println(" ".repeat(level * 2) + team.getTeamName());
            printTeamNameClass(team.getTeamId(), level + 1);
        }
    }
}
