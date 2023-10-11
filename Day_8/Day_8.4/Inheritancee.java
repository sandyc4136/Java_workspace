public class Inheritancee {
 public static void main(String args[]){
    Second s=new Second();
    s.print();
    s.myFun();
    System.out.println(s.a);
 }  
}
class first{
    int a=5;
    int b=10;
    void myFun(){
        System.out.println("myFun of first class");
    }
}
class Second extends first{
    int c=15;
    void anotherFun(){
        System.out.println("Another fun of Second class");
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
