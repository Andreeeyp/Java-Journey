import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class testingCharArray {
    public static void main(String[] args) {
        int e = 0;
        char[] smiles = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        Scanner input = new Scanner(System.in);
        char inputLetter = ' ';
        for (int i = 0; i < 10; i++) {
            inputLetter = input.nextLine().charAt(0);
            if(inputLetter != smiles[i])
            smiles[i] = inputLetter;
            System.out.println(smiles);
        }
    }
}
//public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    ArrayList<Character> gwapo = new ArrayList<>();
//    for (int i = 0; i < 10; i ++) {
//        char userLetterInput = input.nextLine().charAt(0);
//        gwapo.add(userLetterInput);
//        System.out.println(gwapo);
//    }
//    }
//}