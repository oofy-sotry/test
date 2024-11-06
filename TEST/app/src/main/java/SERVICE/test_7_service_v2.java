package SERVICE;

import java.util.Random;

import DTO.test_7_DTO_v2;

public class test_7_service_v2 {
    private test_7_DTO_v2 test_7_DTO_v2;
    private Random random;

    public test_7_service_v2(test_7_DTO_v2 gameDTO) {
        this.test_7_DTO_v2 = gameDTO;
        this.random = new Random();
    }

    public void playRound(String playerChoice) {
        String computerChoice = getComputerChoice();
        test_7_DTO_v2.setTurns(test_7_DTO_v2.getTurns() + 1);

        if (playerChoice.equals(computerChoice)) {
            test_7_DTO_v2.setTies(test_7_DTO_v2.getTies() + 1);
            return;
        }

        if (isPlayerWinning(playerChoice, computerChoice)) {
            advanceBases();
        } else {
            test_7_DTO_v2.setOutCount(test_7_DTO_v2.getOutCount() + 1);
            if (test_7_DTO_v2.getOutCount() >= 3) {
                test_7_DTO_v2.setGameOver(true);
            }
        }
    }

    private void advanceBases() {
        boolean[] bases = test_7_DTO_v2.getBases();

        if (bases[2]) {
            test_7_DTO_v2.setScore(test_7_DTO_v2.getScore() + 1);
        }

        bases[2] = bases[1];
        bases[1] = bases[0];
        bases[0] = true;

        test_7_DTO_v2.setStrikes(0);
    }

    private String getComputerChoice() {
        String[] choices = {"가위", "바위", "보"};
        return choices[random.nextInt(choices.length)];
    }

    private boolean isPlayerWinning(String playerChoice, String computerChoice) {
        return (playerChoice.equals("가위") && computerChoice.equals("보")) ||
                (playerChoice.equals("바위") && computerChoice.equals("가위")) ||
                (playerChoice.equals("보") && computerChoice.equals("바위"));
    }
}
