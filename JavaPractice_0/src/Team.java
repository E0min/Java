public class Team {

 String nation;
 Players[] players;

 Team(String nation, Players[] players){
     this.nation = nation;
     this.players = players;
 }

 public int Tematotalscores(){
     int scores=0;
     for (int i = 0; i<players.length;i++)
     {
         scores += players[i].Totalscore();
     }
     return scores;
 }
}
