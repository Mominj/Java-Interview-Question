package solid.ocp;

public class BikeSpeed extends Vehicales{

    public BikeSpeed(String type, Integer maxSpeed) {
        super(type, maxSpeed);
    }

    @Override
    public double calculatedVehicalesSpeed() {
        return super.getMaxSpeed()*1.5;
    }
}
