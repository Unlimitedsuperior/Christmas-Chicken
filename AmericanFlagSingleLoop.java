public class AmericanFlagSingleLoop {
    public static void main(String[] args) {
        String part1 = "* * * * = = = = = = =";
        String part2 = "= = = = = = = = = = =";

        for (int i = 0; i < 3; i++) {
            System.out.println(part1);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(part2);
        }
    }
}
