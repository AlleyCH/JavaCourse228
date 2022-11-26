package application;
	
import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		
		GridPane root = new GridPane();
		
		Label label = new Label("Name:              ");
		root.add(label, 0, 0);
		TextField textField = new TextField();
		root.add(textField, 1, 0);
		
		Label address = new Label("Address:         ");
		root.add(address, 0, 1);
		TextField address1 = new TextField();
		root.add(address1, 1, 1);
		
		Label province = new Label("Province:        ");
		root.add(province, 0, 2);
		TextField province1 = new TextField();
		root.add(province1, 1, 2);
		
		
		Label city = new Label("city:                 ");
		root.add(city, 0, 3);	
		TextField city1 = new TextField();
		root.add(city1, 1, 3);
		
		Label postCode = new Label("postCode:         ");
		root.add(postCode, 0, 4);	
		TextField pCode = new TextField();
		root.add(pCode, 1, 4);
		
		Label phonenum = new Label("phonenum:         ");
		root.add(phonenum, 0, 5);	
		TextField phone = new TextField();
		root.add(phone, 1, 5);
		
		Label email = new Label("email:               ");
		root.add(email, 0, 6);
		TextField email1 = new TextField();
		root.add(email1, 1, 6);
		
	
		
		CheckBox checkBox = new CheckBox("Student council              ");
		root.add(checkBox, 2, 1);

		CheckBox checkBox1 = new CheckBox("Volunteer Work               ");
		root.add(checkBox1, 2, 5);
		
		
        ToggleGroup tg = new ToggleGroup();
		
		RadioButton radio = new RadioButton("Computer Science      ");
		root.add(radio, 4, 0);
		
		RadioButton radio2 = new RadioButton("Business");
		root.add(radio2, 5, 0);
		
		
		 radio.setToggleGroup(tg);
	     radio2.setToggleGroup(tg);
		
		
		
		
		//String proLanguage[] = {"Java","C#","Python"};
		ComboBox<String> programming = new ComboBox<String>();
		programming.getItems().addAll("Java","C#","Python");
		root.add(programming, 4, 2);
		
		
		Button btn = new Button("Display");
		root.add(btn, 1, 7);
		
		Label results = new Label();
		root.add(results, 1, 8);
		
		ListView<String> listView = new ListView<String>();
		root.add(listView, 1, 8, 2, 3);
		ObservableList<String> list = FXCollections.observableArrayList(new ArrayList<String>());


		btn.setOnAction(e -> {
			String name = textField.getText();
			list.add(name);
			
			String add = address1.getText();
			list.add(add);
			
			String pro = province1.getText();
			list.add(pro);
			
			String cit = city1.getText();
			list.add(cit);
			
			String pc = pCode.getText();
			list.add(pc);
			
			String phone1 = phone.getText();
			list.add(phone1);
			
			String email2 = email1.getText();
			list.add(email2);
			
			
			String mess = "Courses: ";
			mess += programming.getValue();
			list.add(mess);

			
			
			String message = "";
			if (checkBox.isSelected()) {
				message += checkBox.getText();
				list.add(message);
			}
			
			String message1 = "";
			if (checkBox1.isSelected()) {
				message1 += checkBox1.getText();
				list.add(message1);
			}
			
			String message2 = "";
			if (radio.isSelected()) {
				message2 += radio.getText();
				list.add(message2);
			}
			String message3 = "";
			if (radio2.isSelected()) {
				message3 += radio2.getText();
				list.add(message3);
			}
			
			
			//listView.setAccessibleText(Arrays.toString(list));
			listView.setItems(list);

		});
		
		Scene scene = new Scene(root, 800, 400); 
		stage.setScene(scene);
		
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
