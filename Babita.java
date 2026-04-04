import java.net.ProtocolFamily;

public class Babita {
    public static void main(String args[]){
    Rajesh rr=new Rajesh();
    rr.money();
    family fd=new family();
    fd.good();



    }
}
class family{
    public static void good(){
        System.out.println("it is a good family");


    }

}
class Rajesh extends Babita{
    public static void money(){
        System.out.println("my father needs money");
    }

}