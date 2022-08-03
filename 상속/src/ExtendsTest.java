public class ExtendsTest {
    public static void main(String[] args) {

        Newbie player1 = new Newbie("이영민", 70);
        System.out.println(player1.newbieInformation());
        Wizards player2 = new Wizards("이영민", 70 ,60);
        System.out.println("마법사로 전직");
        System.out.println(player2.WizardsInformation());



    }
}
/* 상속
기본형태: class child extends parent
자식 클래스는 부모 클래스의 멤버(private 접근제한자가 붙은 경우에는 사용 불가)를 사용할 수 있다. 하지만
부모 클래스의 생성자는 상속되지 않는다.
자식 클래스의 객체 생성시 부모 클래스의 객체가 먼저 생성된다. 따라서 생성자 또한 부모 클래스가 먼저 생성된다.
부모클래스의 명시적 생성자가 없는경우에는 자동으로 자식 객체의 생성자 첫줄에 super() 키워드가 선언된다.
그러나, 만약 부모클래스의 생성자가 매개변수를 가지는 경우라면 자식클래스는 super() 키워드를 자동 생성하지 않는다.
이 경우에는 자식 객체 생성자 첫줄에 super() 키워드 선언 후 부모 객체 생성자의 매개변수 타입에 맞게 값을 넣어 주어야한다.
혹은, 생성자 오버로딩을 통하여 부모 클래스에 기본 생성자를 생성하는 super() 키워드를 선언해야한다.

 */