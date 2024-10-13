public class print {
    public static void main(String[] args) {
        navPrint(10);
    } 


public static void navPrint(int n){
    //Base Case
    if(n==1){
        System.out.println(1);
    }
    //recursive
    else{
        System.out.println(n);
        navPrint(n-1);
    }
}
}
