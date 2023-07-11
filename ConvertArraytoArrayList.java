import java.util.ArrayList;
public class ConvertArraytoArrayList {
    public static void main(String[] args) {
        int x[][] = {{1, 2, 5, 8}, {19, 11, 7}};
        arr(x);
    }

    public static void arr(int[][] arr) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                lst.add(arr[i][j]);
            }
        }
        int[] str = new int[lst.size()];
        for (int i = 0; i < str.length; i++) {
            str[i] = lst.get(i);
            System.out.print(str[i] + " ");
        }
    }


}
