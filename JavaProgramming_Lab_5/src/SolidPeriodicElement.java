public class SolidPeriodicElement extends PeriodicElement{
    public SolidPeriodicElement(int number, String symbol, String name, double weight){
        super(number,symbol,name,weight);
        state = State.SOLID;
    }
    public String toString(){
        return "SolidPeriodicElement [number: "+number+ ", symbol: "+symbol+", name: "+name+", weight: "
                +weight+"]";
    }

    public void print(){
        System.out.println("SolidPeriodicElement");
        System.out.println("number: "+number);
        System.out.println("symbol: "+symbol);
        System.out.println("name: "+name);
        System.out.println("weight: "+weight);

    }
}
