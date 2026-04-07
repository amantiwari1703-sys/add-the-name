import java.util.Scanner;
public class com {
   static void add(){


          int a = 2;
      int b = 3;
        int c = a + b;
         System.out.println(c);



}
static void subs(){
    int d=9;
    int e=8;
    int f=d-e;
    System.out.println(f);


}
static void product(){
       int g=3;
       int h=4;
       int i=g*h;
    System.out.println("product="+i);

}

static void divide(){
    Scanner ad=new Scanner(System.in);
       int j=ad.nextInt();
       int k=ad.nextInt();
       System.out.println(j/k);
}
static void multiply(){
    Scanner ad=new Scanner(System.in);
    int m= ad.nextInt();
    int n=ad.nextInt();
    System.out.println(m*n);


}
public static void main(String[] args){
       subs();
       add();
       product();
       divide();
       multiply();

}

}
