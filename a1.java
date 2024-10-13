import java.util.Scanner;

class a1 {
    public static void main(String[] args) {
        
        

        Scanner scan = new Scanner(System.in);
        int[] marks =new int[10];

        for(int i=0;i<=9;i=i+1)
        {
            marks[i] = scan.nextInt();
        }
        // marks[0]=scan.nextInt();
        // marks[1]=scan.nextInt();
        // marks[2]=scan.nextInt();
        // marks[3]=scan.nextInt();
        // marks[4]=scan.nextInt();
       
        
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);
        System.out.println(marks[8]);
        System.out.println(marks[9]);
        System.out.println(marks[10]);
    }
}
