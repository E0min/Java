public class FishBread {
    static int count = 0; // 클래스 변수; 생성시기 => 클래스 로딩시
    String name; // 인스턴스 변수 ; 생성시기 => 인스턴스 생성 시
    FishBread(String name){
        this.name = name;
        count++;
    }
}
