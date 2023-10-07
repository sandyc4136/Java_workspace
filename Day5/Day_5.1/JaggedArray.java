
import java.util.*;

class JaggedArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]={{5,10},{15,20,25},{30}};
        int len=arr[0].length;
        System.out.println(len);
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}