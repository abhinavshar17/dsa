package sorting;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class inbuilt {
    public static void main(String[] args) {
        Integer arr[]={90,55,78,12,45,50};
        int  p[]={90,55,78,12,45,50};
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr,0,3);
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,Collections.reverseOrder() );
        System.out.println(Arrays.toString(arr));

    }
}
