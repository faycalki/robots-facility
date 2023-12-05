package Robots;

public class CleaningRobotController implements Robot {
    private CleaningRobotModel model;
    private CleaningRobotView view;
    private static final String EXPECTED_CLEAN_CODE = "clean()";

    public CleaningRobotController(CleaningRobotModel model, CleaningRobotView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void executeCode(String code) {
        if (isValidCode(code, EXPECTED_CLEAN_CODE)) {
            clean();
        } else {
            view.displayCannotExecuteCode();
        }
    }

    private void clean() {
        model.setClean(true);
        view.displayCleaningComplete();
    }

    @Override
    public void diagnose() {
        view.displayDiagnosing();
    }

    @Override
    public boolean isFunctioning() {
        return model.isClean();
    }

    /**
     * Temporary measure
     * @param inBoolean the new value for the flag
     */
    @Override
    public void setFunctioning(boolean inBoolean) {
        model.setClean(inBoolean);
    }

    // Placeholder for coding challenge
    public void executeCleaningChallenge() {
        RobotChallenge.executeCleaningChallenge();
    }
}
