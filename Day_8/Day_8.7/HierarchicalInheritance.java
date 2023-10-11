public class HierarchicalInheritance{
    public static void main(String args[]){
        First f=new First();
        Second s=new Second();
        Third t=new Third();
        Fourth fo=new Fourth();
        System.out.println(f.a);
        System.out.println(s.a); 
        System.out.println(t.a);
        System.out.println(fo.a);
        
    }
    }
    class First{
        int a=1;
    }
    class Second extends First{
        int b=2;
    }
    class Third extends First{
        int c=3;
    }
    class Fourth extends First{
        int d=4;
    }