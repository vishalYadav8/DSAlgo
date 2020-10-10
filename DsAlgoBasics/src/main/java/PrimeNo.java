import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNo {
    private static boolean isPrime(int x) {
        boolean a = true;
        if (x <= 1) {
            a = false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                a = false;
                break;
            }

        }
        return a;
    }

    private static List<Integer> listOfPrime(int n) {
        boolean prime;
        List<Integer> arrPrime = new ArrayList<Integer>();
        while (n > 0) {
            prime = isPrime(n);
            if (prime) {
                arrPrime.add(n);
            }
            n--;
        }
        return arrPrime;
    }

    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        System.out.print("Please enter the no:");
        int x = util.nextInt();
        boolean a = isPrime(x);
        System.out.println(a);
        System.out.println(listOfPrime(x).toString());

    }
}