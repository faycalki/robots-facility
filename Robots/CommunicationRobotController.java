package Robots;

public class CommunicationRobotController implements Robot {
    private CommunicationRobotModel model;
    private CommunicationRobotView view;
    private static final String EXPECTED_COMMUNICATION_CODE = "establishCommunication()";

    public CommunicationRobotController(CommunicationRobotModel model, CommunicationRobotView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void executeCode(String code) {
        if (isValidCode(code, EXPECTED_COMMUNICATION_CODE)) {
            establishCommunication();
        } else {
            view.displayCannotExecuteCode();
        }
    }

    private void establishCommunication() {
        model.setCommunicationEstablished(true);
        view.displayCommunicationEstablished();
    }

    @Override
    public void diagnose() {
        view.displayDiagnosing();
    }

    @Override
    public boolean isFunctioning() {
        return model.isCommunicationEstablished();
    }

    // Placeholder for coding challenge
    public void executeCommunicationChallenge() {
        RobotChallenge.executeCommunicationChallenge();
    }

    /**
     * Temporary measure
     * @param inBoolean the new value for the flag
     */
    @Override
    public void setFunctioning(boolean inBoolean) {
        model.setCommunicationEstablished(inBoolean);
    }


}
