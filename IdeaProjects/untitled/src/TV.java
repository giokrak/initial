public class TV {

    private int inches;
    private String technology;

    public TV(int inches, String technology) {
        this.inches = inches;
        this.technology = technology;
    }

    public void TVpower(){
        System.out.println("Power button pressed");
    }

    public int getInches() {
        return inches;
    }

    public String getTechnology() {
        return technology;
    }
}
