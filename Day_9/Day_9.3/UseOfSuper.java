

public class UseOfSuper {
    public static void main(String args[]){
        Second s=new Second();
        s.anotherFun();
    }
}
class First{
    void myFun(){
        System.out.println("myFun of class First");
    }
}
class Second extends First{
   
    void anotherFun(){
        System.out.println("Another Fun of Second class");
          super.myFun();
    }
}