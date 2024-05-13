package application;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
 
 @Override
 public void start(Stage stage) {
  try {
	  Image icon =new Image("dwa.pnj.png");
      stage.getIcons().add(icon);
      stage.setTitle("Gestion cabinet medical");
   Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
   Scene scene = new Scene(root);
   stage.setScene(scene);
   stage.show();
   
  } catch(Exception e) {
   e.printStackTrace();
  }
 } 
 
 public static void main(String[] args) {
  launch(args);
 }
}

