package gui;

import logic.GUIConnector;

public class JavaFXGUI implements GUIConnector {
    private final RacetrackController racetrackController;

    public JavaFXGUI(RacetrackController racetrackController) {
        this.racetrackController = racetrackController;
    }

    @Override
    public void setTrack(int[][] track) {
        racetrackController.loadTrack(track);
    }
}
