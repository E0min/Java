public class PeriodicElement {
    protected enum State{LIQUID, SOLID, GAS} //*****
    protected State state;
    protected int number;
    protected String symbol;
    protected String name;
    protected double weight;


    protected PeriodicElement(int number, String symbol, String name, double weight){

        this.number = number;
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
        String state = element[4];
        switch (state){
            case "LIQUID": PeriodicElementFactory.getInstance(Integer.parseInt(element[0]),element[1],element[2],Double.parseDouble(element[3]),State.LIQUID);
            case "SOLID": PeriodicElementFactory.getInstance(Integer.parseInt(element[0]),element[1],element[2],Double.parseDouble(element[3]),State.SOLID);
            case "GAS": PeriodicElementFactory.getInstance(Integer.parseInt(element[0]),element[1],element[2],Double.parseDouble(element[3]),State.GAS);
        }
        return null;
    } // String line의 문자열을 띄어쓰기 단위로 잘라 PeriodicElement 객체로 생성하여 반환 그러니깐 메소드를 통해 객체 생성 가능


    public void print(){
        System.out.printf("원자번호 : %d \n심볼: %s \n이름: %s \n무게: %f\n",getNumber(),getSymbol(),getName(), getWeight() );
    }
}

// 클래스 내부에서 Enum 사용 시
