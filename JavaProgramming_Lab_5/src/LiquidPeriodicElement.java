public class LiquidPeriodicElement extends PeriodicElement{
    public LiquidPeriodicElement(int number, String symbol, String name, double weight){
        super(number,symbol,name,weight);
        state = State.LIQUID;
    }

    public String toString(){
        return "LiquidPeriodicElement [number: "+number+ ", symbol: "+symbol+", name: "+name+", weight: "
                +weight+"]";
    }

    public void print(){
        System.out.println("LiquidPeriodicElement");
        System.out.println("number: "+number);
        System.out.println("symbol: "+symbol);
        System.out.println("name: "+name);
        System.out.println("weight: "+weight);

    }
}
