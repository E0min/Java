public class Wizards extends Newbie {

    String newSkill = "파이어 볼 ~~~@@@@@";
    int mp;

    Wizards(String name, int hp, int mp) {
        super(); // 생성자 오버로딩
        //또는 super("이영민","70);
        //또는 super(name,hp);
        this.mp =mp;
        this.name = name;
        this.hp = hp;
    }

    public String WizardsInformation(){
        return String.format("이름 = %s, hp = %d, mp = %d, 스킬 = %s %s",name,hp,mp,basicSkill,newSkill);
    }

}
