package view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class WordSearchMain extends Application {

    @Override
    public void start(Stage stage) {
        setupStage(stage);
    }

    private void setupStage(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("menuScene.fxml"));
            stage.setTitle("Word Search Mania");
            Image icon = new Image("images/icon.png");
            stage.getIcons().add(icon);
            String css = this.getClass().getResource("style.css").toExternalForm();

            Scene menuScene = new Scene(root);
            menuScene.getStylesheets().add(css);

            stage.setScene(menuScene);
            stage.setResizable(false);
            stage.show();

            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent windowEvent) {

                    Platform.exit();
                    System.exit(0);

                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
