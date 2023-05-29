public class Cube {
    private int edge;
    private int volume;

    public Cube(int edgeLength) {
        this.edge = edgeLength;
        this.volume = this.volume();
    }

    public int volume() {
        return (this.edge * this.edge * this.edge);
    }

    public String toString() {
        return ("The length of the edge is " + this.edge + " and the volume " + this.volume);
    }
}
