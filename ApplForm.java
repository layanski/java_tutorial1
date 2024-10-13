class ApplForm {
    private String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setValues(String str, int num){
        name = str;
        rollno = num;
    }

    public String getValue(){
       return name;
    }
}

class Main{
    public static void main(String[] args) {
    ApplForm codeio = new ApplForm();
    codeio.setValues ("Codeio",101) ;
    codeio.display();
    System.out.println(codeio.rollno);

    ApplForm viewer = new ApplForm();
    viewer.setValues ("viewer",1001) ;
    viewer.display();
    String std1 = viewer.getValue();
    System.out.println(std1+"= std1" );
    }
 }

