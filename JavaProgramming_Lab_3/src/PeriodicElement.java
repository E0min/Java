public class PeriodicElement {
     private int number;
    private String symbol;
    private String name;
    private double weight;

    PeriodicElement(int number, String symbol, String name, double weight){ // 생성자 생성
        this.number=number;
        this.symbol = symbol;
        this.name = name;
        this.weight = weight;
    }
// getter 와 setter
    public int getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){ // object 클래스의 메소드 오버라이드함
       return String.format("PeriodicElement "+number+" "+symbol+" "+name+" "+weight);
    }

    public static PeriodicElement parsePeriodicElement(String line){
        String [] element = line.split(" ");
        return new PeriodicElement(Integer.parseInt(element[0]),element[1],element[2],Double.parseDouble(element[3]));
    } // String line의 문자열을 띄어쓰기 단위로 잘라 PeriodicElement 객체로 생성하여 반환 그러니깐 메소드를 통해 객체 생성 가능

    public static State getState(PeriodicElement element){
        return State.valueOf(element.number);
    }// PeriodicElement타입의 객체를 받았을 때 그 객체의 멤버변수중 number를 인자로 받아  State 클래스의 static 메소드인 valueOf를 통해
    // 상태를 알아낼 수 있다.

}
