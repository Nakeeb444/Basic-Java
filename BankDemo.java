import java.util.Scanner;

class BankAccount {
    String owner;
    double balance;

    BankAccount(String name, double initial) {
        this.owner = name;
        this.balance = initial;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("User", 1000.0);
        String command = "";

        System.out.println("Commands: deposit, withdraw, exit");

        while (!command.equals("exit")) {
            System.out.print("Enter command: ");
            command = sc.next();

            if (command.equals("deposit")) {
                account.deposit(sc.nextDouble());
            } else if (command.equals("withdraw")) {
                account.withdraw(sc.nextDouble());
            }
        }
        sc.close();
    }
}