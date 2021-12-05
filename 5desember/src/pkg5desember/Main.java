package pkg5desember;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Sultan
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Label FirstName = new Label("First Name ");
        Label LastName = new Label("Last Name ");
        Label Email = new Label("E-Mail Address ");
        Label Contact = new Label("Contact No ");
        Label Password = new Label("Password ");
        Label ConfirmPassword = new Label("Confirm Password ");
  
        TextField textfieldFirstName = new TextField();
        HBox hboxFirstName = new HBox();
        TextField textfieldLastName = new TextField();
        HBox hboxLastName = new HBox();
        TextField textfieldEmail = new TextField();
        HBox hboxEmail = new HBox();
        TextField textfieldContact = new TextField();
        HBox hboxContact = new HBox();
        TextField textfieldPassword = new TextField();
        HBox hboxPassword = new HBox();
        TextField textfieldConfirmPassword = new TextField();
        HBox hboxConfirmPassword = new HBox();
        
        VBox Fieldholder = new VBox();
        
        hboxFirstName.getChildren().addAll(FirstName, textfieldFirstName);    
        hboxLastName.getChildren().addAll(LastName, textfieldLastName);
        hboxEmail.getChildren().addAll(Email, textfieldEmail);       
        hboxContact.getChildren().addAll(Contact, textfieldContact);
        hboxPassword.getChildren().addAll(Password, textfieldPassword);
        hboxConfirmPassword.getChildren().addAll(ConfirmPassword, textfieldConfirmPassword);
     
        hboxFirstName.setSpacing(50);
        hboxLastName.setSpacing(51);
        hboxEmail.setSpacing(29);
        hboxContact.setSpacing(49);
        hboxPassword.setSpacing(59);
        hboxConfirmPassword.setSpacing(14);

        Fieldholder.getChildren().addAll(hboxFirstName, hboxLastName, hboxEmail, hboxContact, hboxPassword, hboxConfirmPassword);
        Fieldholder.setSpacing(10);
        Fieldholder.setLayoutX(110);
        Fieldholder.setLayoutY(30);

        Group group = new Group();
        TilePane tp_Panel2 = new TilePane();
        
        Button tombolRegist = new Button("Register");
        tombolRegist.setStyle("-fx-background-color: #01b9fc ");
        
        tp_Panel2.getChildren().addAll(tombolRegist);
        tp_Panel2.setLayoutX(220);
        tp_Panel2.setLayoutY(250);
        
        group.getChildren().addAll(Fieldholder, tp_Panel2);
        
        Scene scene = new Scene(group, 500, 300);
        scene.setFill(Color.WHITE);
        
        primaryStage.setTitle("Registrasi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
