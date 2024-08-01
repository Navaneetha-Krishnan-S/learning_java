
import java.util.Arrays;
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = in.next();
        
    }
    
    System.out.println(Arrays.toString(arr));
        in.close();
 
    }
}