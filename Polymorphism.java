class Plane {
    void show(){
        System.out.println("Plane");
    }

    void display(){
        System.out.println("Display");
    }
}

class PassengerPlane extends Plane{
    void show(){
        System.out.println("Passenger Plane");
    }
   
}


class Airport{
    static void prmit(Plane p){
        p.display();
        p.show();
    }
}

class Polymorphism{
    public static void main(String[] args){
    Plane p = new PassengerPlane();
    Airport .prmit(p);     
    }
}