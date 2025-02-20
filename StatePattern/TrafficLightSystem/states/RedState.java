package StatePattern.TrafficLightSystem.states;

import StatePattern.TrafficLightSystem.TrafficLight;
import StatePattern.TrafficLightSystem.abstractions.TrafficLightState;

public class RedState implements TrafficLightState {

    @Override
    public void change(TrafficLight light) {
        System.out.println("Red light - Cars must stop.");
        light.setCurrentState(new GreenState());
    }

}
