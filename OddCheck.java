import java.util.Scanner;

public class OddCheck {
    public static boolean isOdd(int num) {
        return (num & 1) != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(isOdd(number));
        scanner.close();
    }
}
