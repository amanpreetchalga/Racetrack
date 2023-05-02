package gui;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

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

    public void newGame(ActionEvent actionEvent) {
    }

    public void showMenu(ActionEvent actionEvent) {
    }

    public void loadLevel(ActionEvent actionEvent) {
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
    }
}
