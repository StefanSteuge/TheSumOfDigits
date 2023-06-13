import java.util.Scanner;

public class ByForLoop {

    public static void main(String[] args) {
        long number, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        number = scanner.nextLong();
        for (sum = 0; number != 0; number /= 10) {
            sum += number % 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
