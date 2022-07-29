public class Main {

    public static void main(String[] args) {
        Student A = new Student("이영민", 6);
        Teacher a = new Teacher("신진이");
        //객체 A는 name 과 grade 모두에 접근 가능
        System.out.println(A.nametoString());
        System.out.println(A.gradetoString());

        Person B = A; // new 키워드가 없다. 객체가 만들어 진 것이 아니라, B는 A를 가리키는 참조 변수이다. 객체A는 Person을 상속받은 타입이기도 하여 굳이 표기하지 않아도 된다.//
        Person b = a;

        System.out.println(B.nametoString()); // B.gradetoString(); -> 업캐스팅을 하면 부모클래스의 멤버에만 접근이 가능하다.
        System.out.println(((Student)B).gradetoString()); // 다운 캐스팅
        System.out.println( B instanceof Person);// instance of 연산자 => 참조변수가 참조하고 있는 인스턴스가 어떤 클래스인지 구분하는 연산자이다.

        System.out.println(a.Hello()); // 업캐스팅과 오버라이딩을 통한 코드 간편화
        System.out.println(A.Hello());


    }

}
/*
업 캐스팅
자바에서 자식(서브)클래스는 부모(수퍼)클래스가 상속관계 일 때, 자식클래스는 부모클래스의 접근지정자가 허용하는 멤버들을 상속받는다.
이 때, 자식클래스의 객체 주소를 부모클래스 타입으로 변환하는 것을 업캐스팅이라고 하며, 부모 클래스로 업캐스팅된 참조변수는 부모클래스의 멤버만
접근근 가능하다.

다운캐스팅
업캐스팅된 객체를 다시 되돌리는 것을 말한다. 업캐스팅의 경우 자식객체는 부모객체의 자료형을 포함하므로 명시적인 타입을 안적어도 되지만
다운캐스팅의 경우 객체타입을 명시적으로 적어주어야한다.

instance of 연산자
참조변수가 가리키는 인스턴스가 어떤 클래스인지를 알 수 있도록 하는 연산자이다.

캐스팅을 하는 이유는??
다형성을 통해 자식클래스를 업캐스팅을 하고, 자식클래스가 부모클래스의 메소드를 오버라이딩 하면 부모클래스의 메소드를 실행하면 자식클래스에서 오버라이딩된
메소드가 실행된다. 이와같은 방법을 통해 하나의 메소드로 각 자식 객체에 맞는 메소드가 실행된다.
-> 다형성: 조상타입 참조변수로 자식객체를 다루는 것
-> 오버라이딩: 상위 클래스가 가진 메소드를 하위 클래스가 재정의 하여 사용
-> 오버로딩: 같은 이름의 메소드이지만 매개변수를 다르게 하여 다른 인자를 받아 다르게 사용

 */
