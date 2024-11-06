package DTO;

public class test_7_DTO_v2 {
    private int score;
    private int turns;
    private int ties;
    private int strikes;
    private int outCount;
    private boolean[] bases;
    private boolean gameOver;

    public test_7_DTO_v2() {
        this.score = 0;
        this.turns = 0;
        this.ties = 0;
        this.strikes = 0;
        this.outCount = 0;
        this.gameOver = false;
        this.bases = new boolean[3];
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

    public int getOutCount() {
        return outCount;
    }

    public void setOutCount(int outCount) {
        this.outCount = outCount;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean[] getBases() {
        return bases;
    }

    public void resetBases() {
        this.bases = new boolean[3];
    }

    public double getWinningPercentage() {
        return turns == 0 ? 0 : (double) score / turns * 100;
    }
}

