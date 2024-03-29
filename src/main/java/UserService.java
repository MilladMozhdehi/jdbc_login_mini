import java.sql.SQLException;
import java.util.Scanner;

public class UserService {
    private final Scanner scanner = new Scanner(System.in);
    private final UserRepository userRepository = new UserRepository();

    public UserService() throws SQLException {
    }

    public void signUp() throws SQLException {

        System.out.print("Please Enter your firstname: ");
        String firstname = scanner.nextLine();

        System.out.print("Please Enter your lastname: ");
        String lastname = scanner.nextLine();

        System.out.print("Please Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Please Enter your password: ");
        String password = scanner.nextLine();

        User user = new User(firstname, lastname, username,password);
        int result = userRepository.registerUser(user);
        if (result == 1)
            System.out.println(firstname + "you successfully register :");
        else
            System.out.println("something is wrong :");
    }

}
