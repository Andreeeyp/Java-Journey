import java.util.Scanner;
public class UsernamePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] usernames = {"David", "Ace", "John"};
        String[] passwords = {"david123", "acelangmalakas", "johnnyboy"};
        System.out.print("Enter Username: ");
        String usernameinput = input.nextLine();
        System.out.print("Enter Password: ");
        String passwordinput = input.nextLine();

        Boolean Exist = false;

        for (int i = 0; i < usernames.length;i++){
            if(usernames[i].equals(usernameinput) && passwords[i].equals(passwordinput)) {
                Exist = true;
            }
        }
        if(Exist) System.out.println("Welcome, " + usernameinput);
        else System.out.println("Account not Found");
    }
}
