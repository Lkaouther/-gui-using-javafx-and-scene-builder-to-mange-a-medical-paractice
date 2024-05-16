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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class prendre_rdv {
@FXML
 TextField textnom;
@FXML
 TextField textprenom;
@FXML
 TextField date;
@FXML
 TextField heure;
@FXML
Label label1;
@FXML
Label label2;
@FXML
Label label3;
@FXML
Label label4;

 

 
 private Stage stage;
 private Scene scene;
 private Parent root;
 int i;
 LocalDate currentDate = LocalDate.now();
 


 public void switchtoEcrire_ord(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("Ecrire_ord.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchtopatient(ActionEvent event) throws IOException {
	  root = FXMLLoader.load(getClass().getResource("patient.fxml"));
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
 public void ajouter(ActionEvent event) throws IOException {
		
		String nom = textnom.getText();
		String prenom = textprenom.getText();
		String d = date.getText();
		String h = heure.getText();
		
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
	        
	        //---------------------------------------------------------------------------------
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");

	        try {
	            LocalDate date = LocalDate.parse(d, formatter);
	            if (date.isAfter(currentDate)||date.isEqual(currentDate)) {
	            label3.setText("*Date correct");
	        	label3.setStyle("-fx-text-fill:green;");
	        	i++;}
	        } catch (DateTimeParseException e) {
	        	label3.setText("*Date inccorect");
	        	label3.setStyle("-fx-text-fill:red;");
	        }
	      //---------------------------------------------------------------------------------
	        if (h.matches("^(0[1-8]|1[3-6]):[0-5][0-9]$")) {
	        	label4.setText("*Heure correct");
	        	label4.setStyle("-fx-text-fill:green;");
	        	i++;
	        } else {
	        	label4.setText("*Heure inccorect");
	        	label4.setStyle("-fx-text-fill:red;");
	        }
	        
	        if (i==4) {
	        	nom = textnom.getText();
	    	prenom = textprenom.getText();
	    		 d = date.getText();
	    		 h = heure.getText();
	        } 
	      //---------------------------------------------------------------------------------
	        //manipulation base de donne 
	        
		
		
		
		
		
	}

}