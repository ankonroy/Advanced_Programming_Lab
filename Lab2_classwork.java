import java.util.Scanner;

/**
 * Lab2
 */
public class Lab2_classwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        
        int count = input.nextInt();
        int[] arr = new int[count];
        System.out.print("Enter array elements: ");
        
        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.print("Enter the number you want to know frequency : ");
        int num = input.nextInt();
        int freq = 0;
        
        for (int i : arr) {
            if (i == num) freq++;
        }
        
        System.out.print("There are " + freq + " " + num + "s in the array.");
    }
}
