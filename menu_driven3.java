import java.util.Scanner;
public class menu_driven3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("The options are :");
            System.out.println("1. Pattern 1");
            System.out.println("2. Pattern 2");
            System.out.println("3. Pattern 3");
            System.out.println("4. EXIT");
            ch = sc.nextInt();
            
            switch(ch) {
                case 1 :
                int n = 1;
                for(int i = 1; i<= 5; i++) {
                    for (int j = 1; j<= 5; j++) {
                        System.out.print(n + "");
                        n++;
                    }
                    System.out.println();
                }
                break;
                
                case 2:
                for(int i = 5; i >= 1 ;i--) {
                    for (int j =5; j>=i; j--) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

                case 3:
                for(int i =1; i<=5 ; i++) {
                    for(int j = 5; j>=i;j--){
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

                case 4:
                System.out.println(" EXIT ");
                break;

                default :
                System.out.println(" INVALID OPTION ");
            }
        }
        while (ch!= 4);
    }
}