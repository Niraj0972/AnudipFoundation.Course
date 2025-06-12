
class Animal{
    void display(){
        System.out.println("This is base class");
    }
}
class Cat extends Animal{
    void display2(){
        System.out.println("This is derived class");
    }
}
class Dog extends Cat{
    void display3(){
        System.out.println("This is 2nd derived class");
    }
}

public class Inheritance {
    public static void main(String arg[]){
        Dog d = new Dog();
        d.display();
        d.display2();
        d.display3();

    }
    
}
