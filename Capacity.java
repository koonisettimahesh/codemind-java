import java.util.Scanner;
public class Frame{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        System.out.println(a*b*c+" KB");
    }
}