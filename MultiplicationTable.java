import java.util.Scanner; 
public class Multiplication Table { 
  public static void main (String []args) {
    Scanner best = new Scanner (System.in); 
    int input = best.nextInt(); 
    int factors = 0; 
    
    for (int i = 1; i <= 10; i++){
      factors = input * i); 
      System.out.println(i + " x " + input + " = " + factors); 
    } 
  }
}
    
