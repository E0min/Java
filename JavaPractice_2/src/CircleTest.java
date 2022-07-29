public class CircleTest {
    public static void main(String[] args) {
        CircleArea.PrintCongratulation();
        CircleArea a = new CircleArea("철판", 6);
        CircleArea b = new CircleArea("자전거 휠", 9);
        CircleArea c = new CircleArea("돌려돌려돌림판", 21);

        CircleArea[] category = {a, b, c};

        for (int i = 0; i < category.length; i++) {
            category[i].PrintArea();
        }

        CircleArea.PrintCongratulation();
    }

}
/* 클래스 메소드와 인스턴스 메소드
클래스 메소드와 인스턴스 메소드는 클래스변수와 인스턴스 변수와의 차이와 비슷하다. 클래스 메소드는 메소드 선언시 static
키워드를 붙인 메소드로 이것 또한 인스턴스 생성을 하지 않고, 클래스명.메소드()와 같은 형식을 통해 불러 올 수 있다.
그러나 인스턴스 생성을 하지 않고 사용하기 때문에 클래스 메소드에는 클래스 변수만 사용 가능하다. 인스턴스 메소드는 클래스변수,
인스턴스 변수 모두 사용가능하다.

그렇다면 static을 언제 붙이면 좋은가?
1. 메소드의 경우: 메소드에서 인스턴스 변수를 사용하지 않을 때 붙인다.
2. 변수의 경우: 객체간 공유하는 변수를 가져야한다면 붙인다.

호출문제
static은 언제나 호출 가능, 인스턴스 메소드/변수는 객체 생성 후 호출가능하다.

 */