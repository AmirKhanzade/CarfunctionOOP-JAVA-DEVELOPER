public class Car extends Vehicle {
    
    int seatPosition;

    //defult constructor
    public Car(String model,String make,String color,int speed){
        //The default super() call is implicit and happens only with default and no-argument constructors.  
        // Java called the default constructor of the Vehicle class
        //In Java, the super keyword points to the superclass, so you use the super() method to access the superclass constructor. 
        //you can access the superclass constructor only from within the subclass constructor. 
        //Add a parameterized constructor to the Car class that takes make, model, 
        //and color as arguments. Inside the constructor, 
        //make an explicit call to the super() method with the required arguments and set the initial 
        super(model,make, color,speed);
        this.seatPosition=0;
        System.out.println("Car created.");

    }
    public void adjustSeat(int adjustment){
        if(adjustment>0){
            System.out.println("the seat is moving forward");
            this.seatPosition+=adjustment;
        }
        else if(adjustment<0){
            System.out.println("the seat is moving backward");
            this.seatPosition-=adjustment;
        }
    }
}
