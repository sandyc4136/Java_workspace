public class Single_Inheritance {
    public static void main(String args[]){
        First f=new First();
        System.out.println(f.a);
        Second S=new Second();
        System.out.println(S.a);
        System.out.println(S.b);
    }
}
class First{
    int a=1;
}
class Second extends First{
    int b=2;
}