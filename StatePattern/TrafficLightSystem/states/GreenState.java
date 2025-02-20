package StatePattern.TrafficLightSystem.states;

import StatePattern.TrafficLightSystem.TrafficLight;
import StatePattern.TrafficLightSystem.abstractions.TrafficLightState;

public class GreenState implements TrafficLightState {

    @Override
    public void change(TrafficLight light) {
        System.out.println("Green light - Cars can go.");
        light.setCurrentState(new YellowState());
    }

}
