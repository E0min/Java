public class PersonTest {
    public static void main(String[] args) {
        Information person1 = new Information("이영민","010-5241-7713");

        //게터를 통해 person1,person2 정보 얻기
        System.out.println(person1.getInformation());

        //세터를 통해 person1, person2 정보 수정
        System.out.println(person1.setInformation());

    }
}
/* private 접근제한자가 붙어도 getter와 setter메소드를 통해 객체의 값을 받아오거나 수정 할 수 있다.
getter와 setter는 public 이다.
 */