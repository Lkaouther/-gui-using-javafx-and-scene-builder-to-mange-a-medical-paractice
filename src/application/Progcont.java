package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Progcont {

 private Stage stage;
 private Scene scene;
 private Parent root;
 LocalDate currentDate = LocalDate.now();
 @FXML
 private TableColumn<Prog_j_tab, String> HEURE;

 @FXML
 private TableColumn<Prog_j_tab, Integer> ID;

 @FXML
 private TableColumn<Prog_j_tab, String> NOM;

 @FXML
 private TableColumn<Prog_j_tab, String> PRENOM;

 @FXML
 private TableView<Prog_j_tab> TABLE_PROG;
 

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
 public void tablemanip(ActionEvent event) throws IOException {
	 HEURE.setCellValueFactory(new PropertyValueFactory<>("heure"));
    ID.setCellValueFactory(new PropertyValueFactory<>("id"));
     NOM.setCellValueFactory(new PropertyValueFactory<>("nom"));
    PRENOM.setCellValueFactory(new PropertyValueFactory<>("prenom"));
    

     // Connect to the database and retrieve data
     try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "username", "password")) {
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM your_table_name");

         // Populate the TableView with data from the database
         while (rs.next()) {
        	 TABLE_PROG.getItems().add(new Prog_j_tab(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),rs.getString("heure")));
         }
     } catch (SQLException e) {
        e.printStackTrace();
     }
	 }
}