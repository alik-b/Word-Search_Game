package main.slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class SliderController implements Initializable {

    @FXML
    private Label myLabel;
    @FXML
    private Slider mySlider;

    int myTemperature;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myTemperature = (int) mySlider.getValue();
        myLabel.setText(myTemperature + "°C");

        mySlider.valueProperty().addListener((observableValue, number, t1) -> {
            myTemperature = (int) mySlider.getValue();
            myLabel.setText(myTemperature + "°C");
        });

    }
}
