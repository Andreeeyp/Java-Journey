import java.util.Scanner; 
public class Reverseprint { 
public static void main (String[] args) { 
Scanner input = new Scanner(System.in);
System.out.print("Enter String: "); 
String phrase = input.nextLine(); 
String reverse  = ""; 
for (int i = phrase.length() - 1; i >= 0; i--){ 
reverse += phrase.charAt(i); 
    }
System.out.println("Reverse of the String is " + reverse); 
  }
}
