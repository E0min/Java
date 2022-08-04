import java.util.Scanner;

public class Lab3 {

    static PeriodicElement [] elements = {
            new PeriodicElement(1,"H","수소",1.008),
            new PeriodicElement(2,"He","헬륨",4.003),
            new PeriodicElement(3,"Li","리튬",5.3941),
            new PeriodicElement(4,"Be","베릴륨",9.012),
            new PeriodicElement(5,"B","붕소",10.811),
            new PeriodicElement(6, "C","탄소",12.0107),
            new PeriodicElement(7,"N","질소",14.0067),
            new PeriodicElement(8, "O","산소",15.9994),
            new PeriodicElement(9,"F","플루오린",18.9984),
            new PeriodicElement(10, "Ne","네온",20.17)
    };
    static PeriodicElement getPeriodicElement(PeriodicElement [] array, Element e){
        switch (e){
            case HYDROGEN: return array[0];
            case HELIUM: return array[1];
            case LITHIUM: return array[2];
            case BERYLLIUM: return array[3];
            case BORON: return array[4];
            case CARBON: return array[5];
            case NITROGEN: return array[6];
            case OXYGEN: return array[7];
            case FLUORINE: return array[8];
            case NEON: return array[9];
            default:
        }
        return null;
    }

    public static void main(String[] args) {

        for(PeriodicElement n: elements){
           System.out.println(n.toString());
        }

         for(String n: Element.names()){
            System.out.print(n+"\n");
         }

        for(Element n:Element.values()){
            System.out.println(n);//1. Element 출력
            System.out.println(Lab3.getPeriodicElement(elements,n));//2. PeriodicElement 출력
           System.out.println(State.nameOf(n.toString())); //3. State 출력
        }

        do {
            System.out.println("원자의 풀네임(대문자) 혹은 원자번호를 입력하세요");
            System.out.println(UserInput.getElement());
        }while(!UserInput.getExitKey());

        System.out.println("원자번호 심볼 이름 무게 순서로 입력해주세요");
        Scanner sc = new Scanner(System.in);
        PeriodicElement line;
        line = PeriodicElement.parsePeriodicElement(sc.nextLine());//
        System.out.println(line);
    }
}
 /*
 UserInput클래스에서 Scanenr객체를 static 키워드를 이용하여 선언했더니 오류가 났다. getElement메소드와 getExitKey메소드가 같은 scanner객체를 공유하다보니
Lab3 메인 메소드에서 getElement메소드가 먼저 실행되어 이 때 사용된 입력값이 그대로 getExitKey까지 사용된 것 같다. 그래서 각 메소드 내부에 Scanner 객체를 각각 만들어 주었다.
  */