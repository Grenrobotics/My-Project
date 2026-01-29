import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 double values (separated by space or newline):");

        double sum = 0.0;
        final int COUNT = 5;

        for (int i = 1; i <= COUNT; i++) {
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a double value:");
                sc.next(); // discard invalid token
            }
            double v = sc.nextDouble();
            sum += v;
        }

        double average = sum / COUNT;
        System.out.printf("Average of %d values = %.4f%n", COUNT, average);
        sc.close();
    }
}
