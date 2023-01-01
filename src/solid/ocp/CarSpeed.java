package solid.ocp;

public class CarSpeed  extends Vehicales{

    public CarSpeed(String type, Integer maxSpeed) {
        super(type, maxSpeed);
    }

    @Override
    public double calculatedVehicalesSpeed() {
        return super.getMaxSpeed()*.8;
    }
}
