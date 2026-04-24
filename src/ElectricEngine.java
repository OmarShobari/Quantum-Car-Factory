public class ElectricEngine extends Engine {
    @Override
    void onSpeedChange(int carSpeed){
        System.out.println("The current speed is " + carSpeed);
    };
}
