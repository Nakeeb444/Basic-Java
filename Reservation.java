import java.util.*;

class Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ticket Price Details:");
        System.out.println("Children (below 12 years) : 100");
        System.out.println("Adults (12 - 59 years)    : 200");
        System.out.println("Senior Citizens (60+)     : 150");
        System.out.println();

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        int totalAmount = 0;

        System.out.println("Enter ages of passengers:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();

            if (ages[i] < 12) {
                totalAmount += 100;
            } else if (ages[i] >= 60) {
                totalAmount += 150;
            } else {
                totalAmount += 200;
            }
        }

        System.out.println("Total ticket amount: " + totalAmount);

        sc.close();
    }
}