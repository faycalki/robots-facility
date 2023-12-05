package Robots;

import java.util.Scanner;

public class RobotChallenge {

    private RobotChallenge() {
        // private constructor to prevent instantiation
    }

    public static void executeCleaningChallenge() {
        System.out.println("\u001B[31mCleaning Robot Challenge:\u001B[0m");
        System.out.println("The room is spotless, but an unnatural chill hangs in the air.");
        System.out.println("Execute the correct cleaning code to bring order and dispel the \u001B[35meerie atmosphere\u001B[0m.");


        boolean puzzleSolved = false;
        Scanner scanner = new Scanner(System.in);

        // Placeholder logic: Player needs to clean the room by entering the correct code
        while (!puzzleSolved) {
            System.out.println("Enter the cleaning code (e.g., '\u001B[36mclean()\u001B[0m'):");
            String userCode = scanner.nextLine().trim();

            if (userCode.equalsIgnoreCase("clean()")) {
                System.out.println("The room becomes pristine, and the \u001B[35meerie chill dissipates\u001B[0m. Challenge complete!");
                puzzleSolved = true;
            } else {
                System.out.println("The \u001B[35meerie chill persists\u001B[0m. Try a different approach.");

                // Offer a hint if requested
                System.out.println("Would you like a hint? (Type '\u001B[33mhint\u001B[0m' to get a hint)");
                String userChoice = scanner.nextLine().trim().toLowerCase();

                if (userChoice.equals("hint")) {
                    System.out.println("\u001B[33mHint:\u001B[0m The correct code involves a method related to cleanliness.");
                }
            }
        }
    }


    public static void executeExplorationChallenge() {
        System.out.println("\u001B[31mExploration Robot Challenge:\u001B[0m");
        System.out.println("Lost in the labyrinth of glitches, echoes of unseen realms linger.");
        System.out.println("Pathways are obscured by \u001B[35mshadows\u001B[0m.");
        System.out.println("Navigate the glitchy labyrinth and reveal the hidden pathways.");
        System.out.println("Enter the correct commands to subdue the echoes and dispel the \u001B[35mshadows\u001B[0m.");

        boolean puzzleSolved = false;
        Scanner scanner = new Scanner(System.in);

        while (!puzzleSolved) {
            // Offer a hint option
            System.out.println("Type '\u001B[33mhint\u001B[0m' for a hint or enter the commands:");

            String userCommands = scanner.nextLine().trim().toLowerCase();

            if (userCommands.equals("hint")) {
                provideExplorationChallengeHint();
            } else if (userCommands.equals("go forward, turn right, go forward, turn left, go forward")) {
                System.out.println("The echoes subside, and the hidden pathways dissipate.");
                puzzleSolved = true;

            }
        }
    }

    // ...

    private static void provideExplorationChallengeHint() {
        System.out.println("\u001B[33mHint:\u001B[0m To reveal the hidden pathways and subdue the echoes,");
        System.out.println("consider the sequence of commands as a navigational pattern.");
        System.out.println("Observe your surroundings and think about the logical steps");
        System.out.println("to find your way through the glitchy labyrinth.");

        // Provide more specific hints or even part of the solution
        System.out.println("\u001B[33mHint 2:\u001B[0m The correct sequence involves multiple turns and forward movements.");
        System.out.println("\u001B[33mHint 3:\u001B[0m Start by going forward, then turn right, and continue this pattern.");
        System.out.println("\u001B[33mHint 4:\u001B[0m Remember to adjust your direction based on the echoes in the unseen realms.");

        System.out.println("If none of those hints work, here's the full solution: go forward, turn right, go forward, turn left, go forward");
    }

    // ...

    public static void executePuzzleChallenge() {
        System.out.println("\u001B[31mPuzzle Solving Robot Challenge:\u001B[0m");
        System.out.println("The room is filled with enigmatic symbols, and a holographic puzzle awaits.");
        System.out.println("Cryptic whispers echo, entwining solutions in \u001B[35mshadows\u001B[0m.");
        System.out.println("Solve the puzzle to bring patterns into harmony and dispel the \u001B[35mshadows\u001B[0m.");

        boolean puzzleSolved = false;
        Scanner scanner = new Scanner(System.in);

        // Player needs to arrange symbols in the correct order
        while (!puzzleSolved) {
            System.out.println("Arrange the symbols in the correct order:");
            System.out.println("Symbols: \u001B[36mA, B, C, D\u001B[0m");
            String userOrder = scanner.nextLine().trim().toUpperCase();

            if (userOrder.equals("ABCD")) {
                System.out.println("The symbols align, and the \u001B[35mshadows are dispelled\u001B[0m. Challenge complete!");
                puzzleSolved = true;

            } else {
                System.out.println("The \u001B[35mwhispers persist\u001B[0m. Try a different arrangement.");

                // Offer a hint if requested
                System.out.println("Would you like a hint? (Type '\u001B[33mhint\u001B[0m' to get a hint)");
                String userChoice = scanner.nextLine().trim().toLowerCase();

                if (userChoice.equals("\u001B[33mhint\u001B[0m")) {
                    System.out.println("\u001B[33mHint:\u001B[0m The correct order follows the alphabetical sequence.");
                }
            }
        }
    }

    public static void executeCommunicationChallenge() {
        System.out.println("\u001B[31mCommunication Robot Challenge:\u001B[0m");
        System.out.println("The air crackles with static, and the walls resonate with an otherworldly frequency.");
        System.out.println("Transmit the correct messages to harmonize voices and reveal the shadows.");

        // Implement challenge logic here
        // For example, the player needs to transmit messages in a specific order
        // Provide hints or additional information to guide the player

        boolean puzzleSolved = false;
        Scanner scanner = new Scanner(System.in);

        // Placeholder logic: Player needs to transmit messages in the correct order
        while (!puzzleSolved){


        System.out.println("Transmit messages in the correct order (e.g., 'Message A, Message B, Message C'):");
        String userMessages = scanner.nextLine().trim().toLowerCase();

        if (userMessages.equals("message a, message b, message c")) {
            System.out.println("The voices harmonize, and shadows are revealed. Challenge complete!");
            puzzleSolved = true;

        } else {
            System.out.println("The static persists. Try aligning the voices differently.");

            // Offer a hint if requested
            System.out.println("Would you like a hint? (Type 'hint' to get a hint)");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            if (userChoice.equals("hint")) {
                System.out.println("Hint: The correct order follows a logical sequence in communication.");
            }
        }
    }
    }

    public static void executeSecurityChallenge() {
        System.out.println("\u001B[31mSecurity Robot Challenge:\u001B[0m");
        System.out.println("The room is secure, yet an unsettling feeling creeps up your spine.");
        System.out.println("Solve the security breach by providing accurate intruder alerts.");

        boolean puzzleSolved = false;
        Scanner scanner = new Scanner(System.in);

        while (!puzzleSolved){

        // Placeholder logic: Player needs to analyze alerts and identify the correct ones
        System.out.println("Identify the accurate intruder alerts (e.g., 'Alert: Room A, Intruder detected'):");
        String userAlerts = scanner.nextLine().trim().toLowerCase();

        if (userAlerts.equals("alert: room a, intruder detected")) {
            System.out.println("The room is secure, and the unsettling feeling vanishes. Challenge complete!");
            puzzleSolved = true;

        } else {
            System.out.println("The unease lingers. Try refining your analysis.");

            // Offer a hint if requested
            System.out.println("Would you like a hint? (Type 'hint' to get a hint)");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            if (userChoice.equals("hint")) {
                System.out.println("Hint: Focus on the specific rooms mentioned in the alerts.");
            }
        }
    }
    }

    public static void executeRepairChallenge() {
        System.out.println("\u001B[31mRepair Robot Challenge:\u001B[0m");
        System.out.println("In this room, a Repair Robot surrounded by dismantled parts awaits.");
        System.out.println("Whirrs of despair fill the air, and the gears grind to a \u001B[35mhaunting melody\u001B[0m.");
        System.out.println("Restore critical functions to bring a \u001B[35msymphony to repair and purpose\u001B[0m to the turning gears.");


        boolean puzzleSolved = false;
        Scanner scanner = new Scanner(System.in);

        while (!puzzleSolved) {
            // Placeholder logic: Player needs to enter the correct repair sequence
            System.out.println("Enter the correct repair sequence (e.g., 'fix gears', 'restore power', etc.):");
            String userSequence = scanner.nextLine().trim().toLowerCase();

            if (userSequence.equals("fix gears, restore power, calibrate sensors")) {
                System.out.println("The gears turn with purpose, and a \u001B[35msymphony of repair resonates\u001B[0m. Challenge complete!");
                puzzleSolved = true;
            } else {
                System.out.println("The \u001B[35mwhirrs of despair persist\u001B[0m. Try a different sequence.");

                // Offer a hint if requested
                System.out.println("Would you like a hint? (Type '\u001B[33mhint\u001B[0m' to get a hint)");
                String userChoice = scanner.nextLine().trim().toLowerCase();

                if (userChoice.equals("\u001B[33mhint\u001B[0m")) {
                    System.out.println("\u001B[33mHint:\u001B[0m Start with fixing the gears to set the foundation for the repair.");
                }
            }
        }
    }
}
