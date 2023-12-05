package Robots;

public class SecurityRobotModel {
    private boolean isSecured;

    public SecurityRobotModel() {
        this.isSecured = false;
    }

    public boolean isSecured() {
        return isSecured;
    }

    public void setSecured(boolean secured) {
        isSecured = secured;
    }
}
