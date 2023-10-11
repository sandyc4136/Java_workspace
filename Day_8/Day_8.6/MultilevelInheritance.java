public class MultilevelInheritance {
    public static void main(String args[]){
        First f=new First();
        System.out.println(f.a);
        Second S=new Second();
        System.out.println(S.a);
        System.out.println(S.b);
        Third t=new Third();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
    }
}
class First{
    int a=10;
}
class Second extends First{
    int b=20;
}
class Third extends Second{
    int c=30;
}