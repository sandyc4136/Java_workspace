public class FinalDemo {
    public static void main(String args[]){
        // int a;
        final int a=10;
        a=20;   // error: cannot assign a value to final variable a
        System.out.println(a); //error: variable a might not have been initialized
    }
}

