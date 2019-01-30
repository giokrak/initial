public class LivingRoom {

    private Sofa sofa;
    private TV tv;
    private DinningRoom dinRoom;

    public LivingRoom(Sofa sofa, TV tv, DinningRoom dinRoom) {
        this.sofa = sofa;
        this.tv = tv;
        this.dinRoom = dinRoom;
    }

    public void WatchTV(){
        getTv().TVpower();
    }

    public void MorePeople(){
        getDinRoom().AddChairs(18);
    }

    private Sofa getSofa() {
        return sofa;
    }

    private TV getTv() {
        return tv;
    }

    private DinningRoom getDinRoom() {
        return dinRoom;
    }
}
