public class Lab5 {


    public static void main(String[] args) {
        PeriodicElement [] element2 = new PeriodicElement[5]; //PeriodicElement형 객체배열 공간 5개 생성/
        for (PeriodicElement n:element2){
            System.out.println("숫자 기호 이름 무게순으로 원하는 PeriodicElement를 작성하세요");
            UserInput.getPeriodicElement(); //for-each문을 이용해서 생성된 객체 배열 공간에 PeriodicElement 받아서 넣어준다
        }
        for (PeriodicElement n:element2){
            n.toString();
        }

        PeriodicTable ptable2 = new PeriodicTable(element2); // element2를 이용하여 PeriodicTable 인스턴스 생성

        System.out.println("위에 출력된 다섯개의 PE중 바꿀 것의 순서(0~4)와 대신 넣고싶은 PE를 순서 기호 이름 무게 순으로 기입하세요");
        int index = Integer.parseInt(UserInput.get()); // 바꾸고싶은 인덱스 번호 입력 by UserInput 클래스
        PeriodicElement pe = UserInput.getPeriodicElement(); // 바꿀 PeriodicElement값의 입력 by UserInput 클래스
        ptable2.set(index, pe);

    }
}
