public class GasPeriodicElement extends PeriodicElement{
    public GasPeriodicElement(int number, String symbol, String name, double weight){
        super(number,symbol,name,weight);
        state = State.GAS;
    }
    public String toString(){
        return "GasPeriodicElement [number: "+number+ ", symbol: "+symbol+", name: "+name+", weight: "
                +weight+"]";
    }

    public void print(){
        System.out.println("GasPeriodicElement");
        System.out.println("number: "+number);
        System.out.println("symbol: "+symbol);
        System.out.println("name: "+name);
        System.out.println("weight: "+weight);

    }
}
