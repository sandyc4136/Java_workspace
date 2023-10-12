public class ConstructorInheritance {
    public static void main(String args[]){
        Second s=new Second();
    }
}
class First{
    First(){
        System.out.println("First class constructor");
    }
    
}
class Second extends First{
    Second(){
        System.out.println("Second class constructor");
    }
    
}