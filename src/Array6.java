import java.util.Scanner;

// right rotation...
public class Array6 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=readme.nextInt();
        }
        System.out.println("Enter the number of rotation");
        int r=readme.nextInt();
        for (int i = 0; i <r%n ; i++) {
            int t=a[n-1];
            for (int j = 0; j < a.length-1; j++) {
                a[n-1-j]=a[n-2-j];
            }
            a[0]=t;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
