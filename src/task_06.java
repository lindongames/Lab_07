public class task_06 {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                if (col > 1) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
