import java.util.Scanner;
public class menu_driven2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
         do {
             System.out.println("The options are :");
             System.out.println("1. series 1");
             System.out.println("2. series 2");
             System.out.println("3. series 3");
             System.out.println("4. EXIT");
             ch = sc.nextInt();

             switch(ch) {
                 case 1 :
                 System.out.println("ENter the number of terms :");
                 int n = sc.nextInt();
                 int sum = 0;
                 for(int i = 1; i<= n; i++){
                     if (i %2 == 0) {
                         sum -= i;
                     }
                     else {
                         sum += i;
                     }
                 }
                 System.out.println("sum = " + sum);
                 break;
                 case 2 :
                 System.out.println("Enter the number of terms :");
                 int n2 = sc.nextInt();
                 double sum1 = 0.0;
                 System.out.println("Enter the value of X ");
                 int x = sc.nextInt();
                 for(int i = 1; i<= n2 ; i++) {
                     sum1 = sum1 + 1/Math.pow(x,i);
                 }
                 System.out.println(" Sum = "+ sum1);
                 break;

                 case 3:
                 System.out.println("ENter the number of terms :");
                 int n3 = sc.nextInt();
                 System.out.println("Enter the value of X");
                 int x2 = sc.nextInt();
                 System.out.println("Enter the value of A ");
                 int a = sc.nextInt();
                 double sum2 = 0.0;
                 for(int i = 1; i<= n3 ; i++) {
                     sum2 = sum2 + a / Math.pow(x2, i);
                 }
                 System.out.println("sum = "+ sum2);
                 break;

                 case 4 :
                 System.out.println("EXIT");
                 break;
                 default :
                 System.out.println("INVALID OPTION");
             }
         }
        while(ch!=4);
    }
}