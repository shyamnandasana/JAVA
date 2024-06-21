class Vehicle{
     int noofPassenger;
     int maxSpeed;

     public void Display(){
        System.out.println("pass="+ noofPassenger);
        System.out.println("speed="+ maxSpeed);
     }
}
class Car extends Vehicle{
    double hp;
    int airbg;
    public void Display(){
        System.out.println("pass="+ noofPassenger);
        System.out.println("speed="+ maxSpeed);
        System.out.println("hp="+ noofPassenger);
        System.out.println("airbag="+ maxSpeed);    
    }
}
public class Extends {
    public static void main(String[] args) {
        Vehicle e=new Vehicle();
        e.noofPassenger=12;
        e.maxSpeed=120;
        System.out.println("-----vehicle-----");
        e.Display();

        Car c= new Car();
        c.noofPassenger=12;
        c.maxSpeed=120;
        c.hp=1.6;
        c.airbg=8;
        System.out.println("------car-------");
        c.Display();


        }
    
}
