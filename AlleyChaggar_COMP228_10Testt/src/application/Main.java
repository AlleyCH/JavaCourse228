package application;
	
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.fxml.FXML;


public class Main extends Application {
	 ImageView myImageView;
	 Button myButton;


	public void start(Stage stage) {
		
		GridPane root = new GridPane();
	
		
		Button toronto = new Button("Toronto, CA");
		root.add(toronto, 0, 1);
	
		
		Button newYork = new Button("New York, USA");
		root.add(newYork, 0, 2);
	
		
		Button tokyo = new Button("Tokyo, Japan");
		root.add(tokyo, 0, 3);
	
		
		
		Button mon = new Button("Montreal, CA");
		root.add(mon, 0, 4);	
		
		 
		 
		
		
		
		Button btn = new Button("Prev");
		root.add(btn, 1, 7);
		Button btn2 = new Button("Next");
		root.add(btn2, 4, 7);
		
		Label results = new Label();
		root.add(results, 1, 8);
		
		

		newYork.setOnAction(e -> {

			Label title = new Label("New York");
			root.add(title, 1, 0);
		});
		
		tokyo.setOnAction(e -> {

			Label title = new Label("Tokyo");
			root.add(title, 1, 0);
		});
		
		toronto.setOnAction(e -> {

			Label title = new Label("Toronto");
			root.add(title, 1, 0);
		});
		mon.setOnAction(e -> {

			Label title = new Label("Montreal");
			root.add(title, 1, 0);
		});

		btn.setOnAction(e -> {
	

		});

		btn.setOnAction(e -> {
	

		});
		
		
		
		
		Scene scene = new Scene(root, 800, 400); 
		stage.setScene(scene);
		
		stage.show();
	}
//	@FXML
//	  
//	 Image myImage = new Image(getClass().getResourceAsStream("shrek2.jpg"));
//	 
//	 public void displayImage() {
//	  myImageView.setImage(myImage);
//	 }
	 
	public static void main(String[] args) {
		launch(args);
	}
}
		  
//	  List<City> getCities(){
//    	  List<City> list = new ArrayList<City>();
//    	  list.add(new City("Toronto", "Canada", "toronto.jpg"));
//    	  list.add(new City("New York", "USA", "newyork.jpg"));
//    	  list.add(new City("Tokyo", "Japan", "tokyo.jpg"));
//    	  list.add(new City("Montreal", "Canada", "montreal.jpg"));
//    	  return list;
//    	  }

	