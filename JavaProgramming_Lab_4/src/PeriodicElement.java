public class PeriodicElement {
    enum State{LIQUID, SOLID, GAS} //*****
    private final State state;
    private int number;
    private String symbol;
    private String name;
    private double weight;


    PeriodicElement(int number, String symbol, String name, double weight, State state){ // 생성자 생성
        this.number = number;
        this.symbol = symbol;
        this.name = name;
        this.weight = weight;
        this.state = state;
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

    public State getState() {return state;} // 추가

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
        return String.format("PeriodicElement "+number+" "+symbol+" "+name+" "+weight+" "+state);
    }

    public static PeriodicElement parsePeriodicElement(String line){
        String [] element = line.split(" ");
        return new PeriodicElement(Integer.parseInt(element[0]),element[1],element[2],Double.parseDouble(element[3]),State.valueOf(element[4]));
    } // String line의 문자열을 띄어쓰기 단위로 잘라 PeriodicElement 객체로 생성하여 반환 그러니깐 메소드를 통해 객체 생성 가능


    public void print(){
        System.out.printf("원자번호 : %d \n심볼: %s \n이름: %s \n무게: %f\n",getNumber(),getSymbol(),getName(), getWeight() );
    }
}
