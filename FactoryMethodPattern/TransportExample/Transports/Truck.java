package Transports;

import FactoriesInterface.Transport;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Your cargo will be delivered by a truck !");
    }

}
