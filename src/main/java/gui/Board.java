package gui;

public class Board {

    public int[][] getTrack() {
        return track;
    }

    public int getDirection() {
        return direction;
    }

    public Player[] getPlayer() {
        return player;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    private final int[][] track;
    private final int direction;
    private final Player[] player;
    private final int currentPlayer;

    public Board(int[][] track, int direction, Player[] player, int currentPlayer) {
        this.track = track;
        this.direction = direction;
        this.player = player;
        this.currentPlayer = currentPlayer;
    }
}
