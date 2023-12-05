package Robots;

public class SecurityRobotController implements Robot {
    private SecurityRobotModel model;
    private SecurityRobotView view;
    private static final String EXPECTED_SECURE_CODE = "secure()";

    public SecurityRobotController(SecurityRobotModel model, SecurityRobotView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void executeCode(String code) {
        if (isValidCode(code, EXPECTED_SECURE_CODE)) {
            secure();
        } else {
            view.displayCannotExecuteCode();
        }
    }

    private void secure() {
        model.setSecured(true);
        view.displaySecuringComplete();
    }

    @Override
    public void diagnose() {
        view.displayDiagnosing();
    }

    @Override
    public boolean isFunctioning() {
        return model.isSecured();
    }

    // Placeholder for coding challenge
    public void executeSecurityChallenge() {
        RobotChallenge.executeSecurityChallenge();
    }

    /**
     * Temporary measure
     * @param inBoolean the new value for the flag
     */
    @Override
    public void setFunctioning(boolean inBoolean) {
        model.setSecured(inBoolean);
    }
}
