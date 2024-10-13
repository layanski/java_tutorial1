public class Polymorphism {
    public static void main(String[] args) {
        Method obj = new Method();
        obj.display();
        obj.display(5);
    }
}

class Method{
    void display(){
        System.out.println("I am void function");
    }
    void display(int a){
        System.out.println(a);
    }
}
