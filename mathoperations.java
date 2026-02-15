import java.util.*;
public class mathoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    System.err.println("Input numbers:" + a + ", " + b);
    System.out.println("Sum: " + (a + b));
    System.out.println("Subtraction: " + (a - b));
    System.out.println("Multiplication: " + (a * b));
    System.out.println("Power: " + Math.pow(a, b));
    System.out.println("Max: " + Math.max(a,b));
    System.out.println("Min: " + Math.min(a, b));
    System.out.println("Square root of a: " + Math.sqrt(a));
    System.out.println("Absolute value of b: " + Math.abs(b));
    System.out.println("Random number: " + Math.random());
}
}