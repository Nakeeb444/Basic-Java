import java.math.BigInteger;
import java.util.*;
public class BigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- BigInteger Calculator ---");
        
        System.out.print("Enter first large number: ");
        BigInteger a = new BigInteger(sc.next());

        System.out.print("Enter second large number: ");
        BigInteger b = new BigInteger(sc.next());

        System.out.println("\nResults:");
        System.out.println("Sum:        " + a.add(b));
        System.out.println("Multiplied: " + a.multiply(b));

        sc.close();
    }
}