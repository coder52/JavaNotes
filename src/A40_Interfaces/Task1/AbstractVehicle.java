package A40_Interfaces.Task1;

public abstract class AbstractVehicle {

    private String model;
    private double engine;      // 2.5 l

    // describe how vehicle starts from 0 to 40 km/h
    public abstract String drive();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

}
