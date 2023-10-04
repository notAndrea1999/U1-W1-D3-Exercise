package sim;

import java.util.Arrays;

public class Sim {
    private int telephoneNumber;
    private int credit;
    private Calls[] callsArr = new Calls[5];

    public Sim(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.credit = 0;
    }


    public Calls[] getCallsArr() {
        return callsArr;
    }

    public void setList(Calls list1, Calls list2, Calls list3, Calls list4, Calls list5) {
        this.callsArr[0] = list1;
        this.callsArr[1] = list2;
        this.callsArr[2] = list3;
        this.callsArr[3] = list4;
        this.callsArr[4] = list5;
    }

    @Override
    public String toString() {
        return "Sim {" +
                "number = " + telephoneNumber +
                ", credit = " + credit +
                ", list=" + Arrays.toString(callsArr) +
                '}';

    }
}
