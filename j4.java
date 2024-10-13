import java.util.Scanner;

public class j4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your salary:");
        int salary = scan.nextInt();
        System.out.println("What is Your age:");
        int age = scan.nextInt();

        if(salary>=20000 || age<25){
            
            System.out.println("Eligible for loan");
            System.out.println("How much loan do you need?");
            int loan = scan.nextInt();

            if(loan<50000){
                System.out.println("Loan Available");
            }
        }
        else{
            System.out.println(" loan not available");
        }
    }
}
