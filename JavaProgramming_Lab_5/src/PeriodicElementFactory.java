public class PeriodicElementFactory {
    public static PeriodicElement getInstance(int number, String symbol, String name, double weight, PeriodicElement.State state){
        switch(state){
            case SOLID: return new SolidPeriodicElement(number,symbol,name,weight);
            case LIQUID: return new LiquidPeriodicElement(number,symbol,name,weight);
            case GAS: return new GasPeriodicElement(number, symbol,name,weight);
        }
        return null;
    }
}
