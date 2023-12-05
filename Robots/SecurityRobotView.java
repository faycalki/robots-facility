package Robots;

public class SecurityRobotView {
    public void displaySecuringComplete() {
        System.out.println("Security Robots: Securing complete. The area is now safe!");
    }

    public void displayCannotExecuteCode() {
        System.out.println("Security Robots: I cannot execute this code. Try 'secure()' to start securing.");
    }

    public void displayDiagnosing() {
        System.out.println("Security Robots: Diagnosing internal components. All systems are operational.");
    }
}
