package A40_Interfaces.Task1.vehicles;

import A40_Interfaces.Task1.AbstractVehicle;
import A40_Interfaces.Task1.interfaces.Electric;
import A40_Interfaces.Task1.interfaces.Gas;

public class ToyotaPlus extends AbstractVehicle implements Electric, Gas {
    @Override
    public String changeBattery() {
        return "Change every 1.5 year";
    }

    @Override
    public String changeOil() {
        return "Change every 3 mounts";
    }

    @Override
    public String drive() {
        return "Fast...";
    }
}
