// find the ceil and floor
public class Array11
{ public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70,80,90,100};
        int num=52;
        int l=0;
        int h=arr.length-1;
        int ceil=0;
        int floor=0;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(num>arr[m])
            {
                l=m+1;
                floor=arr[m];

            }
            else if(num<arr[m])
            {
                h=m-1;
                ceil=arr[m];
            }
            else
            {
                ceil=arr[m];
                floor=arr[m];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
}
}
