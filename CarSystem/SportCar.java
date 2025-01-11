public class SportCar extends Car {
    int turboBoost;
    //paramatizrd constructor
    public SportCar(String make,String model,String color,int speed){
        super(make,model,color,speed);
        this.turboBoost=0;
        System.out.println("the sport car is crated");
    }

    //active turbo mode
    public void turbomode(){
        super.accelerate(); //the super keyword allow us to use methodes of superclass vehicle
        this.turboBoost+=50;
        super.speed+=turboBoost;
        System.out.println("turbo boost activated");
    }
}