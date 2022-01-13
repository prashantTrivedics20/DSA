// rotation of an array....
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Array13 {
    public static void  reverse(int []a,int i,int j)
    {
//        int li=i;
//        int ri=j;
//        while(li<ri)
//        {
//            int temp=a[li];
//            a[li]=a[ri];
//            a[ri]=temp;
//            li++;
//            ri--;
//        }

            int l=i;
            int r=j;
            for (int m = l; m <r;) {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
    }
    public static void rotate(int []a,int k)
    {
        k=k%a.length;
        if(k<0)
        {
            k=k+a.length;
        }
        //part1
        reverse(a,0,a.length-k-1);
        //part
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1);
    }
    public static void dispaly(int []a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int []a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(br.readLine());
        }
        int k=Integer.parseInt(br.readLine());
        rotate(a,k);
        dispaly(a);
    }
}
