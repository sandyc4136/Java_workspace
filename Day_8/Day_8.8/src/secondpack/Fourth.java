package secondpack;
import firstpack.First;

public class Fourth extends First{
    void FourthFun(){
        First f=new First();
        System.out.println(f.a); // OK
        System.out.println(f.b); //Error
        System.out.println(f.c); //Error
        System.out.println(f.d); //Error
    }
}
