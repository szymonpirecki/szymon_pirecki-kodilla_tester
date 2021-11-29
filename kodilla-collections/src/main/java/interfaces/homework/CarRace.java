package interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car passat = new Volkswagen(0);
        Car rapid = new Skoda(0);
        Car signum = new Opel(0);
    doRace(passat);
    doRace(rapid);
    doRace(signum);
    
    }
    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }

}
