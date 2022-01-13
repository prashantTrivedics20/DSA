// left rotation...
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=readme.nextInt();
        }

        int r=readme.nextInt();
        for (int i =0; i <r%n; i++) {
            int t=a[0];
            for (int j = 0; j <n-1; j++) {
                a[j]=a[j+1];
            }
            a[n-1]=t;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
