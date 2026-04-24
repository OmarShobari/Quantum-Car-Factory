public class HybridEngine extends Engine {
    GasEngine gasEngine;
    ElectricEngine electricEngine;

    public HybridEngine() {
        super();
        this.gasEngine = new GasEngine();
        this.electricEngine = new ElectricEngine();
        this.electricEngine.setOn();
    }

    public HybridEngine(GasEngine gasEngine, ElectricEngine electricEngine) {
        super();
        this.gasEngine = gasEngine;
        this.electricEngine = electricEngine;
        this.electricEngine.setOn();
    }

    @Override
    void onSpeedChange(int carSpeed){
        System.out.print("The current speed is " + carSpeed);
        if (carSpeed < 50 && gasEngine.isOn()) {
            // 1. turn on electricEngine
            electricEngine.setOn();
            // 2. increase electricEngine speed to be equal to gasEngine speed
            electricEngine.setEngineSpeed(gasEngine.getEngineSpeed());
            // 3. decrease gasEngine to be equal 0
            gasEngine.setEngineSpeed(0);
            // Note: we can use increase and decrease methods which in Engine class
            // instead of direct setters in steps 2,3. but I used setters for simplicity
            // 4. turn off gasEngine
            gasEngine.setOff();
            System.out.print("Switched to electric engine!");
        } else if (carSpeed >= 50 && electricEngine.isOn()){
            // 1. turn on gasEngine
            gasEngine.setOn();
            // 2. increase gasEngine speed to be equal to electricEngine speed
            gasEngine.setEngineSpeed(electricEngine.getEngineSpeed());
            // 3. decrease electricEngine to be equal 0
            electricEngine.setEngineSpeed(0);
            // 4. turn off electricEngine
            electricEngine.setOff();
            System.out.print("Switched to gas engine!");
        }
    };
}
