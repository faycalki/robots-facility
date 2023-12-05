import Graph.Edge;
import Robots.*;

/**
 * Main initializer and main method for the robot facility simulator.
 * Manages the initialization of the game components, rooms, robots, and controllers.
 * Connects the rooms with edges to form a game graph and generates movement commands based on the graph.
 * Starts the game loop by invoking the GameController.
 * @author Faycal Kilali
 * @version 1.0
 */
public class RobotGameMain {


    /**
     * The main method that initializes and starts the robot facility simulator.
     *
     * @param args Command line arguments (unused).
     */
    public static void main(String[] args) {
        GameModel model = new GameModel();
        GameView view = new GameView();

        // Initialize rooms

        Room cleaningRoom = new Room("Cleaning Room", "As you enter, you are greeted by a malfunctioning Cleaning Robot. Its mechanical arms twitch erratically, and strange symbols flash on its display. The room is spotless, but an unnatural chill hangs in the air."
        );
        cleaningRoom.addCommand("Interact with Cleaning Robot");

        Room securityRoom = new Room("Security Room", "Entering this room, you find a malfunctioning Security Robot standing guard. Its red optics flicker, scanning the surroundings with glitchy precision. The room is secure, yet an unsettling feeling creeps up your spine."
        );
        securityRoom.addCommand("Interact with Security Robot");

        Room communicationRoom = new Room("Communication Room", "The air crackles with static as you step into a room dominated by a malfunctioning Communication Robot. Its speakers emit distorted sounds, and the walls seem to resonate with an otherworldly frequency."
        );
        communicationRoom.addCommand("Interact with Communication Robot");

        Room explorationRoom = new Room("Exploration Room", "As you step into the room, glitches distort your vision. The malfunctioning Exploration Robot stands in a corner, its sensors flickering randomly. Shadows dance unpredictably, making the pathways uncertain."
        );
        explorationRoom.addCommand("Interact with Exploration Robot");

        Room puzzleRoom = new Room("Puzzle Room", "You find yourself in a room filled with enigmatic symbols and a malfunctioning Puzzle Solving Robot. It gazes at a holographic puzzle with broken pieces scattered around. The room exudes an aura of intellectual challenge." );
        puzzleRoom.addCommand("Interact with Puzzle Solving Robot");

        Room repairRoom = new Room("Repair Room", "In this room, you encounter a Repair Robot surrounded by dismantled parts. Sparks fly as it attempts to fix itself. The room is cluttered with tools, and the echoes of robotic repairs reverberate through the metallic walls."
        );
        repairRoom.addCommand("Interact with Repair Robot");

        // Initialize the controller for each room (coupling issue for now, will figure out later)

        // Initialize robots for the rooms
        CleaningRobotModel cleaningRobotModel = new CleaningRobotModel();
        CleaningRobotView cleaningRobotView = new CleaningRobotView();
        CleaningRobotController cleaningRobotController = new CleaningRobotController(cleaningRobotModel, cleaningRobotView);
        cleaningRoom.setRobot(cleaningRobotController);

        SecurityRobotModel securityRobotModel = new SecurityRobotModel();
        SecurityRobotView securityRobotView = new SecurityRobotView();
        SecurityRobotController securityRobotController = new SecurityRobotController(securityRobotModel, securityRobotView);
        securityRoom.setRobot(securityRobotController);

        CommunicationRobotModel communicationRobotModel = new CommunicationRobotModel();
        CommunicationRobotView communicationRobotView = new CommunicationRobotView();
        CommunicationRobotController communicationRobotController = new CommunicationRobotController(communicationRobotModel, communicationRobotView);
        communicationRoom.setRobot(communicationRobotController);

        ExplorationRobotModel explorationRobotModel = new ExplorationRobotModel();
        ExplorationRobotView explorationRobotView = new ExplorationRobotView();
        ExplorationRobotController explorationRobotController = new ExplorationRobotController(explorationRobotModel, explorationRobotView);
        explorationRoom.setRobot(explorationRobotController);


        PuzzleSolvingRobotModel puzzleSolvingRobotModel = new PuzzleSolvingRobotModel();
        PuzzleSolvingRobotView puzzleSolvingRobotView = new PuzzleSolvingRobotView();
        PuzzleSolvingRobotController puzzleSolvingRobotController = new PuzzleSolvingRobotController(puzzleSolvingRobotModel, puzzleSolvingRobotView);
        puzzleRoom.setRobot(puzzleSolvingRobotController);

        RepairRobotModel repairRobotModel = new RepairRobotModel();
        RepairRobotView repairRobotView = new RepairRobotView();
        RepairRobotController repairRobotController = new RepairRobotController(repairRobotModel, repairRobotView);
        repairRoom.setRobot(repairRobotController);

        // Create the game controller with the initialized components
        GameController controller = new GameController(model, view, cleaningRoom);
        cleaningRoom.setController(controller);
        securityRoom.setController(controller);
        communicationRoom.setController(controller);
        puzzleRoom.setController(controller);
        explorationRoom.setController(controller);
        repairRoom.setController(controller);

        // Insert the rooms into the game (unconnected right now)
        model.getGameGraph().addVertex(cleaningRoom);
        model.getGameGraph().addVertex(securityRoom);
        model.getGameGraph().addVertex(communicationRoom);
        model.getGameGraph().addVertex(puzzleRoom);
        model.getGameGraph().addVertex(explorationRoom);
        model.getGameGraph().addVertex(repairRoom);

        // Connect the rooms with edges

        model.getGameGraph().addEdge(cleaningRoom, securityRoom);
        model.getGameGraph().addEdge(cleaningRoom, communicationRoom);

        model.getGameGraph().addEdge(securityRoom, cleaningRoom);
        model.getGameGraph().addEdge(communicationRoom, cleaningRoom);

        model.getGameGraph().addEdge(securityRoom, explorationRoom);
        model.getGameGraph().addEdge(explorationRoom, securityRoom);

        model.getGameGraph().addEdge(explorationRoom, communicationRoom);
        model.getGameGraph().addEdge(communicationRoom, explorationRoom);

        model.getGameGraph().addEdge(explorationRoom, puzzleRoom);
        model.getGameGraph().addEdge(puzzleRoom, explorationRoom);

        model.getGameGraph().addEdge(puzzleRoom, repairRoom);
        model.getGameGraph().addEdge(repairRoom, puzzleRoom);


        // Generate movement commands based on edges
        for (Edge<Room> edge: model.getGameGraph().getEdges()){
            edge.getFromVertex().addCommand("Go to " + edge.getToVertex().getName());
        }

        // Start the game loop
        controller.startGame();
    }
}