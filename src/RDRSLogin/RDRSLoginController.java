/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

/**
 *
 * @author velas
 */

package RDRSLogin;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class RDRSLoginController {

    @FXML
    private AnchorPane loginWholePane;

    @FXML
    private AnchorPane loginLeftPane;

    @FXML
    private JFXTextField loginUsername;

    @FXML
    private JFXPasswordField loginPassword;

    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXButton loginexitButton;
    
    public void loginPageExit () {
        System.exit(0);
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
}

