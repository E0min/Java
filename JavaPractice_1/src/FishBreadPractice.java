public class FishBreadPractice {
    public static void main(String[] args) {
        FishBread[] breads = new FishBread[4];
        breads[0] = new FishBread("팥");
        breads[1] = new FishBread("슈크림");
        breads[2] = new FishBread("초코");
        breads[3] = new FishBread("고구마");

        for (int i = 0; i < breads.length; i++) {
            System.out.printf("%s 붕어빵 음~ 야미굿!\n", breads[i].name);
        }
        System.out.println("붕어빵 갯수" + FishBread.count);

    }
}
/* static 키워드가 붙은 클래스 변수와 인스턴스 변수의 차이점
클래스의 멤버 변수는 인스턴스 변수와 클래스 변수로 나눌 수 있다. 인스턴스 변수는 각 객체마다 가지는 변수이며
인스턴스 생성 시 메모리에 변수 할당이 된다. 따라서 각각의 인스턴스(객체)마다 고윳값을 가진다.
하지만 static 키워드가 붙은 클래스 변수는 앞으로 파생될 모든 인스턴스들이 공유하여 가지는 값이며 클래스 로딩될 때
생성된다. 인스턴스 변수같은 경우에는 인스턴스 생성시 메모리에 변수 할당이 되므로 객체를 생성해야지 접근 할 수 있는 반면
클래스 변수는 클래스가 메모리에 로딩시 생성되므로 (클래스명). 과 같은 형태로 접근할 수 있다.

 */

