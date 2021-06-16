package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Letter;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    private Button homeButton;
    @FXML
    private VBox myBox;
    @FXML
    private ScrollPane myScrollPane;
    @FXML
    private Group myGroup;

    // add more later
    // https://games4esl.com/list-of-sports/
    private final String[] sports = {"soccer", "basketball", "tennis", "baseball", "golf",};



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image homeIcon = new Image("images/homeIcon.png");
        homeButton.setGraphic(new ImageView(homeIcon));
        homeButton.setFocusTraversable(false);

        //172
        for (String s : sports) {
            Text text = new Text(s);
            text.setFont(new Font("Serif", 20));
            myBox.getChildren().add(text);
        }

        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 12; x++) {
                Letter letter = new Letter("a", x, y);
                myGroup.getChildren().add(letter);
            }
        }

        // how to iterate through box
//        for (Node t : myBox.getChildren()) {
//            if (t instanceof Text text) {
//                if (text.getText().equals("soccer")) {
//                    text.setStrikethrough(true);
//                }
//            }
//        }

    }

    public void goHome(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/menuScene.fxml"));

            Parent menuRoot = loader.load();
            Stage menuStage = (Stage) ((Node)event.getSource()).getScene().getWindow();

            String css = this.getClass().getResource("/style.css").toExternalForm();
            Scene menuScene = new Scene(menuRoot);
            menuScene.getStylesheets().add(css);

            menuStage.setScene(menuScene);
            menuStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
