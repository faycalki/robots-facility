package Robots;

public class CommunicationRobotView {
    public void displayCommunicationEstablished() {
        System.out.println("Communication Robots: Communication established. I can now receive messages!");
    }

    public void displayCannotExecuteCode() {
        System.out.println("Communication Robots: I cannot execute this code. Try 'establishCommunication()' to start communication.");
    }

    public void displayDiagnosing() {
        System.out.println("Communication Robots: Diagnosing internal components. All systems are operational.");
    }
}
