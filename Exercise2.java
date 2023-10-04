import sim.Calls;
import sim.Sim;

public class Exercise2 {
    public static void main(String[] args) {
        Sim user1 = new Sim(327185647);

        Calls firstCall = new Calls(352489748, 4.53);
        Calls secondCall = new Calls(352489748, 4.53);
        Calls thirdCall = new Calls(352489748, 4.53);
        Calls fourthCall = new Calls(352489748, 4.53);
        Calls fifthCall = new Calls(352489748, 4.53);

        user1.setList(firstCall, secondCall, thirdCall, fourthCall, fifthCall);

        System.out.println(user1);
    }
}
