package Robots;

public class CleaningRobotView {
    public void displayCleaningComplete() {
        System.out.println("Cleaning Robots: Cleaning complete. The area is now spotless!");
    }

    public void displayCannotExecuteCode() {
        System.out.println("Cleaning Robots: I cannot execute this code. Try 'clean()' to start cleaning.");
    }

    public void displayDiagnosing() {
        System.out.println("Cleaning Robots: Diagnosing internal components. All systems are functional.");
    }
}
