package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Image icon = new Image("logo.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Practicing with javafx");
        primaryStage.setWidth(420);
        primaryStage.setHeight(420);

        Group root = new Group();
        Scene scene = new Scene(root,300, 275, Color.MEDIUMPURPLE);

        Text text = new Text("Yo this is sick bruh");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 25));
        text.setFill(Color.ANTIQUEWHITE);

        Line line = new Line();
        line.setStartX(55);
        line.setStartY(55);
        line.setEndX(290);
        line.setEndY(55);
        line.setStrokeWidth(5);
        line.setStroke(Color.BURLYWOOD);
        line.setOpacity(0.5);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(80);
        rectangle.setY(80);
        rectangle.setWidth(50);
        rectangle.setHeight(50);
        rectangle.setStroke(Color.CHARTREUSE);
        rectangle.setStrokeWidth(3);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
                );
        triangle.setFill(Color.LIGHTGOLDENRODYELLOW);

        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(250);
        circle.setRadius(25);
        circle.setFill(Color.DEEPPINK);

        Image image = new Image("apple.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(250);
        imageView.setY(100);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

//        primaryStage.setResizable(false);
//        primaryStage.setX(50);
//        primaryStage.setY(50);
//        primaryStage.setFullScreen(true);
//        primaryStage.setFullScreenExitHint("You can't escape unless you press q");
//        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
