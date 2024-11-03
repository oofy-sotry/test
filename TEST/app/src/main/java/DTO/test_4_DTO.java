package DTO;

public class test_4_DTO {
    private int teamId;
    private String teamName;
    private Integer parentTeamId;
    private int teamLevel;

    public test_4_DTO(int teamId, String teamName, Integer parentTeamId, int teamLevel) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.parentTeamId = parentTeamId;
        this.teamLevel = teamLevel;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public Integer getParentTeamId() {
        return parentTeamId;
    }

    public int getTeamLevel() {
        return teamLevel;
    }
}
