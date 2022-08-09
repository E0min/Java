import java.util.Scanner;

public class UserInput {
    static String get(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    static Character getkey(){
        Scanner key = new Scanner(System.in);
        String input = key.next();
        if(input.contentEquals("q"))
            return 'q';  //quit
        else if (input.contentEquals("n"))
            return 'n'; // next
        else if(input.contentEquals("p"))
            return 'p'; // previous
        else if(input.contentEquals("c"))
            return 'c'; // continue
        else
            return null;
    }
}
