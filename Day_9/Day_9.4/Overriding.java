public class Overriding {
    public static void main(String args[]){
        Secondd s=new Secondd();
        s.myFun();
    }
}
class Firstt{
    void myFun(){
        System.out.println("myFun of Firstt");
    }
}
class Secondd extends Firstt{
    void myFun(){
        System.out.println("myFun of Secondd");
        super.myFun();
    }
}
