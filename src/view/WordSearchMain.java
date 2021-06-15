package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class WordSearchMain extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("menuScene.fxml"));
        stage.setTitle("Word Search Mania");
        Image icon = new Image("images/icon.png");
        stage.getIcons().add(icon);

        Scene menuScene = new Scene(root);

        stage.setScene(menuScene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
