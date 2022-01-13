import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=readme.nextInt();
        }
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for (int floor=max; floor>=1;floor--) {
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]>=floor)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }

    }
}
