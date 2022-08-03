import java.util.Scanner;

public class UserInput {

    public static Element getElement(){
        Scanner input = new Scanner(System.in); // getElement 메소드 외부에 선언시 에러발생한다. 왜??
        int IntegerInput = input.nextInt();
        String StringInput = input.next();
        if((IntegerInput==1)||(StringInput.contentEquals("HYDROGEN")))
            return Element.HYDROGEN;
        else if((IntegerInput==2)||(StringInput.contentEquals("HELIUM")))
            return Element.HELIUM;
        else if((IntegerInput==3)||(StringInput.contentEquals("LITHIUM")))
            return Element.LITHIUM;
        else if((IntegerInput==4)||(StringInput.contentEquals("BERYLLIUM")))
            return Element.BERYLLIUM;
        else if((IntegerInput==5)||(StringInput.contentEquals("BORON")))
            return Element.BORON;
        else if((IntegerInput==6)||(StringInput.contentEquals("CARBON")))
            return Element.CARBON;
        else if((IntegerInput==9)||(StringInput.contentEquals("NITROGEN")))
            return Element.NITROGEN;
        else if((IntegerInput==8)||(StringInput.contentEquals("OXYGEN")))
            return Element.OXYGEN;
        else if((IntegerInput==9)||(StringInput.contentEquals("FLOURINE")))
            return Element.FLUORINE;
        else if((IntegerInput==10)||(StringInput.contentEquals("NEON")))
            return Element.NEON;
        else
            return null;
    }

    /*
    switch문은
     */
}
