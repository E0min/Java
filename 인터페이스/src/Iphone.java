public class Iphone implements Phone,Messenger{
    public void ring(String name){
        System.out.println(name +"에게 전화가 옵니다.(아이폰 마림바 알람이 울리는중)");
    }

    public void call(String name){
        System.out.println(name + "에게 시리가 전화를 겁니다.");
    }
    public void sendMessage(){System.out.println("아이폰에 문자를 보냅니다.");}
    public void receiveMessage(){System.out.println("아이폰이 문자를 받습니다.");}
}
