import java.util.Scanner;

class numbdetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Number entered: " + n);

        if (n >= 0)
            System.out.println("Whole number");
        else
            System.out.println("Not a whole number");

        if (n > 0)
            System.out.println("Natural number");
        else
            System.out.println("Not a natural number");

        System.out.println("Rational number");

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println("Prime");
        else if (n > 1)
            System.out.println("Composite");
        else
            System.out.println("Neither prime nor composite");

        System.out.print("Divisors: ");
        if (n == 0) {
            System.out.print("Not defined");
        } else {
            for (int i = 1; i <= Math.abs(n); i++) {
                if (n % i == 0)
                    System.out.print(i + " ");
            }
        }
    }
}
