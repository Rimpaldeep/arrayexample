import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        double [] arr = new double [10];
        double sum= 0;
        for (int i=0; i<arr.length; i++) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
            arr [i] = sc.nextDouble();
            sum= sum+ arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The sum of all the values is: " + sum);
        }
       }
