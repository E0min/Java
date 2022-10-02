public enum Element {
    HYDROGEN(1),
    HELIUM(2),
    LITHIUM(3),
    BERYLLIUM(4),
    BORON(5),
    CARBON(6),
    NITROGEN(7),
    OXYGEN(8),
    FLUORINE(9),
    NEON(10);
    private final int value;

    Element(int value) {
        this.value = value;
    } // 생성자

    public int getValue() {
        return value;
    }

    public static Element valueOf(int value) {
        /*
        1. value를 인자로 받아 value값과 대응하는 enum출력하기 Element 타입 배열을 static 키워드로 선언 후 values()메소드를 이용하여 선언된 enum 모두를 배열로 만들고 elements[value-1]
        을 출력하면 value값에 상응하는 enum이 출력된다.

        2. switch문 사용하기
         */
        switch (value) {
            case 1:
                return HYDROGEN;
            case 2:
                return HELIUM;
            case 3:
                return LITHIUM;
            case 4:
                return BERYLLIUM;
            case 5:
                return BORON;
            case 6:
                return CARBON;
            case 7:
                return NITROGEN;
            case 8:
                return OXYGEN;
            case 9:
                return FLUORINE;
            case 10:
                return NEON;
        }
        return null;
    }

    public static Element nameOf(String name) {
        switch (name) {
            case "HYDROGEN":
                return HYDROGEN;
            case "HELIUM":
                return HELIUM;
            case "LITHIUM":
                return LITHIUM;
            case "BERYLLIUM":
                return BERYLLIUM;
            case "BORON":
                return BORON;
            case "CARBON":
                return CARBON;
            case "NITROGEN":
                return NITROGEN;
            case "OXYGEN ":
                return OXYGEN;
            case "FLUORINE":
                return FLUORINE;
            case "NEON":
                return NEON;
        }
        return null;
    }

    public static String[] names() {
        Element[] elements = Element.values();//
        String[] names = new String[elements.length]; //1. Enum elements 크기만한 문자열 배열을만든다.
        for (Element n : elements)//2. 순서대로 enum값을 넣어준다. /1. name()을 사용하기, 2. toString()을 사용하기
        {
            names[n.ordinal()] = n.name(); // Enum type을 name메소드와 string 메소드를 이용하여 String 타입으로 바꿨다.
            //names[n.ordinal()] = n.toString();
        }
        return names;
    }
}
