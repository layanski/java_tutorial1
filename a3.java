import java.util.Scanner;

class a3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];

        for (int i=0;i<=size-1;i++){
            marks[i]= scan.nextInt();
        }
    }
}
