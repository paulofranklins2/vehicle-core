public class Moped extends Transportation {
    private boolean hasPedals;

    public boolean hasPedals() {
        return hasPedals;
    }

    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }

    public void kickStart() {
        System.out.println("Moped kickstarted.");
    }
}
