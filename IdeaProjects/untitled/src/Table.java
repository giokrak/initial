public class Table {

    private int width;
    private int length;
    private String material;

    public Table(int width, int length, String material) {
        this.width = width;
        this.length = length;
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }
}
