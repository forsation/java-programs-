import java.util.Scanner;
public class electricity {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name, add ;
        int inr, fir, unit, amt = 0, ta;
        long ph;

        System.out.println(" Enter your name :");
        name = sc.nextLine();
        System.out.println("Enter your address : ");
        add = sc.nextLine();
        System.out.println("Enter the phone number : ");
        ph = sc.nextLong();
        System.out.println("Initial reading : ");
        inr = sc.nextInt();
        System.out.println("Final reading : "); 
        fir = sc.nextInt();

        unit = fir - inr;

        if(unit <= 100) {
            amt = unit * 2;
        }
        else if (unit > 100 && unit <= 400) {
            amt = 100 * 2 + (unit - 100) * 5;
        }
        else if (unit > 400 && unit <= 700) {
            amt = 100 * 2 + 300 * 5 + (unit - 400) * 10;
        }
        else if (unit > 700 && unit <= 1200) {
            amt = 100 * 2 + 300 * 5 + 300 * 10 + (unit - 700) * 12;
        }
        else if (unit > 1200) {
            amt = 100 * 2 + 300 * 5 + 300 * 10 + 500 * 12 + (unit-1200) * 15;
        }

        ta = 800 + amt;

        System.out.println("The bill is :" + amt);
        System.out.println("units consumed :" + unit);
        System.out.println("Rental Charges : 800 ");
        System.out.println("Total bill : "+ ta);

    }
}


