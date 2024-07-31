import java.util.Scanner;
public class Frame{
    public static void main(String[] args)
    {
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        double b=(a*5)/18.0;
        System.out.printf("%.2f",b);
    }
}