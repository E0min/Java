public class Lab4 {
    public static void main(String[] args) {
        PeriodicElement[] elements = {
                new PeriodicElement(1, "H", "Hydrogen", 1.01, PeriodicElement.State.GAS),
                new PeriodicElement(2, "He", "Helium", 4.00, PeriodicElement.State.GAS),
                new PeriodicElement(3, "Li", "Lithium", 6.94, PeriodicElement.State.SOLID),
                new PeriodicElement(4, "Be", "Beryllium", 9.01, PeriodicElement.State.SOLID),
                new PeriodicElement(5, "B", "Boron", 10.81, PeriodicElement.State.SOLID),
                new PeriodicElement(6, "C", "Carbon", 12.01, PeriodicElement.State.SOLID),
                new PeriodicElement(7, "N", "Nitrogen", 14.01, PeriodicElement.State.GAS),
                new PeriodicElement(8, "O", "Oxygen", 16.00, PeriodicElement.State.GAS),
                new PeriodicElement(9, "F", "Fluorine", 19.00, PeriodicElement.State.GAS),
                new PeriodicElement(10, "Ne", "Neon", 20.18, PeriodicElement.State.LIQUID)
        };

        PeriodicTable ptable = new PeriodicTable(elements); // PeriodicTable 인스턴스 생성
        // 모든 PeriodicElement 출력

        for(PeriodicElement n: elements){
            n.print();
        }


        // for문을 이용하여 int로 find하기
        int n=2;
        for(int i = 0; i<n;i++){
            System.out.println("찾고싶은 원자번호의 번호를 입력하세요: ");
            int elementnumber = Integer.parseInt(UserInput.get());
            ptable.find(elementnumber-1).print();
            System.out.println("\n다음: n\n" +
                    "이전: p\n" +
                    "나가기: q\n" +
                    "계속해서 다른 원자번호 입력: c\n");
            char input = UserInput.getkey();
            if(input == 'q')
                break;
            else if(input == 'n'){
                elements[elementnumber].print();
                n++;}
            else if(input == 'p'){
                elements[elementnumber-2].print();
                n++;}
            else if(input == 'c') // ????????????????????
                n++;
            }

        //while문 이용해서 element로 find하기
        while(true){
            System.out.println("찾고싶은 원자번호의 이름을 입력하세요: ");
            Element E = Element.nameOf(UserInput.get());
            ptable.find(E).print();
            System.out.println("\n다음: n\n" +
                    "이전: p\n" +
                    "나가기: q\n" +
                    "계속해서 다른 원자번호 입력: c\n");
            char input = UserInput.getkey();
            if(input == 'q')
                break;
            else if(input == 'n')
                ptable.find(ptable.find(E).getNumber()+1).print();
            else if(input == 'p')
                ptable.find(ptable.find(E).getNumber()-1).print();
            else if(input == 'c')
                continue;
            else
                System.out.println("범위에 맞는 값을 입력해라 다시!");
        }
        // do-while문을 이용하여 symbol로 찾기

        do{
            System.out.println("찾고싶은 원자번호의 심볼을 입력하세요: ");
            String symbol = UserInput.get();
            ptable.find(symbol).print();
            System.out.println("\n다음: n\n" +
                    "이전: p\n" +
                    "나가기: q\n" +
                   "계속해서 다른 원자번호 심볼 입력: c\n");
            char input = UserInput.getkey();
            if(input == 'q')
                break;
            else if(input == 'n')
                ptable.find(ptable.find(symbol).getNumber()+1).print();
            else if(input == 'p')
                ptable.find(ptable.find(symbol).getNumber()-1).print();
            else if(input == 'c')
                continue;
            else
                System.out.println("범위에 맞는 값을 입력해라 다시!");
        }while(true);

        //State로 원자찾기

        do{
            System.out.println("찾고싶은 상태를 입력하세요: (EX.SOLID,LIQUID,GAS)");

            String string = UserInput.get();
            if(string.contentEquals("SOLID")){
                PeriodicElement.State state = elements[3].getState();
                PeriodicElement [] find =ptable.find(state);
                for (PeriodicElement k:find)
                {
                    k.print();
                }
            }
            System.out.println(
                    "나가기: q\n" +
                    "계속해서 다른 상태 입력: c\n");
            char input = UserInput.getkey();
            if(input == 'q')
                break;
            else if(input == 'c')
                continue;
            else
                System.out.println("범위에 맞는 값을 입력해라 다시!");

        }while(true);






        }

    }


