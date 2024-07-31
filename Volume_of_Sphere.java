import java.util.Scanner;
public class Frame{
    public static void main(String[] args)
    {
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        double c=(4*3.14*a*a*a)/3;
        System.out.printf("%.2f",c);
    }
}