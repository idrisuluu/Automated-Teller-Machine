import java.util.Scanner;

public class Account {
    private String userName;
    private String password;
    private double balance;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
        this("No information", "No information", 0.0);
    }

    public Account(String userName, String password, double balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money you want to deposit");
        double amount = scanner.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a value greater than 0.");
        }
        if(amount > 20000) {
            System.out.println("You can deposit a maximum of 20,000 TL at once.");
        }
        else {
            balance += amount;
            System.out.println("You have successfully deposit your money. " + " Updated Balance: " + balance);
        }
    }

    public void  withDrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money you would like to withdraw.");
        double amount = scanner.nextInt();

        if (amount > 20000) {
            System.out.println("You can withdraw a maximum of 20000 TL per day.");
        }
        if (balance < 0) {
            System.out.println("you have insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("You have successfully deposit your money. " + "Updated Balance: " + balance);
        }
    }
}
