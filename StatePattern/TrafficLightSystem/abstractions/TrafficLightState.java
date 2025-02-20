package StatePattern.TrafficLightSystem.abstractions;

import StatePattern.TrafficLightSystem.TrafficLight;

public interface TrafficLightState {
    void change(TrafficLight light);
}
