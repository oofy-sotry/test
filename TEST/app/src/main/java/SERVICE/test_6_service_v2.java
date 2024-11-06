package SERVICE;

public class test_6_service_v2 {
    private int[][] magicSquare;
    private int size;
    private int randomRow;
    private int randomCol;

    public test_6_service_v2(int size) {
        this.size = size;
        this.magicSquare = new int[size][size];
        placeRandomOne();
    }

    private void placeRandomOne() {
        Random random = new Random();
        randomRow = random.nextInt(size);
        randomCol = random.nextInt(size);
        magicSquare[randomRow][randomCol] = 1;
    }

    public boolean checkMagicSquare(int[][] userSquare) {
        int targetSum = 65;

        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += userSquare[i][j];
                colSum += userSquare[j][i];
            }
            if (rowSum != targetSum || colSum != targetSum) {
                return false;
            }
        }
        return true;
    }

    public int[][] getMagicSquare() {
        return magicSquare;
    }

    public int getSize() {
        return size;
    }

    public int getRandomRow() {
        return randomRow;
    }

    public int getRandomCol() {
        return randomCol;
    }
}
