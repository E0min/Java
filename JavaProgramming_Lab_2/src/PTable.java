public class PTable {
    public static final int HYDROGEN = 1; // 수소
    public static final int HELIUM = 2; // 헬륨
    public static final int LITHIUM = 3; // 리튬
    public static final int  BERYLLIUM = 4; // 베릴륨
    public static final int  BORON = 5; // 붕소
    public static final int  CARBON = 6; // 탄소
    public static final int NITROGEN = 7; // 질소
    public static final int OXYGEN = 8; // 산소
    public static final int FLUORINE = 9; //플루오린
    public static final int NEON = 10; // 네온


    public static String getSymbol(int element) {
        if (element == 1){return "H";}
        if (element == 2){return "He";}
        if (element == 3){return "Li";}
        if (element == 4){return "Be";}
        if (element == 5){return "B";}
        if (element == 6){return "C";}
        if (element == 7){return "N";}
        if (element == 8){return "O";}
        if (element == 9){return "F";}
        if (element == 10){return "Ne";}
        else return "1~10번 사이의 원소를 입력해주세요";
    }
    public static String getName(int element){
        if (element == 1){return "수소";}
        if (element == 2){return "헬륨";}
        if (element == 3){return "리튬";}
        if (element == 4){return "베릴륨";}
        if (element == 5){return "붕산";}
        if (element == 6){return "탄소";}
        if (element == 7){return "질소";}
        if (element == 8){return "산소";}
        if (element == 9){return "플루오린";}
        if (element == 10){return "네온";}
        else return "1~10번 사이의 원소를 입력해주세요";
    }
    public static double getWeight(int element){
        if (element == 1){return 1.008;}
        if (element == 2){return 4.003;}
        if (element == 3){return 5.3941;}
        if (element == 4){return 9.012182;}
        if (element == 5){return 10.811;}
        if (element == 6){return 12.0107;}
        if (element == 7){return 14.0067;}
        if (element == 8){return 15.9994;}
        if (element == 9){return 18.9984;}
        if (element == 10){return 20.1797;}
        else return 0;

    }
}
