package solid.ocp;

public class Vehicales {
    String type;
    Integer maxSpeed;


    public Vehicales(String type, Integer maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public double calculatedVehicalesSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
