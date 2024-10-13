public class HelloWorld {
    public static void main(String[] args) {
        char attendence = 'O';
        switch (attendence) {
            case 'O':
                System.out.println("On-Duty");
                break;

            case 'P':
                System.out.println("Attend Classes");
                break;
            
            case 'A':
                System.out.println("Not Attend Classes");
                break;
            
        
            default:
                System.out.println("Invalid");
        }
    }
}
