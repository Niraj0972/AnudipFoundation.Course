interface A{
    void takeOff();
    void land();
}
class Plane implements A{
    public void takeOff(){
        System.out.println("Plane is ready to takeoff");
    }
    public void land(){
        System.out.println("Plane is ready for landing");

    }

}
public class InterfaceDemo {
    public static void main(String[] args) {
        Plane p = new Plane();
        p.takeOff();
        p.land();
    }
    
}
