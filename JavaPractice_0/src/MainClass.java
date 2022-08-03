public class MainClass {
    public static void main(String[] args) {
        int [] kim = {8,8,9};
        int [] lee = {10,10,10};
        int [] shin = {9,10,8};

        Players players = new Players("lee",kim);
        Players players1 = new Players("lee",lee);
        Players players2 = new Players("shin",shin);

        Players [] Korea = {players,players1,players};
        Team korea = new Team("한국",Korea);
        int points = korea.Tematotalscores();

        System.out.println(korea.nation +"의 점수는"+ points);

        }
    }


/* 객체에 객체 넣기*/

