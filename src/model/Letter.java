package model;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Letter extends Text {

    private String letter;

    public Letter(String letter, int x, int y) {
        relocate(x * 40, y * 40);
        setText(letter);
        setFont(new Font("Serif", 20));
    }

}
