import Factories.TransportFactory;
import FactoriesInterface.Transport;

public class TransportExampleMain {
    public static void main(String[] args) {
        Transport truck = TransportFactory.chooseTransport("truck");
        Transport plane = TransportFactory.chooseTransport("plane");
        Transport ship = TransportFactory.chooseTransport("ship");
        Transport car = TransportFactory.chooseTransport("car");

        truck.deliver();
        plane.deliver();
        ship.deliver();
        car.deliver();
    }
}
