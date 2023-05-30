
// RewardValue Class - Represents correspondence btw currencies (cash, miles, etc...)
public class RewardValue {
    private final double cashValues;
    private final int milesValue;
    public static final double MILES_TO_CASH_CONVERSION = 0.0035;

    // Constructor with cash value
    public RewardValue(double cashValues) {
        this.cashValues = cashValues;
        this.milesValue = (int) (cashValues / MILES_TO_CASH_CONVERSION);
    }

    // Constructor with miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValues = milesValue * MILES_TO_CASH_CONVERSION;
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
