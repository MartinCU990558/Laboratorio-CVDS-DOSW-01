public class GeneralObject {
    private int minimum;
    private int maximum;
    private Long amount;

    public GeneralObject(int minimum, int maximum, Long amount) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.minimum + " " + this.maximum + " " + this.amount;
    }
}

