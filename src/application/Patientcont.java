package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class Patientcont {
@FXML
 TextField textnom;
@FXML
 TextField textprenom;
@FXML
Label label1;
@FXML
Label label2;

 
 private Stage stage;
 private Scene scene;
 private Parent root;
 int i;
 
 
 
 

 public void switchtoEcrire_ord(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("Ecrire_ord.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchtoprendre_rdv(ActionEvent event) throws IOException {
	  root = FXMLLoader.load(getClass().getResource("prendre_rdv.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
 }
 public void switchtoProg(ActionEvent event) throws IOException {
	   root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
}
 public void switchtocertificat(ActionEvent event) throws IOException {
	  root = FXMLLoader.load(getClass().getResource("CERTIFICAT.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchtoFICHEP(ActionEvent event) throws IOException {
	  root = FXMLLoader.load(getClass().getResource("fiche_pat.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void recherche(ActionEvent event) throws IOException {
		
		String nom = textnom.getText();
		String prenom = textprenom.getText();

        if (nom.matches("[a-zA-Z]+")) {
        	label1.setText("*Nom correct");
        	label1.setStyle("-fx-text-fill:green;");
            i=1;
        } else {
        	label1.setText("*Nom inccorect");
        	label1.setStyle("-fx-text-fill:red;");
        }
      //---------------------------------------------------------------------------------
        if (prenom.matches("[a-zA-Z]+")) {
        	label2.setText("*Prenom correct");
        	label2.setStyle("-fx-text-fill:green;");
        	i++;
        } else {
        	label2.setText("*Prenom inccorect");
        	label2.setStyle("-fx-text-fill:red;");
        }
        if (i==2) {
        	nom = textnom.getText();
    		prenom = textprenom.getText();
    		
        } 
        //---------------------------------------------------------------------------------
        //manipulation base de donne 
		
		
		System.out.println(nom);
		System.out.println(prenom);
		
		
	}

}