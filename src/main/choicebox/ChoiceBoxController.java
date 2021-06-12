package main.choicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceBoxController implements Initializable {

    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;

    private final String[] food = {"pizza", "sushi", "ramen"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::getFood);

    }

    public void getFood(ActionEvent event) {
        String myFood = myChoiceBox.getValue();
        myLabel.setText(myFood);
    }

}