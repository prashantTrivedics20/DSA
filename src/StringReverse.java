import java.io.*;

public class StringReverse {
    String s;
    public StringReverse(String s) {
        this.s = s;
    }
    public void Palindrome()
    {
        char str[]=s.toCharArray();
        char str1[]=new char[str.length];
        for (int i = 0; i <str.length ; i++) {
            str1[i]=str[i];
        }

        int j=str.length-1;
        int i=0;
        while(i<j)
        {
            int temp=str[i];
            str[i]=str[j];
            str[j]= (char) temp;
            i++;
            j--;
        }
        //System.out.println(str);
        //System.out.println(str1);
        String s1=new String(str);
        String s2=new String(str1);
        if(s1.equals(s2))
        {
            System.out.println("palindrome");
            return;
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader ir=new InputStreamReader(System.in);//take the input through keyBoard that's why we use (System.in)
        BufferedReader br=new BufferedReader(ir);
        StringReverse obj=new StringReverse(br.readLine());
        obj.Palindrome();
    }
}
