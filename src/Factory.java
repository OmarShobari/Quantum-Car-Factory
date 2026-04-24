import java.util.ArrayList;

public class Factory {
    ArrayList<Car> cars;

    public Factory() {
        cars = new ArrayList<>();
    }

    Car createCar(Engine engine){
        Car newCar = new Car(engine);
        cars.add(newCar);
        return newCar;
    }

    void replaceEngine(Car car , Engine engine){
        car.setEngine(engine);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}

