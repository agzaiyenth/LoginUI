package org.example.frontendui;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Text welcome;
    @FXML
    private TextField text;
    @FXML
    private PasswordField pass;
    @FXML
    private Hyperlink hype;
    @FXML
    private Button btn;
    @FXML
    private Line lines;

    public void onHelloButtonClick() {
        text.setVisible(false);
        pass.setVisible(false);
        hype.setVisible(false);
        btn.setVisible(false);
        lines.setVisible(false);
        welcome.setY(188);
        welcome.setText("Welcome "+text.getText()+"!");
    }
}