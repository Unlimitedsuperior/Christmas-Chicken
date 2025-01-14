public class FlagOfNigeriaNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                if (j < 4 || j > 7) {
                    System.out.print("*");
                } else if (j >= 3 && j <= 7) {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
