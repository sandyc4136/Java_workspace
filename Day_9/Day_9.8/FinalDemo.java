// public class FinalDemo {
//     public static void main(String args[]){
//         // int a;
//         final int a=10;
//         a=20;   // error: cannot assign a value to final variable a
//         System.out.println(a); //error: variable a might not have been initialized
//     }
// }

public class FinalDemo{
    public static void main(String args[]){
        Second s=new Second();
        s.printDetail();
    }
}
 class First{  
    final int val=5;
      void print(){
        System.out.println(val);
    }
}
class Second extends First{
    int num=10;
    void printDetail(){
        super.print();
        System.out.println(num);
    }
}


// final class First{
    // int val=10;

//}
 //class Second extends First{ // Error  cannot inherit from final First
    // code
 //}