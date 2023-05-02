package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Main class for the user interface.
 *
 * @author mjo, cei
 */
public class UserInterfaceController implements Initializable {

    /**
     * Label that displays the welcome text. Should be deleted when creating an
     * actual project.
     */
    @FXML
    private Label welcomeText;

    /**
     * This is where you need to add code that should happen during
     * initialization and then change the java doc comment.
     *
     * @param location  probably not used
     * @param resources probably not used
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //stuff should probably happen here
    }

    /**
     * Called when the button on the gui is clicked. Triggers display of welcome
     * text in the label. <br> Should be deleted when creating an actual
     * project.
     */
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    public void startButtonAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationMain.class.getResource("UserInterface.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Race Track");
        stage.setScene(scene);
        stage.show();
    }
}