public class Players {

    String name;
    int[] score;

    Players(String name, int []score){
        this.name = name;
        this.score = score;

    }

    public int Totalscore()
    {
        int total=0;
        for(int i = 0; i<score.length;i++)
        {
           total += score[i];
        }

        return total;
    }
}
