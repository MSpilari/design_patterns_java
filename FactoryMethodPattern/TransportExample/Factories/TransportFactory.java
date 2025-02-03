package Factories;

import FactoriesInterface.Transport;
import Transports.Plane;
import Transports.Ship;
import Transports.Truck;

public class TransportFactory {

    public static Transport chooseTransport(String type) {
        if (type == "truck") {
            return new Truck();
        } else if (type == "plane") {
            return new Plane();
        } else if (type == "ship") {
            return new Ship();
        } else {
            throw new IllegalArgumentException("Unknown transport type: " + type);
        }
    }
}
