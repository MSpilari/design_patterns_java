package StatePattern.TrafficLightSystem.states;

import StatePattern.TrafficLightSystem.TrafficLight;
import StatePattern.TrafficLightSystem.abstractions.TrafficLightState;

public class YellowState implements TrafficLightState {

    @Override
    public void change(TrafficLight light) {
        System.out.println("Yellow light - Get ready to stop.");
        light.setCurrentState(new RedState());
    }

}
