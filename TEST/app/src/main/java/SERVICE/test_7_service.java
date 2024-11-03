package SERVICE;

import java.util.Random;

import DTO.test_7_DTO;

public class test_7_service {
    private test_7_DTO test_7_DTO;
    private Random random;

    public test_7_service(test_7_DTO gameDTO) {
        this.test_7_DTO = gameDTO;
        this.random = new Random();
    }

    public void playRound(String playerChoice) {
        String computerChoice = getComputerChoice();
        test_7_DTO.setTurns(test_7_DTO.getTurns() + 1);

        if (playerChoice.equals(computerChoice)) {
            test_7_DTO.setTies(test_7_DTO.getTies() + 1);
            return;
        }

        if (isPlayerWinning(playerChoice, computerChoice)) {
            test_7_DTO.setScore(test_7_DTO.getScore() + 1);
            test_7_DTO.setStrikes(0);
        } else {
            test_7_DTO.setStrikes(test_7_DTO.getStrikes() + 1);
        }

        if (test_7_DTO.getStrikes() >= 2) {
            test_7_DTO.setGameOver(true);
        }
    }

    private String getComputerChoice() {
        String[] choices = {"가위", "바위", "보"};
        int randomIndex = random.nextInt(choices.length);
        return choices[randomIndex];
    }

    private boolean isPlayerWinning(String playerChoice, String computerChoice) {
        return (playerChoice.equals("가위") && computerChoice.equals("보")) ||
        (playerChoice.equals("바위") && computerChoice.equals("가위")) ||
        (playerChoice.equals("보") && computerChoice.equals("바위"));
    }

    public test_7_DTO getGameDTO() {
        return test_7_DTO;
    }
}
