import java.util.Arrays;
import java.util.Random;


public class provaSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
        }
        
        stampaArr(arr);

        Arrays.sort(arr);

        stampaArr(arr);
    }

    public static void stampaArr(Integer[] arr) {
        System.out.print("[ ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("]");
    }
}