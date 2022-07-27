import java.util.Scanner;

    public class Lab_1 {
        public static void PeriodicElement(int number, String symbol, String name, double weight){
            System.out.println("PeriodicElement => [number = "+number+", symbol = "+ symbol +", name = "+name+", weight = "+weight+ "]");
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            String symbol = input.next();
            String name = input.next();
            double weight = input.nextDouble();
            PeriodicElement(number, symbol, name, weight); // 1번 수소는 Scnner 클래스를 사용하여 출력하기
            // 1, "H", "수소", 1.0078
            PeriodicElement(2, "He","헬륨",4.0026 );
            PeriodicElement(3,"Li","리튬",6.94);
            PeriodicElement(4,"Be","베릴륨",9.0122);
            PeriodicElement(5,"B","붕소",10.81);
            PeriodicElement(6,"C","탄소",12.011);
            PeriodicElement(7,"N","질소",14.007);
            PeriodicElement(8,"O","산소",15.999);
            PeriodicElement(9,"F","플루오린",18.9980);
            PeriodicElement(10,"Ne","네온",20.180);


        }
    }


