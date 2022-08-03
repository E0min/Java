public class Distance {
    public static void main(String[] args) {
    Point a = new Point(4,7);
    Point b = new Point(6,9);

    double result = DistanceCalculate.Calculate(a,b);
    System.out.println("두 점 사이의 거리는 "+ result +" 입니다");
    }
}
