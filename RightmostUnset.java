import java.util.Scanner;

public class SetRightmostUnset {
    public static int setRightmostUnsetBit(int num) {
        return num | (num + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(setRightmostUnsetBit(number));
        scanner.close();
    }
}
