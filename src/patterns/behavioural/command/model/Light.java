package patterns.behavioural.command.model;

public class Light {
    private int intensity;
    private State state;

    public Light(int intensity, State state) {
        this.intensity = intensity;
        this.state = state;
    }

    public enum State {
        ON, OFF
    };

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Light{" +
                "intensity=" + intensity +
                ", state=" + state +
                '}';
    }
}
