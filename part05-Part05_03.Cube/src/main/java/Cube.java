
public class Cube {
    
    private int edgeLength;
    private int volume;
    
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        this.volume = this.edgeLength * this.edgeLength * this.edgeLength;
        return this.volume;
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
    
}
