public class SuperChaining {
    public static void main(String args[]){
        new First(1);
        new Second(1,2);
    }
}
class First{
    private int a=10;
    First(){
        System.out.println("Zero-aug constructor of class first");
    }
    First(int a){
        
        System.out.println("1-aug constructor of class first");
        this.a=a;
    }
}
class Second extends First{
    int b;       
    Second(){
        System.out.println("Zero-aug constructor of class Second");
        b=20;
    }
    Second(int a, int b){

        System.out.println("1-aug constructor of class Second");
        this.b=b;
    }
}
