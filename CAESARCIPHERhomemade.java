import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        Scanner brief = new Scanner (System.in); 
        String besh = brief.nextLine(); 
        String upp = besh.toUpperCase();
        String stored = "";
        for (int i = 0; i < upp.length(); i++) { 
            char letter = upp.charAt(i); 
            boolean noob = Character.isAlphabetic(letter) ; 
            if (noob == true) { 
            char shiftedChar = (char) (((letter - 'A' + 7) %26 ) + 'A'); 
            stored += shiftedChar; 
            }
            else if ( letter == ' ') { 
                stored += ' ';
            }
            else if (noob == false) { 
                stored += letter;
        }
    }
            System.out.println(stored); 
}
}
