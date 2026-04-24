public class ElectricEngine extends Engine {
    @Override
    void onSpeedChange(int carSpeed){
        System.out.print("The current speed is " + carSpeed);
    };
}
