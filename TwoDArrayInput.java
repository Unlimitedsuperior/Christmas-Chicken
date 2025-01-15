import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] numbers = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Part (a): Accept input and assign values to the 2D array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Enter a value for index [" + i + "][" + j + "]: ");
                numbers[i][j] = scanner.nextInt();
            }
        }

        // Part (b): Use a for-each loop to print the values entered by the user
        System.out.println("The values you entered are:");
        for (int[] row : numbers) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // New line after each row
        }

        scanner.close();
    }
}
