import java.util.Scanner;

public class Login {
    public boolean login(Account account)  {
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        System.out.println("Username: ");
        userName = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();

        if (account.getUserName().equals(userName)&& account.getPassword().equals(password))  {
            return true;
        }
        else {
            return false;
        }
    }
}
