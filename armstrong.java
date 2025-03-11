import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int lastdigit;
        int armno = 0;
        int num;
        int n;

        System.out.println("Enter the number:");
        num = sc.nextInt();

        n = num; 

        while (num > 0) {
            lastdigit = num % 10;
            num = num / 10;
            count = count + 1;
        }

        num = n;

        while (num > 0) {
            lastdigit = num % 10;
            num = num / 10;
            armno = armno + (int) Math.pow(lastdigit, count);
        }

        if (armno == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
