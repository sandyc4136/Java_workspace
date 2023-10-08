public class OverloadingDemo{
    public static void main(String args[]){
       Add ad1=new Add();
       ad1.sum(2,3);
       ad1.sum(2.5,3.7);
       ad1.sum(3, 4.5);
    }
}
class Add{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
}