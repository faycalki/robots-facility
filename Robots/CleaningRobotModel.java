package Robots;

public class CleaningRobotModel {

    private boolean isClean;


    public CleaningRobotModel() {
        this.isClean = false;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
