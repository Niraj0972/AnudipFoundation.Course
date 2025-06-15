abstract class Demo{
    abstract void turnOn();
    abstract void turnOff();

    // Concrete method
    void start(){
        System.out.println("Start the TV");
    }
}
class TV extends Demo{
    void turnOn(){
        System.out.println("TV is on");
    }
    void turnOff(){
        System.out.println("TV is off");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        TV t = new TV();
        t.turnOn();
        t.turnOff();

    }
}
