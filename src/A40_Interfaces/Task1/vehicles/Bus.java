package A40_Interfaces.Task1.vehicles;

import A40_Interfaces.Task1.AbstractVehicle;
import A40_Interfaces.Task1.interfaces.Diesel;

public class Bus extends AbstractVehicle implements Diesel {

    @Override
    public String drive() {
        return "Moves slow.";
    }
}
