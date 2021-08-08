    import java.util.Scanner;
    public class interest {
        Scanner sc = new Scanner(System.in);
        String na;
        String add;
        long ph;
        int age;
        int sum;
        String toc;
        double yr;
        double amt;
        double ta;
        public void input(){
            System.out.println(" Enter the customers name :");
            na = sc.nextInt();
            System.out.println("Enter the customers adress :");
            add = sc.nextInt();
            System.out.println("Enter phone number :");
            ph = sc.nextDouble();
            System.out.println("ENter customers age :");
            age = sc.nextInt();
            System.out.println("Enter the term of deposit scheme ");
            sum = sc.nextInt();
        }

        public void calcInt() {
            if (age <= 60) {
                toc = "general";
                if(yr <= 1) {
                    amt = (5.8 * sum * yr) / 100;
                }
                
                else if(yr >1 && yr <= 2) {
                        amt (6.2 * sum * yr) / 100;
                    }
                    else if (yr >2 && yr <= 3) {
                        amt = (8.5 * sum * yr ) /100;
                    }
                    else if (yr >3 && yr <= 4) {
                        amt = (9* sum * yr) /100;
                    }
                    else if(yr > 4 && yr <= 5) {
                        amt = (9.5 * sum * yr)/ 100;
                    }
                    else {
                        amt = (10 * sum * yr ) / 100;
                    }
                }
                if (age > 60) {
                    toc = "senior citizen";
                    if(yr <= 1) {
                        amt = (8 * sum * yr) / 100;
                    }
                    
                    else if(yr >1 && yr <= 2) {
                            amt (9.5 * sum * yr) / 100;
                        }
                        else if (yr >2 && yr <= 3) {
                            amt = (10 * sum * yr) / 100;
                        }
                        else if (yr >3 && yr <= 4) {
                            amt = (10.5* sum * yr) /100;
                        }
                        else if(yr > 4 && yr <= 5) {
                            amt = (11 * sum * yr)/ 100;
                        }
                        else {
                            amt = (11.5 * sum * yr ) / 100;
                        }
                }
                ta = amt + sum;
            }

        }
        public void display () {
            System.out.println("Customer's Name : "+na);
            System.out.println("Customer's Address : "+add);
            System.out.println("Customer's Age : "+age); 
            System.out.println("Customer Type :"+toc);
            System.out.println("Customer's Phone Number: "+ph);
            System.out.println("Sum in Term Deposit Scheme: "+sum);
            System.out.println("Number of Terms: "+year);
            System.out.println("Interest on the Sum :"+amt);
            System.out.println("Total Amount :"+famt);

        }

        public static void main(String[] args) {
        Interest it = new Interest();
        it.input();
        it.calcInt();
        it.display();
        }
    }