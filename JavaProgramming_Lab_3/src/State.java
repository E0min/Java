public enum State {
    GAS, SOLID, LIQUID;


    public static State valueOf(int value){
        switch (value){
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
                return GAS;
            case 3:
            case 4:
            case 5:
            case 6:
                return SOLID;
        }
        return null;
    }
    public static State nameOf(String name){
        switch (name) {
            case "HYDROGEN":
            case "HELIUM":
            case "NITROGEN":
            case "OXYGEN":
            case "FLUORINE":
            case "NEON":
                return GAS;
            case "BERYLLIUM":
            case "BORON":
            case "CARBON":
            case "LITHIUM":
                return SOLID;
        }
        return null;
    }
    public static String[] names(){
        return null;
    }
}

