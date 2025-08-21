public class Resultados {
    private int maximum;
    private int minimum;
    private Long amountFirstList;
    private Long amountSecondList;
    private boolean multipleOfTwo;
    private boolean divOfTwo;
    private boolean even;
    private boolean evenTwo;
    private boolean odd;
    private boolean oddTwo;

    public Resultados(int maximum, int minimum, Long amountFirstList, Long amountSecondList,
            boolean multipleOfTwo, boolean divOfTwo,
            boolean even, boolean evenTwo,
            boolean odd, boolean oddTwo) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.amountFirstList = amountFirstList;
        this.amountSecondList = amountSecondList;
        this.multipleOfTwo = multipleOfTwo;
        this.divOfTwo = divOfTwo;
        this.even = even;
        this.evenTwo = evenTwo;
        this.odd = odd;
        this.oddTwo = oddTwo;
    }

    @Override
    public String toString() {
        return this.maximum + " " + this.minimum + " " + this.amountFirstList + " " + this.amountSecondList + " "
                + this.multipleOfTwo + " "
                + this.divOfTwo
                + " " + this.even + " " + this.evenTwo + " " + this.odd + " " + this.oddTwo;
    }
}
