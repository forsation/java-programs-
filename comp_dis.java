import java.util.Scanner;
public class comp_dis {
        
            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                String na, add;
                char tp;
                double amt, ta, dis; 
        
            System.out.println("Enter your name : ");
            na = sc.nextLine();
            System.out.println("enter your address : ");
            add = sc.nextLine();
            System.out.println("enter the amount of purchase : ");
            amt = sc.nextDouble();
            System.out.println("enter the type of purchase l for laptop and p for pc: ");
            tp = sc.next().charAt(0);
        
            if (tp == 'l') {
                
                if (amt>0 && amt <= 25000) {
                    dis = 0;
                    
                }
                else if (amt>25000 && amt<=57000) {
                    dis = 5/100 * amt;
                    ta = amt - dis;
                }
                else if (amt>57000 && amt <=100000) {
                    dis = 7.5/100 * amt;
                    ta = amt - dis;
                }
                else if ( amt > 100000) {
                    dis = 10/100 * amt;
                    ta = amt - dis;
                }
            }
                if (tp == 'p') {
            
                    if (amt>0 && amt <= 25000) {
                    dis = 5/100*amt;
                    ta = amt - dis;
                    
                }
                    else if (amt>25000 && amt<=57000) {
                    dis = 7.5/100 * amt;
                    ta = amt - dis;
                }
                    else if (amt>57000 && amt <=100000) {
                    dis = 10/100 * amt;
                    ta = amt - dis;
                }                                        
                    else if ( amt > 100000)   {
                    dis = 15/100 * amt; 
                    ta = amt - dis;
                }
                }
                System.out.println(" The net amount is :"+ ta);
                System.out.println("The name is :"+ na);
                System.out.println("The address is :"+add);
            
            }    
}

