public class Construt {
    int rollno;
    int marks;

    Construt(){
        // System.out.println("This is Default Constructor");
        // rollno = num;
        // marks = marks;
    }
    void display(){
        System.out.println(rollno);
    }
}

class Construct{
    public static void main(String[] args) {
        Construt obj = new Construt();
        System.out.println(obj.marks);
        System.out.println(obj.rollno);
    }
}
