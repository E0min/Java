import java.util.*;
public class UserInput {

    private static Scanner input = new Scanner(System.in);
    public static double getDouble(){ return Double.parseDouble(input.nextLine());}
    public static int getInteger(){ return Integer.parseInt(input.nextLine());}
    public static void getIntegerBetween(int min, int max){
        System.out.println(min+"~"+max +" 사이의 원소번호를 입력해주세요");

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
