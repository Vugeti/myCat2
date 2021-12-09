public abstract class Predator {

    private Color color;
    private int weight;

    public Predator(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }


    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public abstract void sleeping();

    public abstract void hunting();

}
