import java.util.Scanner;
public class Array7 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0&&a[i]<=n-1) {
                a[i] = readme.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i==a[j]){
                    System.out.println(j);
                }

            }

        }

    }
}
