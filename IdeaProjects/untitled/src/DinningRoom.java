public class DinningRoom {

    private int chairs;
    private Table table;

    public DinningRoom(int chairs, Table table) {
        this.chairs = chairs;
        this.table = table;
    }

    public void AddChairs(int chairs){
        System.out.println(chairs + " chairs added to the dinning room");
    }

    public int getChairs() {
        return chairs;
    }

    public Table getTable() {
        return table;
    }
}
