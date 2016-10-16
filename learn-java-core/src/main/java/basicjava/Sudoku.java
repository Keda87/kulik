package basicjava;

public class Sudoku {

    /**
     * @param args the command line arguments
     */
    static int[][] x = new int[3][3];

    public void setSolution(int y) {
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                x[i][a] = y;
                y++;
                if (y == 9) {
                    y = 0;
                }
                if (x[i][a] == 0) {
                    x[i][a] = 9;
                }
            }
        }
    }

    public void mySolution() {
        int z = 0;
        for (int m = 0; m < 9; m++) {
            for (int i = 0; i < 3; i++) {
                for (int a = 0; a < 3; a++) {
                    System.out.print(x[z][a]);
                }
                z++;
                if (z == 3) {
                    z = 0;
                }
            }
            System.out.println();
            z++;
            if (z == 3) {
                z = 0;
            }
            if (m == 2) {
                new Sudoku().setSolution(2);
            } else if (m == 5) {
                new Sudoku().setSolution(3);
            }
        }
    }

    public static void main(String[] args) {
        Sudoku j = new Sudoku();
        j.setSolution(1);
        j.mySolution();
    }

}
