package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class MenuController {

    private Stage gameStage;
    private Scene gameScene;
    private Parent gameRoot;

    public void playGame(ActionEvent event) {

        try {
            //FXMLLoader loader = new FXMLLoader(getClass().getResource("../main.resources/gameScene.fxml"));
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/gameScene.fxml"));
            gameRoot = loader.load();

            //GameController gameController = loader.getController();

            //gameRoot = FXMLLoader.load(getClass().getResource("../main.resources/gameScene.fxml"));
            gameStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            gameScene = new Scene(gameRoot);
            gameStage.setScene(gameScene);
            gameStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void chooseCategory() {
        //TODO Create a new scene
    }

    public void exit() {
        Platform.exit();
    }

}
