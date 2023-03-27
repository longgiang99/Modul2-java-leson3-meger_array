import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int n1 = arr1.length;
        int[] arr2 = {5,6,7,8};
        int n2 = arr2.length;

        int[] arr3 = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];

        }
        for (int i = 0; i <n2 ; i++) {
            arr3[n1 + i] = arr2[i];
        }
        System.out.println(" mang moi laf: ");
        for (int i = 0; i < arr3.length ; i++) {
        }
        System.out.print(Arrays.toString(arr3));

    }

}