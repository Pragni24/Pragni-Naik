import java.util.Arrays;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of any array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the index a and index b whose values are to be swapped:");
        int a = in.nextInt();
        int b = in.nextInt();
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println("After swapping, the array becomes:");
        System.out.println(Arrays.toString(arr));

    }
}