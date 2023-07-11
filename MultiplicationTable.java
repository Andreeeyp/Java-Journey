
public class MultiplicationTable {
    public static void main (String []args) {
        int bases = 10;
        int number = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= bases; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
