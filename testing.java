
public class testing
{
    public static void main(String[] args) {
        String [][] gwaps = {{"Mark", "Andrey"},
                {"David", "Blake"}};
        for(int i = 0; i < gwaps.length; i++){
            for (int j = 0; j < gwaps[0].length; j++){
                if(gwaps[i][j].equals("David")){
                    System.out.println("I found him");
                }
            }
        }
    }
}