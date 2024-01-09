import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService = new UserService();
    public void publicMenu(){
        System.out.println("1-SIGN UP");
        System.out.println("2-SIGN IN");
        System.out.println("3-EXIT");
        System.out.print("Choose your number: ");

        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number){
            case 1 -> signUp();
            case 2 -> System.out.println("Sign in");
            case 3 -> System.out.println("Exist");
        }

    }
    public void signUp(){
        userService.signUp();
    }
}
