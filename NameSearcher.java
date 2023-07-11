
import java.util.Scanner;
import java.lang.String;
public class NameSearcher {
    public static void main(String []args){
        String[] names = {"David","Ace","Alenere","John","Clint"};
        Scanner input = new Scanner (System.in);
        String search = input.nextLine();
        for (int i = 0; i < names.length; i++){
            if (names[i].equalsIgnoreCase(search)){
                System.out.println("We found " + names[i]);
                break; }
            else {
                System.out.println(names[i]);
            }
        }
    }
}
