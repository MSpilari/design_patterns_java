package StatePattern.TrafficLightSystem;

import StatePattern.TrafficLightSystem.abstractions.TrafficLightState;
import StatePattern.TrafficLightSystem.states.GreenState;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        this.currentState = new GreenState();
    }

    public void changeColor() {
        currentState.change(this);
    }

    public void setCurrentState(TrafficLightState newColor) {
        this.currentState = newColor;
    }

    public TrafficLightState getCurrentState() {
        return currentState;
    }
}
