package Robots;

public class ExplorationRobotController implements Robot {
    private ExplorationRobotModel model;
    private ExplorationRobotView view;
    private static final String EXPECTED_EXPLORE_CODE = "explore()";

    public ExplorationRobotController(ExplorationRobotModel model, ExplorationRobotView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void executeCode(String code) {
        if (isValidCode(code, EXPECTED_EXPLORE_CODE)) {
            explore();
        } else {
            view.displayCannotExecuteCode();
        }
    }

    private void explore() {
        model.setExplored(true);
        view.displayExplorationComplete();
    }

    @Override
    public void diagnose() {
        view.displayDiagnosing();
    }

    @Override
    public boolean isFunctioning() {
        return model.hasExplored();
    }

    // Placeholder for coding challenge
    public void executeExplorationChallenge() {
        RobotChallenge.executeExplorationChallenge();
    }

    /**
     * Temporary measure
     * @param inBoolean the new value for the flag
     */
    @Override
    public void setFunctioning(boolean inBoolean) {
        model.setExplored(inBoolean);
    }
}
