import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        int n = data.length;

        double mean = calculateMean(data, n);
        System.out.println("Mean: " + mean);

        double median = calculateMedian(data, n);
        System.out.println("Median: " + median);

        double stdDev = calculateStandardDeviation(data, mean, n);
        System.out.println("Standard Deviation: " + stdDev);
    }

    public static double calculateMean(int[] data, int n) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / n;
    }

    public static double calculateMedian(int[] data, int n) {
        Arrays.sort(data); // Sort the array
        if (n % 2 == 0) {
            return (data[n / 2 - 1] + data[n / 2]) / 2.0;
        } else {
            return data[n / 2];
        }
    }

    public static double calculateStandardDeviation(int[] data, double mean, int n) {
        double sumSquaredDiff = 0;
        for (int num : data) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiff / n);
    }
}
    