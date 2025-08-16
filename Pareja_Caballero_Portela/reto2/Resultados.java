public class Resultados {
    private int maximum;
    private int minimum;
    private int size;

    public Resultados(int maximum, int minimum, int size) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.size= size;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getSize() {
        return size;
    }
}
