public class Car {
    Engine engine;
    int carSpeed;

    public Car(Engine engine) {
        this.engine = engine;
        this.carSpeed = 0;
    }

    void start(){
        this.engine.isOn = true;
        this.engine.engineSpeed = 0;
        System.out.print("The engine has started");
    }
    void stop(){
        if (this.carSpeed == 0) {
            while (this.engine.engineSpeed > 0){
                this.engine.decrease();
            }
            this.engine.isOn = false;
            System.out.print("The engine has stopped");
        } else {
            System.out.print("The car should be parked first");
        }
    }

    void accelerate(){
        if (this.carSpeed < 200){
            this.engine.increase();
            this.carSpeed += 20;
            System.out.print("The car's speed has increased by 20 km/h");
            engine.onSpeedChange(this.carSpeed);
        } else {
            System.out.print("The car is already at the maximum speed");
        }
    }
    void brake(){
        if (this.carSpeed > 0){
            this.engine.decrease();
            this.carSpeed -= 20;
            System.out.print("The car's speed has decreased by 20 km/h");
            System.out.print("The current speed is " + this.carSpeed);
            engine.onSpeedChange(this.carSpeed);
        } else {
            System.out.print("The car is already parked");
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
