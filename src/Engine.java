public abstract class Engine {
    int engineSpeed;
    boolean isOn;

    public Engine() {
        this.engineSpeed = 0;
        this.isOn = false;
    }

    abstract void increase();
    abstract void decrease();

    abstract void onSpeedChange(int carSpeed);

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
