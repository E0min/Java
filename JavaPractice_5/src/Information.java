public class Information {
    private String name;
    private String pnumber;

    Information(String name, String pnumber){
        this.name = name;
        this.pnumber = pnumber;

    }

    public String getInformation(){
        return String.format(this.name +" "+ this.pnumber);
    }

    public String setInformation(){
        this.name = "이예원";
        this.pnumber = "010-5926-0731";
        return String.format(this.name +" "+ this.pnumber);

    }
}
