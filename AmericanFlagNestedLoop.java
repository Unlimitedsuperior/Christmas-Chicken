public class AmericanFlagNestedLoop {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 17; j++) {
                if (i < 3) {
                    if (j < 7) {
                        System.out.print("*");
                    } else {
                        System.out.print("=");
                    }
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
