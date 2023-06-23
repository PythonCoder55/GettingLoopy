public class extraCreditQuestion {
    public static void main(String[] args) {
        int width = 7; // Adjust the width of the letter E here

        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();

            for (int j = 0; j < width / 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
