import java.util.*;
public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) { // negative number
            return false;
        } else if (n == 2) { // two
            return true;
        } else if (n % 2 == 0) { // even number
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) { //n=17;i=3;3<=289;3+=2
            if (n % i == 0) { //17%3==0->return true ,17 is primr number
                return false;
            }
        }
        return true;
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
