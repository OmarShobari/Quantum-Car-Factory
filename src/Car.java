public class Car {
    Engine engine;
    int carSpeed;

    public Car(Engine engine) {
        this.engine = engine;
        this.carSpeed = 0;
    }

    void start(){
        this.engine.setOn();
        this.engine.setEngineSpeed(0);
        System.out.println("The engine has started");
        this.engine.onSpeedChange(0);
    }
    void stop(){
        if (this.carSpeed == 0) {
            while (this.engine.getEngineSpeed() > 0){
                this.engine.decrease();
            }
            this.engine.setOff();
            System.out.println("The engine has stopped");
        } else {
            System.out.println("The car should be parked first");
        }
    }

    void accelerate(){
        if (this.engine.isOn()){
            if (this.carSpeed < 200){
                this.engine.increase();
                this.carSpeed += 20;
                System.out.println("The car's speed has increased by 20 km/h");
                engine.onSpeedChange(this.carSpeed);
            } else {
                System.out.println("The car is already at the maximum speed");
            }
        } else {
            System.out.println("Start the engine first");
        }
    }
    void brake(){
        if (this.carSpeed > 0){
            this.engine.decrease();
            this.carSpeed -= 20;
            System.out.println("The car's speed has decreased by 20 km/h");
            engine.onSpeedChange(this.carSpeed);
        } else {
            System.out.println("The car is already parked");
        }
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
