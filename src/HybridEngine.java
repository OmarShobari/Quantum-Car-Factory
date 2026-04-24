enum EngineType {
    Electric , Gas
}
public class HybridEngine extends Engine {
    GasEngine gasEngine;
    ElectricEngine electricEngine;
    EngineType workingEngine = EngineType.Electric;

    public HybridEngine() {
        super();
        this.gasEngine = new GasEngine();
        this.electricEngine = new ElectricEngine();
    }

    public HybridEngine(GasEngine gasEngine, ElectricEngine electricEngine) {
        super();
        this.gasEngine = gasEngine;
        this.electricEngine = electricEngine;
    }

    @Override
    void onSpeedChange(int carSpeed){
        System.out.println("The current speed is " + carSpeed);
        if (carSpeed < 50 && workingEngine == EngineType.Gas) {
            // 1. turn on electricEngine
            electricEngine.setOn();
            // 2. increase electricEngine speed to be equal to gasEngine speed
            while (electricEngine.getEngineSpeed() < gasEngine.getEngineSpeed()) {
                electricEngine.increase();
            }
            // 3. decrease gasEngine to be equal 0
            while (gasEngine.getEngineSpeed() > 0) {
                gasEngine.decrease();
            }
            // 4. turn off gasEngine
            gasEngine.setOff();
            System.out.println("Switched to electric engine!");
        } else if (carSpeed >= 50 && workingEngine == EngineType.Electric){
            // 1. turn on gasEngine
            gasEngine.setOn();
            // 2. increase gasEngine speed to be equal to electricEngine speed
            while (gasEngine.getEngineSpeed() < electricEngine.getEngineSpeed()) {
                gasEngine.increase();
            }
            // 3. decrease electricEngine to be equal 0
            while (electricEngine.getEngineSpeed() > 0) {
                electricEngine.decrease();
            }
            // 4. turn off electricEngine
            electricEngine.setOff();
            System.out.println("Switched to gas engine!");
        }
    };
}
