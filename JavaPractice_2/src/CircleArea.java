public class CircleArea {
   int radius;
    String name;

    CircleArea(String name, int radius){
        this.name = name;
        this.radius = radius;
    }
     double CalculateArea(){
         return this.radius * this.radius * Math.PI;
    }
    static void PrintCongratulation(){
        System.out.println("축하합니다 \n");
    }
    void PrintArea(){
        System.out.printf("%s의 원의 면적은 %.2f입니다.\n",this.name,this.CalculateArea());
 /* this 키워드는 인스턴스 자체에 접근할 때 사용한다. 주로 메인클래스에서는 객체생성 후 객체명. 과 같은 방식으로 접근하고
 이외의 클래스에서는 this 키워드로 접근한다.
  */
    }
}
