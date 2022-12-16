package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController extends attributeController implements Initializable {
    //Dashboard
    @FXML
    private Circle Userpfp;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Image img =  new Image("G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\IMG-20200617-WA0011.jpg");

        Userpfp.setFill(new ImagePattern(img));

    }
    @FXML
    private Button Beauty_btn;
    @FXML
    private Button dashboard_Logout_Btn;

    @FXML
    private Button homeServicesbtn;

    @FXML
    void toBeautyscreen(ActionEvent event) {
sceneSwitcher("Beauty-Selfcare",Beauty_btn);
    }

    @FXML
    void toHomeServicesScreen(ActionEvent event) {
        sceneSwitcher("Home-Services-Selection",homeServicesbtn);
    }

    @FXML
    void toLoginScreen(ActionEvent event) {
sceneSwitcher("Login",dashboard_Logout_Btn);
    }







    @FXML
    private Button historyBtn;



    @FXML
    private Button settingBtn;

    @FXML
    private Button termsBtn;



    @FXML
    void toHistory(ActionEvent event) {
sceneSwitcher("History",historyBtn);
    }




    @FXML
    void toSetting(ActionEvent event) {
        sceneSwitcher("Setting",settingBtn);
    }

    @FXML
    void toTerms(ActionEvent event) {
        sceneSwitcher("Terms-and-Condition",termsBtn);
    }



    //home service selection

    @FXML
    private Button cleaningBtn;

    @FXML
    private Button homeServicesBack;

    @FXML
    private Button repairingBtn;



    @FXML
    void toDashboard(ActionEvent event) {
        sceneSwitcher("Dashboard",homeServicesBack);

    }

    @FXML
    void toRepairing(ActionEvent event) {
        sceneSwitcher("Repairing",repairingBtn);
    }
//Cleaing

    @FXML
    private Button backtocleaning;






    //Generic Functions
    @FXML
    void toCleaning(ActionEvent event) {
        Button b= (Button) event.getSource();
        if ( b== cleaningBtn) {
            sceneSwitcher("Cleaning",cleaningBtn);
        }else {
            sceneSwitcher("Home-Services-Selection",backtocleaning);
        }
    }


}
