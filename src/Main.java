import java.util.Arrays;

public class Main{
    public static void main (String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - i - 1];
        }
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}


