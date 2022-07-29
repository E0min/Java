public class Student extends Person{
    int grade;

    Student(String name,int grade){
        super(name);
        this.grade = grade;
    }
    public String gradetoString(){
        return String.format(Integer.toString(grade));
    }

    public String Hello(){ return "안녕하세요 선생님";}
}
