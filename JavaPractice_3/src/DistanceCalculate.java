public class DistanceCalculate {

     Point a;
     Point b;

     static Double Calculate(Point a, Point b){
         double result = Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
         return result;
     }
      /* 클래스 메소드에는 클래스 변수만 사용가능한데 인자는 어떤 변수?
      static 키워드에 의해 클래스 메소드 또한 클래스 로드시 생성되며 매개변수또한 같이 생성된다.
       */
}
