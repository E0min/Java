public class FlyTest {
    public static void main(String[] args) {
        Birds birds = new Birds();
        AirPlane airPlane = new AirPlane();
        Rocket rocket = new Rocket();

        Flyable [] flyables = {birds,airPlane,rocket}; // 인터페이스 타입으로 업캐스팅

        for (int i =0;i< flyables.length;i++){
            System.out.println(flyables[i].fly());

        }
    }
}
/* 인터페이스
자식클래스와 부모클래스의 상속관계에서 자식클래스의 타입으로 생성된 객체를 부모타입의 객체로 캐스팅을 할 수 있는 것과 같이
인터페이스에서도 implements된 클래스타입으로 생성된 객체를 인터페이스 타입으로 캐스팅 할 수 있다.
이렇게 같은 부모나 인터페이스를 공유하는 객체들은 업캐스팅을 통해 그룹화가 가능하며, 오버라이딩을 통해 코드를 단순화할 수 있다.
 */
