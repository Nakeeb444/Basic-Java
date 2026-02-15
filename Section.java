import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Percentage: ");
        int percentage = sc.nextInt();

        String section;

        if (percentage >= 90)
            section = "Section 1";
        else if (percentage >= 80)
            section = "Section 2";
        else if (percentage >= 70)
            section = "Section 3";
        else if (percentage >= 60)
            section = "Section 4";
        else
            section = "Section 5";

        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
    }
}
