import java.util.Scanner;
// subset of an array...
public class Array9 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=readme.nextInt();
        }
        int limit=(int)Math.pow(2,a.length);
        for (int i = 0; i <limit ; i++) {
            String  set="";
            int temp=i;
            // convert i to binary and use 0 and 1
            for (int j = a.length-1; j >=0; j--) {
                int r=temp%2;
                temp=temp/2;
                if(r==0)
                {
                    set="-\t" + set;
                }
                else
                {
                    set =a[j]+ "\t"+ set;
                }
            }
            System.out.println(set);
        }
    }
}
