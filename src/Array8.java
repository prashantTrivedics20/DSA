import java.util.Scanner;
//  print all the sub Array of array
public class Array8 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=readme.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(a[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
