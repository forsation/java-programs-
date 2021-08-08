import java.util.Scanner;
public class magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, sum =0, d, m1 = 0;

        System.out.println("Enter the number :");
        n = sc.nextInt();
        
        while(n!=0) {
            temp = n%10;
            sum = sum + temp;
            n = n/10;
        }
        while (sum != 0){
            d = sum % 10;
            m1 = m1 + d;
            sum = sum / 10;
        }
        if (m1 == 1) {
            System.out.println("IT is magic number");
        }
        else {
            System.out.println("it is not a magic number ");
        }
    }
}