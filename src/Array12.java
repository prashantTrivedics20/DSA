public class Array12 {
    public static void main(String[] args) {
        int []arr={10,10,10,20,20,20,30,30,40,50,60,70};
        int n=20;
        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
           int m=(l+h)/2;
           if(n>arr[m])
            {
                l=m+1;
            }
           else if(n<arr[m])
           {
               h=m-1;
           }
           else
           {
               l=m;
               l=m+1;
           }
        }
        System.out.println(l);

    }
}
