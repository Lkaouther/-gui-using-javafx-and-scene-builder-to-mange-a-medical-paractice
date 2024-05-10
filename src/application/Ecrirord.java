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


public class Ecrirord {
@FXML
 TextField nomText;
@FXML
 TextField prenomtext;
@FXML
 TextField datenaiss;
@FXML
 TextField diag;
@FXML
 TextField medoc;
@FXML
 TextField duree;
@FXML
Label label1;
@FXML
Label label2;
@FXML
Label label3;
@FXML
Label label4;
@FXML
Label label5;
@FXML
Label label6;



 
 private Stage stage;
 private Scene scene;
 private Parent root;
 int i;
 LocalDate currentDate = LocalDate.now();
 
 
 
 

 public void switchtopatient(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("patient.fxml"));
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
 public void remplir(ActionEvent event) throws IOException {
		
		String nom = nomText.getText();
		String prenom = prenomtext.getText();
		String dn = datenaiss.getText();
		String diagnostique = diag.getText();
		String medic = medoc.getText();
		String dure = duree.getText();
		


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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date = LocalDate.parse(dn, formatter);
            if (date.isAfter(currentDate)||date.isEqual(currentDate)) {
            label3.setText("*Date correct");
        	label3.setStyle("-fx-text-fill:green;");
        	i++;}
        } catch (DateTimeParseException e) {
        	label3.setText("*Date inccorect");
        	label3.setStyle("-fx-text-fill:red;");
        }
      //---------------------------------------------------------------------------------
        if (diagnostique.matches("[a-zA-Z0-9' ,]+")) {
        	label4.setText("*Diagnostique correct");
        	label4.setStyle("-fx-text-fill:green;");
        	i++;
        } else {
        	label4.setText("*Diagnostique inccorect");
        	label4.setStyle("-fx-text-fill:red;");
        }
      //---------------------------------------------------------------------------------
        if (medic.matches("[a-zA-Z0-9' ,]+")) {
        	label5.setText("*Medicament correct");
        	label5.setStyle("-fx-text-fill:green;");
        	i++;
        } else {
        	label5.setText("*Medicament inccorect");
        	label5.setStyle("-fx-text-fill:red;");
        }
      //---------------------------------------------------------------------------------
        if (dure.matches("[0-9]+")) {
        	label6.setText("*Duree correct");
        	label6.setStyle("-fx-text-fill:green;");
        	i++;
        } else {
        	label6.setText("*Duree inccorect");
        	label6.setStyle("-fx-text-fill:red;");
        }
      //---------------------------------------------------------------------------------
        
        if (i==6) {
        	nom = nomText.getText();
    		prenom = prenomtext.getText();
    		 dn = datenaiss.getText();
    		 diagnostique = diag.getText();
    		 medic = medoc.getText();
    		 dure = duree.getText();
        } 
      //---------------------------------------------------------------------------------
        //manipulation base de donne 
		
		System.out.println(nom);
		System.out.println(prenom);
		System.out.println(dn);
		System.out.println(diagnostique);
		System.out.println(medic);
		System.out.println(dure);

		
	}
 
 
}
