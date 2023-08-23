abstract class Computer{  //Cannot create object rather instance of this class is created then accessed
    abstract void turnOff(); // Abstract method only for declaration and must be override when calling the respective function
    void turnOn(){
        System.out.println("Turning on");
    }
}
class HP extends Computer{
    void turnOn() {
    System.out.println("Turning on HP");
    }
    void turnOff(){
        System.out.println("Turning Off HP");
    }
}
class DELL extends Computer{
    void turnOn() {
        System.out.println("Turning on DELL");
    }
    void turnOff(){
        System.out.println("Turning Off DELL");
    }
}
class Abstract {
    public static void main(String[] args) {
        HP ob =new HP();
        ob.turnOn();
        ob.turnOff();

        DELL ob1 =new DELL();
        ob1.turnOn();
        ob1.turnOff();
    }
}
