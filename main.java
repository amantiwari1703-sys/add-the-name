public class main {
    public static void main(String[] args){

//ferrari fr=new ferrari();
//fr.superspeed();
Car cr=new Car();
cr.move();

    }
}
class Car{
    public static void move(){
        System.out.println("car is running on time");
    }
}
class ferrari extends Car{
    public static void superspeed(){
        System.out.println("car is running on high speed");
    }

}
