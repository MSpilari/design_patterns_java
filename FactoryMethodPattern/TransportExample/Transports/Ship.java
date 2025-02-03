package Transports;

import FactoriesInterface.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Your cargo will be delivered by a ship !");
    }

}
