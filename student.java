public class student {
    String name;

    public student(String n){
        name=n;

//        System.out.println("constructor called");


    }
    public static void main(String args[]){
        student s=new student("Ram");
        System.out.println(s.name);


    }
}
