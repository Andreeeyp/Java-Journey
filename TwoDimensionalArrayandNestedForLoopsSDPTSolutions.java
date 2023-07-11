public class TwoDimensionalArrayandNestedForLoopsSDPTSolutions {
    public static void main(String[] args) {
        String users[][] = {
                {"david","david123"},
                {"Alenere", "alenere123"},
                {"Hezel", "hezel123", "mars"},
                {"Jaymar", "jaymar123", "jupiter", "21"}};
        for (int row = 0; row < users.length; row++) {
            for (int col = 0; col < users[row].length; col++) {
                System.out.println(users[row][col]);
            }
            System.out.println();
        }
        /* PRINTING 2D ARRAY USING FOR NESTED FOR EACH LOOP
            for (String user[]:users) {
            for (String info:user) {
            System.out.println(info);
            }
            System.out.println();
         */
    }
}

