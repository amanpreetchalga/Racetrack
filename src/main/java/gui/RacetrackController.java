package gui;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import logic.Game;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class RacetrackController implements Initializable {
    public GridPane gridGame;
    public Pane centerPane;
    public Label textError;
    public CheckMenuItem animationVeryFast;
    public CheckMenuItem animationFast;
    public CheckMenuItem animationMedium;
    public CheckMenuItem animationSlow;
    public BorderPane borderPane;
    private int[][] track;

    public void newGame(ActionEvent actionEvent) {
    }

    public void showMenu(ActionEvent actionEvent) {
    }

    public void saveGame(ActionEvent actionEvent) {
    }

    public void quit(ActionEvent actionEvent) {
    }

    public void btnEditorClicked(ActionEvent actionEvent) {
    }

    public void checkedMenuClicked(ActionEvent actionEvent) {
    }

    public void gridGameClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gridGame.prefWidthProperty().bind(centerPane.widthProperty());
        gridGame.prefHeightProperty().bind(centerPane.heightProperty());
        gridGame.setStyle("-fx-border-color: black");
        gridGame.getChildren().retainAll();
        int[][] t = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 2, 2, 2, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        this.track=t;
        gridGame.minHeight((track.length*5)+(track.length+1)*gridGame.getHgap());
        gridGame.minHeight((track[0].length*5)+(track[0].length+1)*gridGame.getVgap());
        loadTrack(t);
    }

    @FXML
    private void loadLevelFromJson() {
        File currDir = null;
        try {
            currDir = new File(UserInterfaceController.class.getProtectionDomain().getCodeSource().getLocation().toURI());
        } catch (URISyntaxException ex) {
            System.out.println("File cannot be opened");
        }
        FileChooser fileChooser = new FileChooser();
        if (currDir != null) {
            fileChooser.setInitialDirectory(currDir.getParentFile());
        }
        fileChooser.setTitle("Open JSON Graph-File");
        File selectedFile = fileChooser.showOpenDialog(centerPane.getScene().getWindow());
        Gson gson = new Gson();
        try {
            Reader reader = new FileReader(selectedFile);
            Board board = gson.fromJson(reader, Board.class);
            Game game = new Game(board, new JavaFXGUI(this));
            game.start();
        } catch (Exception e) {
            System.out.println("File format cannot be read");
            e.printStackTrace();
        }
    }

    public void loadTrack(int[][] track) {
        this.track = track;

        gridGame.setStyle("-fx-border-color: black");
        gridGame.getChildren().retainAll();
        for (int i = 0; i < track.length; i++) {
            for (int j = 0; j < track[i].length; j++) {
                ImageView imageView = new ImageView();
                if (track[i][j] == 0) {
                    imageView.setImage(new Image("gui/images/gravel.jpg"));
                }
                if (track[i][j]==1) {
                    imageView.setImage(new Image("gui/images/track.jpg"));
                }
                if (track[i][j] == 2) {
                    imageView.setImage(new Image("gui/images/start.jpg"));
                }
                imageView.fitWidthProperty().bind(gridGame.widthProperty().divide(track.length).subtract(gridGame.getHgap()));
                imageView.fitHeightProperty().bind(gridGame.heightProperty().divide(track[i].length).subtract(gridGame.getHgap()));
                imageView.setPreserveRatio(true);
                gridGame.add(imageView, i, j);
            }
        }
    }

    public void startGameFromEditor(ActionEvent actionEvent) {
    }

    public void makeChanges(ActionEvent actionEvent) {
    }
}