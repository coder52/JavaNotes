package A40_Interfaces.Task1;

import A40_Interfaces.Task1.interfaces.Electric;
import A40_Interfaces.Task1.vehicles.Bus;
import A40_Interfaces.Task1.vehicles.TeslaCar;
import A40_Interfaces.Task1.vehicles.ToyotaPlus;

public class Main {

    public static void main(String[] args) {

        TeslaCar teslaCar = new TeslaCar();
        teslaCar.setModel("Alfa");

        ToyotaPlus toyotaPlus = new ToyotaPlus();
        toyotaPlus.setModel("Corolla");

        Bus bus = new Bus();
        bus.setModel("Scania");

        int batteryLife = Electric.batteryLife;





    }

}
