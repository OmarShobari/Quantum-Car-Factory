public abstract class Engine {
    int engineSpeed;
    boolean isOn;

    public Engine() {
        this.engineSpeed = 0;
        this.isOn = false;
    }

    void increase(){
        this.engineSpeed++;
        System.out.print("The engine's speed has increased by 1 km/h");
    };
    void decrease(){
        this.engineSpeed--;
        System.out.print("The engine's speed has decreased by 1 km/h");
    };

    void onSpeedChange(int carSpeed){};

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        this.isOn = true;
    }
    public void setOff() {
        this.isOn = false;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }
}
