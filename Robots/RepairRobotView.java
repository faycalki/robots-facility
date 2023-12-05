package Robots;

public class RepairRobotView {
    public void displayRepairComplete() {
        System.out.println("Repair Robot: Repair complete. I am now fully operational!");
    }

    public void displayCannotExecuteCode() {
        System.out.println("Repair Robot: I cannot execute this code. Try 'repair()' to start repairing.");
    }

    public void displayDiagnosing() {
        System.out.println("Repair Robot: Diagnosing internal components. All systems are operational.");
    }
}
