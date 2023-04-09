package A40_Interfaces.Task1.vehicles;

import A40_Interfaces.Task1.AbstractVehicle;
import A40_Interfaces.Task1.interfaces.Electric;

public class TeslaCar extends AbstractVehicle implements Electric {
    @Override
    public String changeBattery() {
        return "Change every 2 years";
    }

    @Override
    public String drive() {
        return "Faster...";
    }
}
