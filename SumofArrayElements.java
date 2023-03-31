import java.util.Scanner; 
public class SumofArrayElements { 
  public static void main (String []args){ 
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter Size of the Array: ");
    int value = input.nextInt(); 
    int arrayko[] = new int[value]; 
    int element = 0; 
    int sum  = 0; 
    for (int i = 0; i < value; i++) { 
      System.out.print("Enter element of Array " + i + ": "); 
      element = input.nextInt(); 
      sum += element; 
    }
  System.out.println("Sum of All Elements in the Array: " + sum);
  }
}
