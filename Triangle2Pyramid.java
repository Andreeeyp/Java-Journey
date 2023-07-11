public class Triangle2Pyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int hi = 1; hi <= i * 2 -1; hi++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
