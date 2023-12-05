package Robots;

public class RepairRobotController implements Robot {
    private RepairRobotModel model;
    private RepairRobotView view;
    private static final String EXPECTED_REPAIR_CODE = "repair()";

    public RepairRobotController(RepairRobotModel model, RepairRobotView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void executeCode(String code) {
        if (isValidCode(code, EXPECTED_REPAIR_CODE)) {
            repair();
        } else {
            view.displayCannotExecuteCode();
        }
    }

    private void repair() {
        model.setRepaired(true);
        view.displayRepairComplete();
    }

    @Override
    public void diagnose() {
        view.displayDiagnosing();
    }

    @Override
    public boolean isFunctioning() {
        return model.isRepaired();
    }

    // Placeholder for coding challenge
    public void executeRepairChallenge() {
        RobotChallenge.executeRepairChallenge();
    }

    /**
     * Temporary measure
     * @param inBoolean the new value for the flag
     */
    @Override
    public void setFunctioning(boolean inBoolean) {
        model.setRepaired(inBoolean);
    }
}
