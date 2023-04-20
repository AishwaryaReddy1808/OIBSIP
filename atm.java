import java.util.Scanner;

public class atm
 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("Welcome to the ATM");
        
        // Prompt user to enter PIN
        System.out.print("Please enter the PIN: ");
        int pin = scanner.nextInt();
        
        // Validate PIN
        if (pin != 1234) {
            System.out.println("Invalid PIN. Exiting...");
            return;
        }
        
        // Display main menu
        System.out.println("Main Menu");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        
        // Prompt user for choice
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Your balance is $2000");
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                int amount = scanner.nextInt();
                if (amount > 2000) {
                    System.out.println("Withdrawal amount exceeds balance. Exiting...");
                    return;
                }
                System.out.println("Please take your cash");
                break;
            case 3:
                System.out.print("Enter amount to deposit: ");
                int depositAmount = scanner.nextInt();
                System.out.println("Thank you for your deposit of $" + depositAmount);
                break;
            case 4:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid chocie. Exiting...");
                return;
        }
        
        // Display goodbye message
        System.out.println("visit again to our ATM.bye!");
    }
}
