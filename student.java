public class student {
    student (){
        System.out.println("default constructor");

    }



    //     int age;
    public student(String name) {
        System.out.println(name);
    }

//    void show() {
//        System.out.println(name);
//    }
//    age=a;
//       System.out.println(age);
//        System.out.println("constructor called");


    public static void main(String args[]) {
        student s1 = new student();
        student s2 = new student("Ram");
//       System.out.println(s2.name);




    }
}

