
public class Lab_2 {
    public static void PeriodicElement(int number){
        System.out.println("PeriodicElement => [number = "+number+", symbol = "+ PTable.getSymbol(number)+", name = "+PTable.getName(number)+", weight = "+PTable.getWeight(number)+ "]");
    }

    public static void main(String[] args) {
        for(int i=1;i<11;i++)
        {
            System.out.print(PTable.getName(i)+" "); // static 예약어가 붙은 메소드, 변수는 객체 생성을 하지 않아도 클래스명.메소드 와 같은 형태로 호출 가능하다.
            System.out.print(PTable.getSymbol(i)+" ");
            System.out.print(PTable.getWeight(i)+"\n");
        }

        String [] elementSymbols = {"H","He","Li","Be","B","C","N","O","F","NE"};
        String [] elementNames = {"수소","헬륨","리튬","베릴륨","붕소","탄소","질소","산소","플루오린","네온"};
        Double [] elementWeights = {1.008, 4.003,5.3941,9.012182,10.811,12.0107,14.0067,15.9994,18.9984,20.1797};

        for(String elementSymbol: elementSymbols){ // for - each 문을 이용한 elementSymbol 의 출력
            System.out.println(elementSymbol);
        }
        int i = 0;
        while(i<10){
            System.out.println(elementNames[i]);
            i++;
        }
        int l = 0;
        do {
            System.out.println(elementWeights[l]);
            l++;
        }while(l<10);

        System.out.println("최솟값과 최대값을 입력해주세요");
        UserInput.getIntegerBetween(1,10);
        do{
            System.out.println("원소번호를 입력하세요");
            int element = UserInput.getInteger();
            PeriodicElement(element);

        }while(!UserInput.getExitKey());
        }
    }



