import org.omg.CosNaming.BindingTypeHelper;

public class Newbie {
    String name;
    int hp;
    String basicSkill = "달팽이 던지기";

    public Newbie(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    Newbie(){}

    public String newbieInformation(){
        return String.format("이름은 "+name+"hp는 "+hp +"스킬은 "+basicSkill);
    }
}
