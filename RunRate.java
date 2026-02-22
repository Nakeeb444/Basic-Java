import java.util.*;

class RunRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of balls remaining: ");
        int balls = sc.nextInt();

        System.out.print("Enter number of runs to score: ");
        int runs = sc.nextInt();

        double requiredRunRate = (runs * 6.0) / balls;

        System.out.println("Required Run Rate: " + requiredRunRate);

        sc.close();
    }
}