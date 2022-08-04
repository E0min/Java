import java.util.Scanner;

public class UserInput {

    public static Element getElement(){
        Scanner input = new Scanner(System.in);
        String StringInput = input.nextLine();

        if((StringInput.contentEquals("1"))||(StringInput.contentEquals("HYDROGEN")))
            return Element.HYDROGEN;
        else if((StringInput.contentEquals("2"))||(StringInput.contentEquals("HELIUM")))
            return Element.HELIUM;
        else if((StringInput.contentEquals("3"))||(StringInput.contentEquals("LITHIUM")))
            return Element.LITHIUM;
        else if((StringInput.contentEquals("4"))||(StringInput.contentEquals("BERYLLIUM")))
            return Element.BERYLLIUM;
        else if((StringInput.contentEquals("5"))||(StringInput.contentEquals("BORON")))
            return Element.BORON;
        else if((StringInput.contentEquals("6"))||(StringInput.contentEquals("CARBON")))
            return Element.CARBON;
        else if((StringInput.contentEquals("7"))||(StringInput.contentEquals("NITROGEN")))
            return Element.NITROGEN;
        else if((StringInput.contentEquals("8"))||(StringInput.contentEquals("OXYGEN")))
            return Element.OXYGEN;
        else if((StringInput.contentEquals("9"))||(StringInput.contentEquals("FLOURINE")))
            return Element.FLUORINE;
        else if((StringInput.contentEquals("10"))||(StringInput.contentEquals("NEON")))
            return Element.NEON;
        else
            return null;
    }
    // 처음에는 int IntegerInput = input.nextInt() 로 받았는데 이 경우 입력받을 때 if문 조건부에 선언되어있는 조건의 타입 순서에 맞게 값이 입력되지
    // 않아서 InputMismatchException가 발생했다. 그래서 그냥 둘 다 String으로 받았다.
    public static boolean getExitKey(){
        Scanner input = new Scanner(System.in);
        System.out.print("press q-key to exit or enter-key to continue: ");
        String stringInput = input.next();
        if(stringInput.contentEquals("q"))
            return true;
        else
            return false;
    }
    /*
    switch문과 if문에 대하여
     */
}
