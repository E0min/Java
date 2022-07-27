import java.util.*;

public class UserInput {

    private static Scanner input = new Scanner(System.in);
    public static double getDouble(){ return Double.parseDouble(input.nextLine());}
    public static int getInteger(){ return Integer.parseInt(input.nextLine());}
    public static int getIntegerBetween(int min, int max){
 // 최솟값, 최댓값 범위를 정해주기
        return 0;
    }

    public static boolean getExitKey(){
        System.out.print("press q-key to exit or enter-key to continue: ");
        String s = input.nextLine();
        if(s.contentEquals("q"))
            return true;
        else
            return false;
    }

}
