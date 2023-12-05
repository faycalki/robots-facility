/**
 * Manages the game state, including the graph of rooms, the current room,
 * and the user's interactions with the game.
 * Handles initializing the game, processing user commands, and tracking repaired rooms.
 * Maintains information about the current room, game completion status, and repaired rooms.
 *
 * @author Faycal Kilali
 * @version 1.0
 */
// GameModel.java
import Robots.Robot;
import Graph.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class GameModel {
    private Graph<Room> gameGraph;
    private Room currentRoom;
    private boolean gameFinished;

    private GameController controller;

    private ArrayList<Room> repairedRooms;

    /**
     * Constructs a GameModel instance with a specified game graph.
     *
     * @param gameGraph The graph representing the game's rooms and connections.
     */
    public GameModel(Graph<Room> gameGraph) {
        this.gameGraph = gameGraph;
        this.currentRoom = null;
        this.gameFinished = false;
        this.repairedRooms = new ArrayList<>();
    }
    /**
     * Constructs a GameModel instance with a default empty game graph.
     */
    public GameModel() {
        this.gameGraph = new Graph<Room>();
        this.currentRoom = null;
        this.gameFinished = false;
        this.repairedRooms = new ArrayList<>();
    }

    /**
     * Initializes the game by setting up the initial game state.
     * Called at the beginning of the game.
     */
    public void initializeGame() {
        // Set up the initial game state, maybe move all the starter code to here?
        currentRoom = gameGraph.getVertex(0);
    }

    /**
     * Processes the user's command, updating the game state accordingly.
     *
     * @param userInput The user's input command.
     */
    public void processUserCommand(String userInput) {
        // Logic to process user commands, game state should also update accordingly.

        if (userInput.equalsIgnoreCase("interact with robot")) {
            interactWithRobot();
        }

        ArrayList<Room> connectedRooms = gameGraph.getToVertices(currentRoom);

        if (!connectedRooms.isEmpty()) {
            System.out.println("Choose the next room:");

            for (Room room : connectedRooms) {
                if (repairedRooms.contains(room)) {
                    System.out.println("- " + room.getName());
                }
            }

            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine().trim();

            Room chosenRoom = findRoomByName(connectedRooms, userChoice);

            if (chosenRoom != null) {
                if (repairedRooms.contains(chosenRoom)) {
                    currentRoom = chosenRoom;
                } else {
                    System.out.println("The robot in that room must be repaired before you can move there. Try something else.");
                }
            } else {
                System.out.println("Invalid choice. Try something else.");
            }
        } else {
            System.out.println("There are no available rooms to move to.");
        }
    }
    /**
     * Handles the interaction with the robot in the current room.
     * Retrieves the robot type, displays interaction information, and
     * implements logic for challenges specific to each robot type.
     */
    private void interactWithRobot() {
        Robot robot = currentRoom.getRobot();

        // Get the robot type from the current room
        String robotType = "Cleaning Robot";  // Replace with actual logic to determine robot type

        // Display the robot interaction in the terminal
        controller.displayRobotInteraction(robotType, robot.isFunctioning());

        // This would be a potentially decent spot to implement logic for challenges, methods, etc. specific to each robot type
    }
    /**
     * Finds and returns a room by its name within a list of rooms.
     *
     * @param rooms The list of rooms to search.
     * @param name  The name of the room to find.
     * @return The Room object with the specified name, or null if not found.
     */
    private Room findRoomByName(ArrayList<Room> rooms, String name) {
        for (Room room : rooms) {
            if (room.getName().equalsIgnoreCase(name)) {
                return room;
            }
        }
        return null;
    }
    /**
     * Retrieves the current room of the game.
     *
     * @return The current Room object.
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }
    /**
     * Checks if the game has finished.
     *
     * @return True if the game has finished, false otherwise.
     */
    public boolean isGameFinished() {
        return gameFinished;
    }
    /**
     * Adds a room to the list of repaired rooms.
     *
     * @param room The Room object representing the repaired room.
     */
    public void repairRobotInRoom(Room room) {
        repairedRooms.add(room);
    }
    /**
     * Retrieves the game graph representing the rooms and connections.
     *
     * @return The Graph object representing the game graph.
     */
    public Graph<Room> getGameGraph() {
        return gameGraph;
    }
}
