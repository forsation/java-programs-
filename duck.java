import java.util.Scanner;
public class duck {
    public static void main(String[] args) {
        Scanner sc = new SCanner (System.in)l
        int n, d, r, temp = 0, n1 = 0;

        System.out.println("Enter a number :"+ )
        n = sc.nextInt();
        System.out.println("Enter the nuber of digits :");
        d = sc.nextInt();

        for (int i = 1; i<= d; i++) {
            r = n % 10;
            if (r == 0) {
                temp++;
            }
            n/=10;
            n1 = r;
        }
        if (temp >= 1 && n1!= 0) {
            System.out.println("It is a duck number");
        }
        else {
            System.out.println("It is not a duck number");
        }
    }
}