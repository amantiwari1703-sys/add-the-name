public class rajat {
    int age ;
   String name;
    public rajat(String n){
//        System.out.println("constructor called");
    name=n;
//        age=a;
    }
    void show(){
        System.out.println(name);
    }
    public static void main(String[] args){
        rajat r1=new rajat("Ram");
        rajat r2=new rajat("Shyam");
        System.out.println(r1.name);
        System.out.println(r2.name);
        r1.show();
        r2.show();


    }
}
