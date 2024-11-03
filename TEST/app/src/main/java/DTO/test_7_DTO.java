package DTO;

public class test_7_DTO {
    private int score;
    private int turns;
    private int ties;
    private int strikes;
    private boolean gameOver;

    public test_7_DTO() {
        score = 0;
        turns = 0;
        ties = 0;
        strikes = 0;
        gameOver = false;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public double getWinningPercentage() {
        return turns == 0 ? 0 : (double) score / turns * 100;
    }
}
