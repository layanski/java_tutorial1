abstract class Computer{
    abstract void turnOff();

    abstract void turnOn();
}
class HP extends Computer{
    void turnOn(){
        System.out.println("Turning ON-1");
    }
    void turnOff(){
        System.out.println("Turning off-HP");
    }
}

class DELL extends Computer{
    void turnOn(){
        System.out.println("Hello");
    }
    void turnOff(){
        System.out.println("Turning Off-Dell");
    }
}


public class Abstract {
    public static void main(String[] args) {
        HP ob = new HP();
        ob.turnOn();
        ob.turnOff();

        DELL ob1 = new DELL();
        ob1.turnOn();
        ob1.turnOff();
    }
}
