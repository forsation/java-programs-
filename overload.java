
import java.util.Scanner;
public class overload
{
    public void volume(int radius, int height)
    {
        double vol=(Math.PI*radius*height)*1/3;
        System.out.println("Volume of cone="+vol);
    }
    public void volume(int length, int height, int breadth)
    {
        int vol=length*height*breadth;
        System.out.println("Volume of cuboid="+vol);
    }
    public void volume(int radius)
    {
        double vol=(Math.PI*radius*radius*radius)*4/3;
        System.out.println("volume of shpere="+vol);
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter radius");
        int r=scan.nextInt();
        System.out.println("Enter height");
        int h=scan.nextInt();
        System.out.println("Enter length");
        int l=scan.nextInt();
        System.out.println("breadth");
        int b=scan.nextInt();
        test ab=new test();
        ab.volume(r, h);
        ab.volume(l, h, b);
        ab.volume(r);
    }
}