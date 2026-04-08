public class student {
    String name;

    //     int age;
    public student(String n) {
        name = n;
    }

    void show() {
        System.out.println(name);
    }
//    age=a;
//       System.out.println(age);
//        System.out.println("constructor called");


    public static void main(String args[]) {
        student s1 = new student("Ram");
        student s2 = new student("Shyam");
//        System.out.println(s.name);

        s1.show();
        s2.show();


    }
}

