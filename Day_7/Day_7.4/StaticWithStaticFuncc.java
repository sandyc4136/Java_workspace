

public class StaticWithStaticFuncc{
    int x;
    public static void main(String args[]){
        //static int  y=3;  // Error = Static member cannot to defined inside method;
        myFun();   // static method call without class name from the same class
    
    }
    public static void myFun(){
        int a=9;
        System.out.println(a);
        System.out.println(new StaticWithStaticFuncc().x); // instance variable accessible only with object 
        //System.out.print(x);   // Erro r= non static instance variable without object not accessible
    }
}
