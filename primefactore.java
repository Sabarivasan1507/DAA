import java.util.*;

public class PrimeFactorizationSieve {
    static int[] spf;
    static void sieve(int N) {
        spf = new int[N + 1]; 
        for (int i = 2; i <= N; i++) spf[i] = i; 

        for (int i = 2; i * i <= N; i++) {
            if (spf[i] == i) { // If i is prime
                for (int j = i * i; j <= N; j += i) {
                    if (spf[j] == j) spf[j] = i; 
                }
            }
        }
    }
    static List<Integer> getPrimeFactors(int N) {
        List<Integer> factors = new ArrayList<>();
        while (N > 1) {
            factors.add(spf[N]); 
            N /= spf[N]; 
        }
        return factors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        sieve(N);
        List<Integer> factors = getPrimeFactors(N);

        System.out.println("Prime Factorization: " + factors);
        sc.close();
    }
