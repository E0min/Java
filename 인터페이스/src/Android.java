public class Android implements Phone,Messenger{// 인터페이스는 다중 상속이 가능하다.
    public void ring(String name){
        System.out.println(name +"에게 전화가 옵니다.(빅스비가 노래부르는중)");
    }

    public void call(String name){
        System.out.println(name + "에게 빅스비가 전화를 겁니다.");
    }
    public void sendMessage(){System.out.println("안드로이드폰에 문자를 보냅니다.");}
    public void receiveMessage(){System.out.println("안드로이드폰이 문자를 받습니다.");}
}
