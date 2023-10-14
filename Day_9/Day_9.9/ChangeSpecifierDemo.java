public class ChangeSpecifierDemo {
  public static void main(String args[]){
    Second s=new Second();
    s.myFun();
  } 
}
class First{
    int a=20;
    protected void myFun(){
        //code
    }
}
class Second extends First{
    int b=30;
    public void myFun(){
    //void myFun(){ // Error attempting to assign weaker access privileges; was protected
        //code;
    }
}
