package sim;

public class Calls {
    private int pastCall;
    private double duration;

    public Calls(int pastCall, double duration) {
        this.pastCall = pastCall;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "{" +
                "Last-Call = " + pastCall +
                ", Time = " + duration +
                '}';
    }
}
