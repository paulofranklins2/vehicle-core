public class Hovercraft extends Transportation {
    private boolean canHoverOverWater;

    public boolean canHoverOverWater() {
        return canHoverOverWater;
    }

    public void setCanHoverOverWater(boolean canHoverOverWater) {
        this.canHoverOverWater = canHoverOverWater;
    }

    public void engageLiftSystem() {
        System.out.println("Lift system engaged.");
    }
}
