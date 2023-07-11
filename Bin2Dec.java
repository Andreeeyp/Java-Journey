import java.util.Scanner;
public class Bin2Dec {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        long binary = input.nextLong();
        long power = 0L;
        int sum = 0;
        while (binary != 0) {
            long remainder = binary % 10;
            sum += (int) (remainder * Math.pow(2, power));
            power++;
            binary = binary / 10;
        }
        System.out.println(sum);
    }
}
