public class Sofa {

    private int seats;
    private String colour;
    private String fabric;

    public Sofa(int seats, String colour, String fabric) {
        this.seats = seats;
        this.colour = colour;
        this.fabric = fabric;
    }

    public int getSeats() {
        return seats;
    }

    public String getColour() {
        return colour;
    }

    public String getFabric() {
        return fabric;
    }
}
