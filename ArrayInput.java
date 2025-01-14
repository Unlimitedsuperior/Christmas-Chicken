import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a value for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The values you entered are:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
