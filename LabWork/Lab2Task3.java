public class Lab2Task3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " * ");
            for (int j = 1; j <= 9; j++) {
                if (i == j) {
                    System.out.print(i * j + "   ");
                } else {
                    System.out.print(i * j + "     ");
                }
            }
            System.out.println();
        }
    }
}
