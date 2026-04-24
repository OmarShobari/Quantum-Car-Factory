public class ElectricEngine extends Engine {
    @Override
    void onSpeedChange(int carSpeed){
        System.out.println("The current car speed is " + carSpeed);
    };

    @Override
    void increase(){
        this.engineSpeed++;
        System.out.println("The gas engine's speed has increased by 1 to be " +this.engineSpeed+" km/h");
    }
    @Override
    void decrease(){
        this.engineSpeed--;
        System.out.println("The gas engine's speed has decreased by 1 to be " +this.engineSpeed+" km/h");
    };
}
