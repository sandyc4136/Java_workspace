

public class OverriddingDemo {
    public static void main(String args[]){
        Second s= new Second();
        s.myFun();
    }
}
class First{
    void myFun(){
        System.out.println("myFun of First");
    }
}
class Second extends First{
    void myFun(){
       System.out.println("myFun of Second");
    }
}