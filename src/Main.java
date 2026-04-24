public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();

        Engine hybrid = new HybridEngine();
        Car car = factory.createCar(hybrid);

        car.start();

        car.accelerate(); // 20
        car.accelerate(); // 40
        car.accelerate(); // 60 and switch

        car.brake(); // 40 and switch
        car.brake();
        car.brake();
        car.stop();

        System.out.println("--------------------------------");
        // replacing to gas engine
        Engine gas = new GasEngine();
        factory.replaceEngine(car, gas);
        car.start();

        car.accelerate(); // 20
        car.accelerate(); // 40
        car.accelerate(); // 60 and no switch

    }
}