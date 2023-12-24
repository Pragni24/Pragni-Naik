import java.util.Arrays;
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of any array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The array is:");
        System.out.println(Arrays.toString(arr));
        int max=0;
        for (int j=0;j<size;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("Maximum value of array is:"+max);
    }
}
