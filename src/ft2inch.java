/*


*/


import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Optional;


public class ft2inch extends Application{

@Override
    public void start(Stage primaryStage){
    DecimalFormat DecimalFormat = new DecimalFormat("#.###");
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenDimension = toolkit.getScreenSize();

    double screenWidth = screenDimension.getWidth();
    double screenHeight = screenDimension.getHeight();


    TextInputDialog inputDialog = new TextInputDialog();
    inputDialog.setTitle("Enter Value");
    inputDialog.setHeaderText("Height converter: Centimeters to feet and inches.");
    inputDialog.setContentText("Enter your height in centimers");
    inputDialog.setX(500);
    inputDialog.setY(250);
    inputDialog.showAndWait();
    Optional<String> result = inputDialog.showAndWait();

    //Converter calcs
    double height = Double.parseDouble(result.get());
    double heightInch = height*0.39;
    double heightFeet = height/30;


    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.getDialogPane().setPrefSize(250,250);
    alert.setTitle("Height");
    alert.setContentText("Your height is " + DecimalFormat.format(heightInch) + " in Centimeters and " + DecimalFormat.format(heightFeet) + " in Feet.");
    alert.setX(screenWidth-alert.getDialogPane().getPrefWidth());
    alert.setY(screenHeight-alert.getDialogPane().getPrefHeight());
    alert.showAndWait();
}

public static void main(String[] args){

        Application.launch(args);


    }


}
