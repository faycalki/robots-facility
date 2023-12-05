package Robots;

public class RepairRobotModel {
    private boolean isRepaired;

    public RepairRobotModel() {
        this.isRepaired = false;
    }

    public boolean isRepaired() {
        return isRepaired;
    }

    public void setRepaired(boolean repaired) {
        isRepaired = repaired;
    }
}
