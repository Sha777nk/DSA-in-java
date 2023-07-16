import java.util.Scanner;
public class Recc_5 {


    int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Recc_5 fib = new Recc_5();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        
        if (n <= 0) {
            System.out.println("Invalid input. n must be a positive integer.");
        } else {
            System.out.println("The " + n + "th Fibonacci number is: " + fib.fibonacci(n));
        }
    }
}

