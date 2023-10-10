

public class StaticWithStaticFunc {
    
    public static void main(String args[]){
        Demo.myFun();   // static method call with class name from outside the class
    }
    // public static void myFun(){
    //     int a=9;
    //     System.out.println(a);
    // }
}


class Demo{
    public static void myFun(){
        int a=24;
        System.out.println(a);
    }
}