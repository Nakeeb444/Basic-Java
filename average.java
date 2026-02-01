import java.util.Scanner;
public class average
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int num1 = in.nextInt();
	    int num2 = in.nextInt();
	    int num3 = in.nextInt();
		System.out.println("Average="+((num1+num2+num3)/3));
	}
}
