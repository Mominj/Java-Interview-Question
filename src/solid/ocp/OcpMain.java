package solid.ocp;
//https://www.linkedin.com/pulse/solid-through-java-examples-md-ariful-islam-rana?trk=article-ssr-frontend-pulse_more-articles_related-content-card
public class OcpMain {


    public static void main(String[] args) {
        Vehicales car = new CarSpeed("Car", 23);
        Vehicales bike = new BikeSpeed("Bike", 20);
        System.out.println(car.calculatedVehicalesSpeed());
        System.out.println(bike.calculatedVehicalesSpeed());
    }
}
