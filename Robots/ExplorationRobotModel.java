package Robots;

public class ExplorationRobotModel {
    private boolean hasExplored;

    public ExplorationRobotModel() {
        this.hasExplored = false;
    }

    public boolean hasExplored() {
        return hasExplored;
    }

    public void setExplored(boolean explored) {
        hasExplored = explored;
    }
}
