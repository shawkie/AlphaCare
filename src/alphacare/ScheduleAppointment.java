/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.time.format.DateTimeFormatter;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.Optional;
import java.util.Arrays;
import java.util.List;
import static javafx.application.Application.launch;
import static javafx.application.Platform.exit;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.StageStyle;

/**
 *
 * @author clear
 */
public class ScheduleAppointment extends Application {

    private ChoiceDialog<String> dialog;
    private Text actionStatus;
    private final String[] arrayData = {" ","John Smith", "Steve Jones", "Suhyeok Bang", "Jeff Oh"};
    private List<String> dialogData;
    private String date = null;
    private MenuCntrl menuCntrl;
    
   public void setController(MenuCntrl menuCntrl) {
        this.menuCntrl = menuCntrl;
    }
    @Override
    public void start(Stage primaryStage) {
        
        HBox selectionHb = new HBox(15);
        selectionHb.setAlignment(Pos.TOP_CENTER);

        VBox labelVb = new VBox(10);
        labelVb.setPadding(new Insets(10, 10, 10, 10));
        selectionHb.setAlignment(Pos.CENTER_LEFT);
        VBox vbox = new VBox(30);
        vbox.setPadding(new Insets(25, 25, 25, 25));
        vbox.getChildren().addAll(selectionHb, labelVb);

//                   <---calendar--->        
        Label l = new Label("No date selected");
        DatePicker calendar = new DatePicker();
        EventHandler<ActionEvent> event = (ActionEvent e) -> {
            date = calendar.getValue().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            l.setText("Date Chosen: " + date);
            System.out.println(date);
        };

        calendar.setShowWeekNumbers(true);
        calendar.setOnAction(event);

//                   <---Select patient --->  
        actionStatus = new Text("No patient selected");

        Button selDoc = new Button("Select your patient");
        EventHandler<ActionEvent> showDialog = (ActionEvent f) -> {
            displayChoiceDialog();
        };

        selDoc.setOnAction(showDialog);

//                   <---Finish --->  
        Button finish = new Button("Schedule  appontment");

        EventHandler<ActionEvent> showConfirm = (ActionEvent g) -> {
            displayConfirmationDialog();
        };

        finish.setOnAction(showConfirm);

        selectionHb.getChildren().addAll(calendar, selDoc);
        labelVb.getChildren().addAll(actionStatus, l, finish);
        Scene scene = new Scene(vbox, 350, 200);
        primaryStage.setTitle("Make an appointment");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        dialogData = Arrays.asList(arrayData);

    }

    private void displayChoiceDialog() {

        dialog = new ChoiceDialog<String>(dialogData.get(0), dialogData);
        dialog.setHeaderText("Please choose your patient...");
        dialog.initStyle(StageStyle.UTILITY);

        Optional<String> result = dialog.showAndWait();
        String selected = "cancelled.";

        if (result.isPresent()) {

            selected = result.get();
        }
//        else if(dialogData == arrayData.){
//        Alert alert = new Alert(AlertType.ERROR);
//        alert.setTitle("Confirmation Dialog");        
//        alert.setHeaderText("Error ");
//        alert.setContentText("Pease make a selection");
//    }

        actionStatus.setText(selected);
        System.out.println(actionStatus.getText());
    }

    public void displayConfirmationDialog() {
        String patient = actionStatus.getText();
        String appt = date;
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");        
        alert.setHeaderText("You have an appointment with " + patient + " on " + appt);
        alert.setContentText("Schedule appointment?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            // ... user chose OK
           
            exit();
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }


//    public static void main(String[] args) {
//        launch(args);
//    }
    
    

}
