import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
     
        
        int revnum = 0;
        int lastdigit;
        
        while (num != 0) {
             lastdigit = num % 10;
            revnum = revnum * 10 + lastdigit;
            num=num/ 10;
        }
        
        System.out.println( revnum);
    }
}
