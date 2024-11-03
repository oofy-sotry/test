package SERVICE;

public class test_6_service {
    private int[][] magicSquare;
    private int size;

    public test_6_service(int size) {
        this.size = size;
        this.magicSquare = new int[size][size];
        generateMagicSquare();
    }

    private void generateMagicSquare() {
        int n = size;
        int num = 1;
        int i = 0, j = n / 2;

        while (num <= n * n) {
            magicSquare[i][j] = num++;
            i--;
            j++;

            if (i < 0 && j >= n) {
                i += 2;
                j--;
            } else if (i < 0) {
                i = n - 1;
            } else if (j >= n) {
                j = 0;
            } else if (magicSquare[i][j] != 0) {
                i += 2;
                j--;
            }
        }
    }

    public int[][] getMagicSquare() {
        return magicSquare;
    }
}
