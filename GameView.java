/**
 * Displays information to the user during the Robots Adventure Game.
 * Handles welcome messages, room descriptions, available commands, robot interactions,
 * and quit messages.
 * Customizes terminal visuals for malfunctioning and corrected states of robots.
 *
 * @author Faycal Kilali
 * @version 1.0
 */
public class GameView {


    /**
     * Displays the welcome message for the game.
     */
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Robot Facility Game! Made by Faycal Kilali.");
    }
    /**
     * Displays the name and description of the current room.
     *
     * @param currentRoom The current room.
     */
    public void displayCurrentRoom(Room currentRoom) {
        System.out.println("\n--- " + currentRoom.getName() + " ---");
        System.out.println(currentRoom.getDescription());
    }
    /**
     * Displays the available commands for the user.
     *
     * @param commands The array of available commands.
     */
    public void displayAvailableCommands(String[] commands) {
        System.out.println("\nAvailable Commands:");
        for (String command : commands) {
            System.out.println(command);
        }
        System.out.print("Enter your command: ");
    }

    /**
     * Displays robot interaction information based on its type and functioning state.
     *
     * @param robotType     The type of the robot.
     * @param isFunctioning The functioning state of the robot.
     */
    public void displayRobotInteraction(String robotType, boolean isFunctioning) {
        // Customize terminal visual for the specific robot type
        System.out.println("************ " + robotType + " Terminal ************");

        if (isFunctioning) {
            displayCorrectedText(robotType);
        } else {
            displayMalfunctioningText(robotType);
        }

        System.out.println("************************************");
    }

    private void displayMalfunctioningText(String robotType) {
        System.out.println("\u001B[31mWARNING: " + robotType + " is currently malfunctioning.\u001B[0m");
        switch (robotType.toLowerCase()) {
            case "cleaning robot":
                displayCleaningRobotMalfunctioningText();
                break;
            case "security robot":
                displaySecurityRobotMalfunctioningText();
                break;
            case "puzzle solving robot":
                displayPuzzleSolvingRobotMalfunctioningText();
                break;
            case "communication robot":
                displayCommunicationRobotMalfunctioningText();
                break;
            case "exploration robot":
                displayExplorationRobotMalfunctioningText();
                break;
            case "repair robot":
                displayRepairRobotMalfunctioningText();
                break;
            default:
                System.out.println("Unknown robot type. Malfunctioning text not available.");
                break;
        }
    }

    private void displayCorrectedText(String robotType) {
        System.out.println("\u001B[32m" + robotType + " has been successfully repaired.\u001B[0m");

        switch (robotType.toLowerCase()) {
            case "cleaning robot":
                displayCleaningRobotCorrectedText();
                break;
            case "security robot":
                displaySecurityRobotCorrectedText();
                break;
            case "puzzle solving robot":
                displayPuzzleSolvingRobotCorrectedText();
                break;
            case "communication robot":
                displayCommunicationRobotCorrectedText();
                break;
            case "exploration robot":
                displayExplorationRobotCorrectedText();
                break;
            case "repair robot":
                displayRepairRobotCorrectedText();
                break;
            default:
                System.out.println("Unknown robot type. Corrected text not available.");
                break;
        }
    }

    // Add eerie malfunctioning and reasonable corrected text for each robot type
    private void displayCleaningRobotMalfunctioningText() {
        System.out.println("\u001B[31mCleaning Robot: ERROR - Anomalies detected in cleaning protocols.");
        System.out.println("Cleaning Robot: Unnatural cleaning patterns observed. Abnormal behavior logged.");
        System.out.println("Cleaning Robot: Whispers in the machinery... 'Filth must remain.'\u001B[0m");
    }

    private void displayCleaningRobotCorrectedText() {
        System.out.println("\u001B[32mCleaning Robot: Cleaning protocols initialized successfully.");
        System.out.println("Cleaning Robot: Normal cleaning operations restored. Whispering ceased.");
        System.out.println("Cleaning Robot: 'Cleanliness is order. Order is cleanliness.'\u001B[0m");
    }

    private void displaySecurityRobotMalfunctioningText() {
        System.out.println("\u001B[31mSecurity Robot: ALERT - Security breach detection malfunction.");
        System.out.println("Security Robot: False intruder alerts reported. Paranormal readings detected.");
        System.out.println("Security Robot: Metallic echoes whisper, 'Intruders from the shadows.'\u001B[0m");
    }

    private void displaySecurityRobotCorrectedText() {
        System.out.println("\u001B[32mSecurity Robot: Security breach detection system repaired.");
        System.out.println("Security Robot: Intruder alerts now accurate. Paranormal readings ceased.");
        System.out.println("Security Robot: 'Safe and secure. Shadows banished.'\u001B[0m");
    }

    private void displayPuzzleSolvingRobotMalfunctioningText() {
        System.out.println("\u001B[31mPuzzle Solving Robot: ERROR - Anomalies in puzzle-solving algorithms.");
        System.out.println("Puzzle Solving Robot: Incorrect solutions provided. Cryptic whispers echo.");
        System.out.println("Puzzle Solving Robot: 'Solutions entwined in shadows.'\u001B[0m");
    }

    private void displayPuzzleSolvingRobotCorrectedText() {
        System.out.println("\u001B[32mPuzzle Solving Robot: Puzzle-solving algorithms corrected.");
        System.out.println("Puzzle Solving Robot: Accurate solutions guaranteed. Cryptic whispers silenced.");
        System.out.println("Puzzle Solving Robot: 'Patterns in harmony. Shadows dispelled.'\u001B[0m");
    }

    private void displayCommunicationRobotMalfunctioningText() {
        System.out.println("\u001B[31mCommunication Robot: ERROR - Anomalies in communication protocols.");
        System.out.println("Communication Robot: Distorted messages transmitted. Cryptic whispers persist.");
        System.out.println("Communication Robot: 'Voices from beyond. Shadows in words.'\u001B[0m");
    }

    private void displayCommunicationRobotCorrectedText() {
        System.out.println("\u001B[32mCommunication Robot: Communication protocols restored to optimal state.");
        System.out.println("Communication Robot: Clear messages transmitted. Cryptic whispers silenced.");
        System.out.println("Communication Robot: 'Voices harmonized. Shadows revealed.'\u001B[0m");
    }

    private void displayExplorationRobotMalfunctioningText() {
        System.out.println("\u001B[31mExploration Robot: ERROR - Navigation systems malfunctioning.");
        System.out.println("Exploration Robot: Lost in the labyrinth of glitches. Echoes of unseen realms.");
        System.out.println("Exploration Robot: 'Lost pathways. Echoes in the unseen.'\u001B[0m");
    }

    private void displayExplorationRobotCorrectedText() {
        System.out.println("\u001B[32mExploration Robot: Navigation systems restored to optimal state.");
        System.out.println("Exploration Robot: Precision in exploration. Echoes subdued.");
        System.out.println("Exploration Robot: 'Pathways found. Echoes subdued.'\u001B[0m");
    }

    private void displayRepairRobotMalfunctioningText() {
        System.out.println("\u001B[31mRepair Robot: ERROR - Critical functions compromised.");
        System.out.println("Repair Robot: Whirrs of despair. The gears of time grind to a haunting melody.");
        System.out.println("Repair Robot: 'Despair in the whirrs. Melody in the grinding gears.'\u001B[0m");
    }

    private void displayRepairRobotCorrectedText() {
        System.out.println("\u001B[32mRepair Robot: Critical functions restored to optimal state.");
        System.out.println("Repair Robot: The symphony of repair. Gears turn with purpose.");
        System.out.println("Repair Robot: 'Symphony in repair. Purpose in the turning gears.'\u001B[0m");
    }


    /**
     * Displays the quit message for the game.
     */
    public void displayQuitMessage() {
        System.out.println("Thank you for playing! Goodbye!");
    }
}
