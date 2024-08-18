import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        String password = "jaya!654";

        while (true) {

            System.out.print("Enter password:");
            String pass = obj.next();

            if (pass.equals(password))
            {
                System.out.println("Password accepted");
                break;
            }
            else
            {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
