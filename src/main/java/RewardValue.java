
// RewardValue Class - Represents correspondence btw currencies (cash, miles, etc...)
public class RewardValue {
    private double cashValues = 0;
    private int milesValue = 0;

    //constructor with cash value
    public RewardValue(double cashValues) {
        this.cashValues = cashValues;
        this.milesValue = (int) (cashValues / 0.0035);
    }

    //constructor with miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValues = milesValue * 0.0035;
    }

    // Getter for cash value
    public double getCashValue() {
        return this.cashValues;
    }

    // Getter for miles value
    public int getMilesValue() {
        return this.milesValue;
    }
}
