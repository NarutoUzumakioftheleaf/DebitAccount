import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(500);
        System.out.println("Initial Balance: " + account.getBalance());
        Scanner input =new Scanner(System.in);
        System.out.println("Enter amount to be debited");
        int value=input.nextInt();
        account.debit(value); // Should print a warning
       // Should deduct amount
        System.out.println("Remaining Balance: " + account.getBalance());
    }
}
