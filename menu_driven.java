import java.util.Scanner;
public class menu_driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("The options are :");
            System.out.println("1. series 1");
            System.out.println("2 . series 2");
            System.out.println(" 3. series 3");
            System.out.println("4. Exit");
            ch = sc.nextInt();
            switch(ch) {
                case 1 :
                System.out.println("Enter the terms of number :");
                int n = sc.nextInt();
                System.out.println();
                for (int i = 1; i<=n; i++) {
                    int sum = i*i;
                    System.out.println(sum + " ");
                }

                break;

                case 2:
                System.out.println("enter the number of terms :");
                int n2 = sc.nextInt();
                System.out.println();
                for (int i = 1; i<=n2; i++) {
                    int sum2 = (i*i) + 1;
                    System.out.println(sum2 +" ");
                    
                }

                break;

                case 3 :
                System.out.print("Enter the number of terms :");
                int n3 = sc.nextInt();
                System.out.println();
                for (int i=1 ; i<= n3; i++) {
                    int sum3 = (i*i) - 1;
                    System.out.println(sum3 +" ");
                }
            
                break;

                case 4 :
                System.out.println(" EXIT ");
                break;

                default :
                System.out.println(" invalid option ");
            }
        
            }
            while (ch != 4);
        }
    }
