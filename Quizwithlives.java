import java.util.Scanner;

public class Quizwithlives {
    public static void main (String []args) {

        Scanner input = new Scanner(System.in);
        int lives= 3;
        String answer = "";
        while (lives > 0) {
            System.out.println("What is the center of our Solar System?");
            System.out.print("Answer: ");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase("sun")) {
                break;
            } else lives--;
        }
        if (lives > 0) System.out.println("YOU WON");
        else System.out.println("YOU LOST");
    }
}
