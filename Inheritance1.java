 class Inheritance1 {
    public static void main(String[] args) {
        Daughter M = new Daughter();
        System.out.println(M.gender);
        Father.print();
    }
 }
 class Father{
    char gender = 'M';
      static void print(){
        System.out.println("Parent Class");
    }
}

class Daughter extends Father{
    char gender ='F';
}

