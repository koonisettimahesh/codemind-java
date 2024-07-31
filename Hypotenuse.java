import java.util.Scanner;
public class Hypotenuse{
    public static void main(String[] args)
    {
        int a,b;
        double c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("%.2f",c);
    }
}