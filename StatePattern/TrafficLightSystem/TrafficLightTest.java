package StatePattern.TrafficLightSystem;

public class TrafficLightTest {
    public static void main(String[] args) {
        var trafficLight = new TrafficLight();
        for (int i = 0; i < 6; i++) {
            trafficLight.changeColor();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
