package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    Button homeButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image homeIcon = new Image("images/homeIcon.png");
        homeButton.setGraphic(new ImageView(homeIcon));
        homeButton.setFocusTraversable(false);

    }
}
