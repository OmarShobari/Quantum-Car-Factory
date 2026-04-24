public class GasEngine extends Engine {
    public GasEngine() {
        super();
    }
    @Override
    void onSpeedChange(int carSpeed){
        System.out.print("The current speed is " + carSpeed);
    };
}
