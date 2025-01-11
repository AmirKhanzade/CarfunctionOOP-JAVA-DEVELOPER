public class Vehicle {

    //Vehicle superclass, which has properties such as make, model, color, and speed, 
    //along with basic movement methods like accelerate, brake, and turn.
    // Now consider your Car subclass,
    // which inherits from the Vehicle class and adds its attribute seatPosition and a method adjustSeat().

    String model;
    String make;
    String color;
    int speed;

    //defult constructor
    //Add a parameterized constructor to your Vehicle
    // that uses make, model, and color as arguments and initializes the corresponding attributes. 
    //In this constructor, set the initial speed to 0.
    public Vehicle(String model,String make,String color,int speed){
        this.model=model;
        this.make=make;
        this.color=color;
        this.speed=0;
        System.out.println("Vehicle created.");
    }

    public void accelerate(){
        System.out.println("this vehicle is speeding up");
        this.speed += 5;
    }
    public void breaking(){
        System.out.println("this vehicle is breaking the speed");
        this.speed-=5;
    }
    public void turn(){
        System.out.println("this vehicle is turning");
    }
    public void adjustSeat(int seatPosition){
        if(seatPosition>0){
            System.out.println("the seat is moving forward");
        }
        else if(seatPosition<0){
            System.out.println("the seat is moving downward");
        }
        else{
            System.out.println("the seat is not moving at all");
        }
    }
}