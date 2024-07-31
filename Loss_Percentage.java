import java.util.Scanner;
public class Frame{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        double c=((a-b)*100.0)/a;
        System.out.printf("%.2f",c);
    }
}