package Robots;

public class ExplorationRobotView {
    public void displayExplorationComplete() {
        System.out.println("Exploration Robot: Exploration complete. I've discovered new areas!");
    }

    public void displayCannotExecuteCode() {
        System.out.println("Exploration Robot: I cannot execute this code. Try 'explore()' to start exploration.");
    }

    public void displayDiagnosing() {
        System.out.println("Exploration Robot: Diagnosing internal components. All systems are operational.");
    }
}
