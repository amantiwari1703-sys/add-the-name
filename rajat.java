public class rajat {
    int age ;
   String name;
    public rajat(int a,String n){
//        System.out.println("constructor called");
    name=n;
        age=a;
    }
    public static void main(String[] args){
        rajat r=new rajat(47,"Ram");
        System.out.println(r.age);
        System.out.println(r.name);


    }
}
