package Transports;

import FactoriesInterface.Transport;

public class Plane implements Transport {

    @Override
    public void deliver() {
        System.out.println("Your cargo will be delivered by a plane !");
    }

}
