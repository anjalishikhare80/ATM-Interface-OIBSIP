import java.util.Scanner;

public class ATMOperations {
    Account account = new Account();
    Transaction transaction = new Transaction();
    Scanner sc = new Scanner(System.in);

    public void withdraw() {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        if (account.withdraw(amt)) {
            transaction.add("Withdrawn: ?" + amt);
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit() {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        account.deposit(amt);
        transaction.add("Deposited: ?" + amt);
        System.out.println("Deposit successful");
    }

    public void transfer() {
        System.out.print("Enter amount to transfer: ");
        double amt = sc.nextDouble();
        if (account.withdraw(amt)) {
            transaction.add("Transferred: ?" + amt);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void history() {
        transaction.show();
    }
}
