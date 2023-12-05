package Robots;

public class PuzzleSolvingRobotController implements Robot {
    private PuzzleSolvingRobotModel model;
    private PuzzleSolvingRobotView view;
    private static final String EXPECTED_SOLVE_CODE = "solvePuzzle()";

    public PuzzleSolvingRobotController(PuzzleSolvingRobotModel model, PuzzleSolvingRobotView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void executeCode(String code) {
        if (isValidCode(code, EXPECTED_SOLVE_CODE)) {
            solvePuzzle();
        } else {
            view.displayCannotExecuteCode();
        }
    }

    private void solvePuzzle() {
        model.setPuzzleSolved(true);
        view.displayPuzzleSolved();
    }

    @Override
    public void diagnose() {
        view.displayDiagnosing();
    }

    @Override
    public boolean isFunctioning() {
        return model.isPuzzleSolved();
    }

    // Placeholder for coding challenge
    public void executePuzzleSolvingChallenge() {
        RobotChallenge.executePuzzleChallenge();
    }

    /**
     * Temporary measure
     * @param inBoolean the new value for the flag
     */
    @Override
    public void setFunctioning(boolean inBoolean) {
        model.setPuzzleSolved(inBoolean);
    }
}
