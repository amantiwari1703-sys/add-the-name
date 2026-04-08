public class student {
 String name;
     int age;
   public student(String n , int a){
      name=n;
    age=a;
       System.out.println(age);
//        System.out.println("constructor called");


    }
    public static void main(String args[]){
        student s=new student("Ram",21);
        System.out.println(s.name);


    }
}
