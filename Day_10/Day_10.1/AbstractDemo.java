public class AbstractDemo {
    public static void main(String args[]){
        new Second().myFun();
    }
    
}
abstract class First{
    abstract void myFun();
}
class Second extends First{
    void myFun(){
        System.out.println("myFun of Second");
    }
}
