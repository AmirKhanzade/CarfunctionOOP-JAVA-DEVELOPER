public class Main {

    public static void main(String[] args) {
        //// Create a Car object using the parameterized constructor
        Car gt = new Car("mustang", "ford", "black", 10);
        SportCar ferrari=new SportCar("ferrari", "ferrari la ferrari", "red", 5);

        //// Use inherited methods
        gt.accelerate();
        gt.adjustSeat(3);
        gt.breaking();
        gt.turn();

        ferrari.turbomode();
        ferrari.accelerate();
        System.out.println("ferrari has the speed of "+ferrari.speed);

    }
}
