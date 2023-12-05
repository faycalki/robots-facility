package Robots;

public class PuzzleSolvingRobotModel {
    private boolean isPuzzleSolved;

    public PuzzleSolvingRobotModel() {
        this.isPuzzleSolved = false;
    }

    public boolean isPuzzleSolved() {
        return isPuzzleSolved;
    }

    public void setPuzzleSolved(boolean puzzleSolved) {
        isPuzzleSolved = puzzleSolved;
    }
}
