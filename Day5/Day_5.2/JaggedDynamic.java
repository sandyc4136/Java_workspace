
import java.util.*;

public class JaggedDynamic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[1];
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
}
}