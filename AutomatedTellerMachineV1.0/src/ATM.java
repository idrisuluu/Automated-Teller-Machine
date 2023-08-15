import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    public static void atmOperations(Account account) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        int enterCount = 3;

        System.out.println("--Welcome to our bank's ATM system--");
        System.out.println("***User Login***");

        while (enterCount > 0) {
            if (login.login(account)) {
                System.out.println("Login successful...");
                boolean isLoop = true;

                while (isLoop) {
                    mainMenu();
                    System.out.println("Please select the operation you want to do. [1/3]");
                try {
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            account.depositMoney();
                            break;
                        case 2:
                            account.withDrawMoney();
                            break;
                        case 3:
                            isLoop = false;
                            System.out.println("Signing out..");
                            break;
                        default:
                            System.out.println("Invalid Choice.Please select a valid operation.[1/3]");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }

                }
                break;
            } else {
                enterCount--;
                System.out.println("--------------------------------" +
                        "\nLogin failed");
                System.out.println("Number of login attempts left: "
                        + enterCount
                        +
                        "\n--------------------------------");

                if (enterCount == 0) {
                    System.out.println("You have made 3 incorrect login attempts\n" +
                            "Signing out..\n" +
                            "Account blocked please contact customer service");
                    break;
                }
            }
        }
    }

    public static void mainMenu() {
        System.out.println(
                "-----------------------\n" +
                "*** Operations Menu ***\n" +
                        "1- Deposit Money\n" +
                        "2- Withdraw Money\n" +
                        "3- Log out");
    }
}



