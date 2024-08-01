
import java.util.Arrays;
import java.util.Scanner;

public class array2D{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] arr = new String[3][3];
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = in.next();
          }
          System.out.println();
        
    }
    for(String[]a:arr){
    System.out.println(Arrays.toString(a));}

    
    System.out.println(arr.getClass().getSimpleName());
    int[] a = {1,2,3};
    System.out.println(a);
        in.close();
    }

}