package logic;

import gui.Board;
import gui.JavaFXGUI;

public class Game {
    private final Board board;
    private final GUIConnector guiConnector;

    public Game(Board board, GUIConnector guiConnector) {
        this.board = board;
        this.guiConnector = guiConnector;
    }

    public void start() {
        guiConnector.setTrack(board.getTrack());
    }
}
