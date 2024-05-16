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
public class fichepcont  {
@FXML
 TextField textnom;
@FXML
 TextField textprenom;
@FXML
 TextField ANT_MEDI;
@FXML
 TextField ANT_CH;
@FXML
TextField POIDS;
@FXML
TextField TAILLE;
@FXML
TextField NUM_TEL;
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
@FXML
Label label7;
 

 
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
 public void switchtoprendrerdv(ActionEvent event) throws IOException {
	  root = FXMLLoader.load(getClass().getResource("prendre_rdv.fxml"));
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
 public void AJOUTER(ActionEvent event) throws IOException {
		
		String nom = textnom.getText();
		String prenom = textprenom.getText();
		String d = ANT_MEDI.getText();
		String h = ANT_CH.getText();
		String E = POIDS.getText();
		String F = TAILLE.getText();
		String NUM = NUM_TEL.getText();
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
	        //---------------------------------------------------------
	        if (d.matches("[a-zA-Z0-9', ]+")) {
	        	label3.setText("*correct");
	        	label3.setStyle("-fx-text-fill:green;");
	        	i++;
	        } else {
	        	label3.setText("*inccorect");
	        	label3.setStyle("-fx-text-fill:red;");
	        }
	        //---------------------------------------------------------
	        if (h.matches("[a-zA-Z0-9', ]+")) {
	        	label4.setText("*correct");
	        	label4.setStyle("-fx-text-fill:green;");
	        	i++;
	        } else {
	        	label4.setText("*inccorect");
	        	label4.setStyle("-fx-text-fill:red;");
	        }
	      //---------------------------------------------------------
	        if (F.matches("[1-3].[0-9][0-9]$")) {
	        	label5.setText("*Taille correct");
	        	label5.setStyle("-fx-text-fill:green;");
	        	i++;
	        } else {
	        	label5.setText("*Taille inccorect");
	        	label5.setStyle("-fx-text-fill:red;");
	        }
	      //---------------------------------------------------------
	        if (E.matches("([0-9]+)$")) {
	        	label6.setText("*Poids correct");
	        	label6.setStyle("-fx-text-fill:green;");
	        	i++;
	        } else {
	        	label6.setText("*Poids inccorect");
	        	label6.setStyle("-fx-text-fill:red;");
	        }
	        //___________________________________________________________________
	        if (NUM.matches("\\+213[5-7]\\d{8}")) {
	        	label7.setText("*Numero correct");
	        	label7.setStyle("-fx-text-fill:green;");
	        	i++;
	        } else {
	        	label7.setText("*Numero inccorect");
	        	label7.setStyle("-fx-text-fill:red;");
	        }
	        if (i==7) {
	        	nom = textnom.getText();
	    		 prenom = textprenom.getText();
	    		 d = ANT_MEDI.getText();
	    		 h = ANT_CH.getText();
	    		 E = POIDS.getText();
	    		 F = TAILLE.getText();
	        } 
	       
	        
			
	       
		
		
		
	}

}


