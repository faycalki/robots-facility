// Room.java

import Robots.*;
//import Robots.Robot;

import java.util.ArrayList;

/**
 * Represents a room in the robot facility simulator.
 * Each room has a name, description, available commands, and may contain a robot.
 * Handles command execution, robot interaction, and room navigation.
 *
 * @author Faycal Kilali
 * @version 1.0
 */

public class Room {
    private String name;
    private String description;
    private ArrayList<String> availableCommands;

    private Robot robot;  // Added field to store the robot

    private GameController controller; // coupling issue

    /**
     * Constructs a Room with the specified name and description.
     *
     * @param name        The name of the room.
     * @param description The description of the room.
     */
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.availableCommands = new ArrayList<>();
    }


    /**
     * Initializes and returns the appropriate robot based on the type.
     *
     * @implSpec Currently unused
     * @param robotType The type of robot to initialize.
     * @return The initialized robot.
     */
    private static Robot initializeRobot(String robotType) {

        return null;
    }

    /**
     * Gets the name of the room.
     *
     * @return The name of the room.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the description of the room.
     *
     * @return The description of the room.
     */
    public String getDescription() {
        return description;
    }


    /**
     * Adds a command to the list of available commands for the room.
     *
     * @param command The command to add.
     */
    public void addCommand(String command) {
        availableCommands.add(command.toLowerCase());
    }

    /**
     * Executes the given command and returns the result.
     *
     * @param command The command to execute.
     * @return The result of executing the command.
     */
    public String executeCommand(String command) {
        command = command.toLowerCase();

        // Check if the command involves interacting with a robot
        if (command.startsWith("interact with")) {
            // Extract the robot type from the command
            String robotType = command.substring("interact with".length()).trim();

            // Find the corresponding room and its robot
            Robot robot = getRobot();

            if (robot != null) {
                // Display robot interaction information
                controller.displayRobotInteraction(robotType, robot.isFunctioning());

                // Check the type of the robot and invoke the corresponding challenge
                // TODO: allow user to exit, for now, enforce no exit so that we can just force true on the challenge being successful if the user attempts to get out of it.
                if (!robot.isFunctioning()) {
                    if (robot instanceof CleaningRobotController) {
                        ((CleaningRobotController) robot).executeCleaningChallenge();
                        robot.setFunctioning(true);
                        description = "As you enter, you are greeted by a once malfunctioning Cleaning Robot. Its mechanical arms now move smoothly, and the strange symbols on its display have faded. The room is spotless, but an eerie calm hangs in the air.";
                    } else if (robot instanceof ExplorationRobotController) {
                        ((ExplorationRobotController) robot).executeExplorationChallenge();
                        robot.setFunctioning(true);
                        description = "As you step into the room, glitches distort your vision. The Exploration Robot, once malfunctioning, now stands confidently in a corner. Shadows dance predictably, revealing the cleared pathways.";

                    } else if (robot instanceof PuzzleSolvingRobotController) {
                        ((PuzzleSolvingRobotController) robot).executePuzzleSolvingChallenge();
                        robot.setFunctioning(true);
                        description = "You find yourself in a room filled with enigmatic symbols, and a Puzzle Solving Robot is at peace. It gazes at a holographic puzzle with all pieces in place. The room exudes an aura of intellectual accomplishment.";

                    } else if (robot instanceof CommunicationRobotController) {
                        ((CommunicationRobotController) robot).executeCommunicationChallenge();
                        robot.setFunctioning(true);
                        description = "The air crackles with static as you step into a room dominated by a once malfunctioning Communication Robot. Its speakers emit clear sounds, and the walls resonate with a harmonious frequency.";

                    } else if (robot instanceof SecurityRobotController) {
                        ((SecurityRobotController) robot).executeSecurityChallenge();
                        robot.setFunctioning(true);
                        description = "Entering this room, you find a Security Robot that was once glitchy, now standing guard with precision. The room is secure, yet an unsettling feeling lingers.";


                    } else if (robot instanceof RepairRobotController) {
                        ((RepairRobotController) robot).executeRepairChallenge();
                        robot.setFunctioning(true);
                        description = "In this room, you encounter a Repair Robot surrounded by dismantled parts. Sparks fly as it successfully fixes itself. The room is cluttered with tools, and the echoes of robotic repairs resonate through the metallic walls.";

                    }
                    controller.displayRobotInteraction(robotType, robot.isFunctioning());
                }

                return "You interact with the " + robotType + " in the room. ";
            } else {
                return "There is no robot of type " + robotType + " in this room.";
            }

        } else if (command.startsWith("go to")) {
            if (robot.isFunctioning()) {

                // Handle the case where the player goes to another room
                String destinationRoom = command.substring("go to".length()).trim();

                // Add logic to set the current room to the new room and update the description
                Room newRoom = controller.getRoomByName(destinationRoom, this);
                if (newRoom != null) {
                    controller.setCurrentRoom(newRoom);
                    //description = "You enter the " + newRoom.getName() + ". " + newRoom.getDescription();
                    return "You go to the " + destinationRoom + ".";
                } else {
                    return "There is no room named " + destinationRoom + ".";
                }
            }
            else{
                return "The robot appears to prevent you from going elsewhere. You may have to repair it to continue.";
            }
        }
        return "Invalid command. Try something else.";
    }

    /**
     * Gets an array of available commands for the room.
     *
     * @return An array of available commands.
     */
    public String[] getAvailableCommands() {
        return availableCommands.toArray(new String[0]);
    }

    /**
     * Gets the robot in the room.
     *
     * @return The robot in the room.
     */
    public Robot getRobot() {
        return robot;
    }

    /**
     * Setter method for the robot in the room
     * @param robot the robot to be in the room
     */
    public void setRobot(Robot robot) {
        this.robot = robot;
    }


    /**
     * Sets the controller for the room.
     *
     * @param controller The controller to set.
     */
    public void setController(GameController controller) {
        this.controller = controller;
    }
}
