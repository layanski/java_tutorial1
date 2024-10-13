import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =12;

        do{
            System.out.println("Enter the number >10:");
            count = scan.nextInt();

        }
        while(count<10);
    }
    
}
