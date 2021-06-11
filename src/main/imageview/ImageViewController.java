package main.imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViewController {

    // ImageView is a Node used for painting images loaded with Images

    // Image = photograph

    // ImageView = picture frame

    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("shrek2.jpg"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }

}
