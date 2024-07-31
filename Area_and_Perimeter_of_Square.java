import java.util.Scanner;
public class Frame{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=a*a;
        c=4*a;
        System.out.println(b+" "+c);
    }
}