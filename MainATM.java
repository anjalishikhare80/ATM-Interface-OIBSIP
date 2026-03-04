import java.util.Scanner;

public class MainATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User("admin", 1234);
        ATMOperations atm = new ATMOperations();

        System.out.print("Enter User ID: ");
        String uid = sc.next();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        sc.close();

        if (user.validate(uid, pin)) {
            int choice;
            do {
                System.out.println("\n1.Transaction History");
                System.out.println("2.Withdraw");
                System.out.println("3.Deposit");
                System.out.println("4.Transfer");
                System.out.println("5.Quit");
                System.out.print("Choose option: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> atm.history();
                    case 2 -> atm.withdraw();
                    case 3 -> atm.deposit();
                    case 4 -> atm.transfer();
                    case 5 -> System.out.println("Thank you for using ATM");
                    default -> System.out.println("Invalid choice");
                }
            } while (choice != 5);
        } else {
            System.out.println("Invalid login credentials");
        }
    }
}
