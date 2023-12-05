// GameController.java
import java.util.Scanner;
/**
 * Controls the game flow, user input, and interaction between the model and view.
 * Manages the game state and facilitates communication between the model and view components.
 * Handles the start of the game, user commands, and updating the current room.
 *
 * @author Faycal Kilali
 * @version 1.0
 */
public class GameController {

    private Room currentRoom;
    private GameModel model;
    private GameView view;
    /**
     * Constructs a GameController instance with the specified model, view, and initial room.
     *
     * @param model      The GameModel representing the game state.
     * @param view       The GameView responsible for displaying game information.
     * @param initialRoom The initial Room where the player starts the game.
     */
    public GameController(GameModel model, GameView view, Room initialRoom) {
        this.model = model;
        this.view = view;
        this.currentRoom = initialRoom;
    }
    /**
     * Starts the game by displaying the welcome message, initializing the game state, and beginning the game loop.
     */
    public void startGame() {
        view.displayWelcomeMessage();
        model.initializeGame();
        playGame();
    }
    /**
     * Handles the user's command, updates the current room, and displays the result of the command.
     *
     * @param command The user's input command.
     */
    public void handleCommand(String command) {
        String result = currentRoom.executeCommand(command);
        System.out.println(result);

      // Check if the command resulted in a room change
  //    Room nextRoom = model.getNextRoom(command);
  //    if (nextRoom != null) {
  //        currentRoom = nextRoom;
     // }
    }
    /**
     * Sets the current room to the specified room.
     *
     * @param inRoom The Room object to set as the current room.
     */
    public void setCurrentRoom(Room inRoom){
        if (inRoom != null){
            currentRoom = inRoom;

        }
    }

    /**
     * Initiates the game loop, prompting the user for commands until the game is finished or the user quits.
     */

    private void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (!model.isGameFinished()) {
            view.displayCurrentRoom(currentRoom);
            view.displayAvailableCommands(currentRoom.getAvailableCommands());

            String userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals("quit")) {
                view.displayQuitMessage();
                break;
            }

            handleCommand(userInput);
        }

        scanner.close();
    }
    /**
     * Displays the interaction information for a specific robot type.
     *
     * @param robotType     The type of robot being interacted with.
     * @param isFunctioning True if the robot is functioning, false otherwise.
     */

    public void displayRobotInteraction(String robotType, boolean isFunctioning){
        view.displayRobotInteraction(robotType, isFunctioning);
    }
    /**
     * Retrieves the GameModel associated with this controller.
     *
     * @return The GameModel object.
     */
    public GameModel getGameModel(){
        return model;
    }


    /**
     * Retrieves a room by its name from the game graph.
     * @implSpec Coupling issues are actually present here
     *
     * @param inName   The name of the room to retrieve.
     * @param currRoom The current Room object to search for connected rooms.
     * @return The Room object with the specified name, or null if not found.
     */
    public Room getRoomByName(String inName, Room currRoom){
        for (Room room: model.getGameGraph().getToVertices(currRoom)){
            if (room.getName().equalsIgnoreCase(inName)){
                return room;
            }
        }
        return null;
    }
}
