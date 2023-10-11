package secondpack;

import firstpack.*;

public class Third extends First{
    void thirdFun(){
        System.out.println(a); // Ok
        System.out.println(b); // Error
        System.out.println(c); // Error
        System.out.println(d); // Ok
    }
}
