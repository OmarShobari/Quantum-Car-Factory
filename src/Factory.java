import java.util.ArrayList;

public class Factory {
    ArrayList<Car> cars;

    public Factory() {
        cars = new ArrayList<>();
    }

    void createCar(Engine engine){
        Car newCar = new Car(engine);
        cars.add(newCar);
    }

    void replaceEngine(Car car , Engine engine){
        car.setEngine(engine);
    }
}

