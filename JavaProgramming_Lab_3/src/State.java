public enum State {
    GAS, SOLID, LIQUID;


    public static State valueOf(int value){
        switch (value){
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
                return GAS;
            case 3:
            case 4:
            case 5:
            case 6:
                return SOLID;
            case 10:
                return LIQUID;
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
                return GAS;
            case "BERYLLIUM":
            case "BORON":
            case "CARBON":
            case "LITHIUM":
                return SOLID;
            case "NEON":
                return LIQUID;
        }
        return null;
    }
    public static String[] names(){
        State [] states = State.values();
        String [] names = new String[states.length]; //1. Enum elements 크기만한 문자열 배열을만든다.
        for(State n: states)//2. 순서대로 enum값을 넣어준다. /1. name()을 사용하기, 2. toString()을 사용하기
        {
            names[n.ordinal()] = n.name(); // Enum type을 name메소드와 string 메소드를 이용하여 String 타입으로 바꿨다.
            //names[n.ordinal()] = n.toString();
        }
        return names;
    }
}

