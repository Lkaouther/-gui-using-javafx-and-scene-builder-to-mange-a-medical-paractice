package application;

import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Progcont {

 private Stage stage;
 private Scene scene;
 private Parent root;
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
 public void switchtoEcrire_ord(ActionEvent event) throws IOException {
	   root = FXMLLoader.load(getClass().getResource("Ecrire_ord.fxml"));
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
 //---------------------------------------------------------------------------------
 //manipulation base de donne 
	
  //variable currentDate pour afficher la table 
 
}