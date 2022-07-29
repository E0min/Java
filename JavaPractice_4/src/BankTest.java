public class BankTest {
    public static void main(String[] args) {
        Account kakao = new Account("이영민",1000000);

        System.out.println(kakao.name+"의 계좌는 지금 "+kakao.mymoney+"이다.\n");
        Hack.hack(kakao);
        System.out.println(kakao.name+"의 계좌는 지금 "+kakao.mymoney+"이다.");

    }
}
/*접근 제한자가 없는 경우에는 다른 클래스가 와서 값을 바꿀 수 있다.
Account 클래스에서 생성된 객체의 변수 mymoney를 Hack객체가 바꾸지 못하게 하려면 mymoney변수에 private 접근 제한자를 붙이면 된다.
private 접근 제한자는 필드, 생성자, 메소드에 사용 가능하며 선언된 클래스 제외한 모든 외부 클래스에서 접근이 불가능하다.
 */
