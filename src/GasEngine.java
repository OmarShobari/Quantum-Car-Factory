public class GasEngine extends Engine {
    public GasEngine() {
        super();
    }
    @Override
    void onSpeedChange(int carSpeed){
        System.out.println("The current speed is " + carSpeed);
    };
}
