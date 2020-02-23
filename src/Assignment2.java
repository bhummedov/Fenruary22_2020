public class Assignment2 {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int k = i; k < 8; k++) {
                System.out.print("     " + k);
            }
            System.out.println();
        }
        for (int a = 1; a < 8; a++) {
            for (int b = 0; b <7-a; b++) {
                System.out.print("   ");
            }
            for (int c =7-a; c < 8; c++) {
                System.out.print("     "+c);
            }
            System.out.println();
        }
    }
}

