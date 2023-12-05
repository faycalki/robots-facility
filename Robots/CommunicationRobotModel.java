package Robots;

public class CommunicationRobotModel {
    private boolean isCommunicationEstablished;

    public CommunicationRobotModel() {
        this.isCommunicationEstablished = false;
    }

    public boolean isCommunicationEstablished() {
        return isCommunicationEstablished;
    }

    public void setCommunicationEstablished(boolean communicationEstablished) {
        isCommunicationEstablished = communicationEstablished;
    }

}
