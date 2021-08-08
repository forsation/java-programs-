import java.util.Scanner;
public class salary {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double sal,in_tax = 0;
    System.out.println("Enter your annual salary :");
    sal = sc.nextDouble();

    if (sal <= 100000) {
        in_tax = 0;
    }    
    else if (sal > 100000 && sal <= 150000) {
        in_tax = (sal - 100000) * 2/100;
    }
    else if (sal > 150000 && sal <= 250000) {
        in_tax = 5000 + (sal - 150000) * 5/100;
    }
    else if (sal > 250000 && sal <= 600000) {
        in_tax = 25000 + (sal - 250000) * 10 / 100;
    }
    else if (sal > 600000 && sal <= 1000000a) {
        in_tax = 50000 + (sal - 600000) * 25/100;
    }
    else if (sal > 1000000) {
        in_tax = 100000 + (sal - 1000000) * 40/100;
    }

    System.out.println("The name is : Mr. AP Singh");
    System.out.println(" salary is :" + sal);
    System.out.println(" Income tax to be paid : " + in_tax);

    }
}