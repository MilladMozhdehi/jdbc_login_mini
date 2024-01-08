import java.util.Scanner;

public class UserService {
    private final Scanner scanner = new Scanner(System.in);
    public boolean signUp(){

        System.out.print("Please Enter your firstname: ");
        String firstname = scanner.nextLine();

        System.out.print("Please Enter your lastname: ");
        String lastname = scanner.nextLine();

        System.out.print("Please Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Please Enter your password: ");
        String password = scanner.nextLine();
    }

}
