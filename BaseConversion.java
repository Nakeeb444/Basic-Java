import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);

        String base4 = Integer.toString(number, 4);

        String octal = Integer.toOctalString(number);

        String hexadecimal = Integer.toHexString(number).toUpperCase();

        System.out.println("Binary (Base 2)      : " + binary);
        System.out.println("Base 4               : " + base4);
        System.out.println("Octal (Base 8)       : " + octal);
        System.out.println("Hexadecimal (Base 16): " + hexadecimal);

        sc.close();
    }
}