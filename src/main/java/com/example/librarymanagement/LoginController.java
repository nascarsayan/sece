package com.example.librarymanagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    public TextField usernameText;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginBtnClick() {
        welcomeText.setText(String.format("Welcome %s", usernameText.getText()));
    }
}