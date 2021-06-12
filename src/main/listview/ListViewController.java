package main.listview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListViewController implements Initializable {

    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;

    final String[] food = {"pizza", "sushi", "ramen"};

    String currentFood;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myListView.getItems().addAll(food);

        myListView.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> {
            currentFood = myListView.getSelectionModel().getSelectedItem();
            myLabel.setText(currentFood);
        });

    }
}
