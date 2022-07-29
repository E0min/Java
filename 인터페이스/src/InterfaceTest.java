public class InterfaceTest {
    public static void main(String[] args) {
        Iphone apple = new Iphone();
        Android samsung = new Android();

        apple.ring("이영민");
        apple.call("이영민");
        apple.sendMessage();
        apple.receiveMessage();
        samsung.call("이영민");
        samsung.ring("이영민");
        samsung.sendMessage();
        samsung.receiveMessage();
        Phone phone = apple; // 인터페이스에서의 업 캐스팅
        Messenger messenger = samsung; // 인터페이스에서의 업 캐스팅, 이 경우 Phone 인터페이스에서 생성한 메소드만 실행이 가능하다.


    }
}

/*
인터페이스
- 자바클래스가 여러 부모 클래스를 상속받을 수 있다면 다양한 동작을 수행할 수 있다는 장점을 가지겠지만, 자바에서는 다중상속을 지원하지 않는다.
대신 인터페이스란 것을 통해 다중상속을 지원합니다. 추상클래스는 추상 메소드, 생성자, 필드, 일반 메소드도 포함될 수 있지만, 인터페이스는 오로지
추상메소드와 상수만 포함 가능합니다.

- 인터페이스는 객체를 어떻게 구성해야하는지 정리한 설계도와 같다.

- 인터페이스는
 */
