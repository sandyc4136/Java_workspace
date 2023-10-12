// import secondpack.Third;

public class ConstructorCallDemo {
    
  public static void main(String args[]){
        // Second s=new Second();
        Third t=new Third();
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
class Third extends Second{
    Third(){
        System.out.println("Third class constructor");
    }
}
