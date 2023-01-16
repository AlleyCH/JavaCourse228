package application;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
	
	
public class Main extends Application {
	// properties for database 
	static final String DATABASE_URL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD";
	static final String USER_NAME = "COMP228_F22_om_63";	
	static final String PASS = "password";
	ListView<String> listView = new ListView();
	
	TextField playerID = new TextField();
	TextField gameTitle = new TextField();
	TextField gameID = new TextField();
	TextField firstName = new TextField();

	
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,500,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			root.add(listView, 1, 0 ,1,4);
			root.setPadding(new Insets(20));
			root.setHgap(10);
			root.setVgap(10);
			//root.setVgap(10);
			//root.setVgap(10);
			Button btn1 = new Button(" Diplay Data");
			root.add(btn1, 1, 5);
			btn1.setOnAction(e ->{
				
				//getData();
				getData2();
			});
			Button btn2 = new Button(" Add User");
			
			btn2.setOnAction(e->{
				
				addUser();
				 
			});
			//root.add(playerID, 0, 0);
			//root.add(firstName, 0, 1);
			root.add(gameID, 0, 0);
			root.add(gameTitle, 0, 1);
			
			root.add(btn2, 0, 2);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	private void getData() {
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//
//			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//
//			Statement st = con.createStatement();
//			
//			String q = "Select player_id from player";
//			
//			ResultSet rs = st.executeQuery(q);
//			
//			
//           ObservableList<String> list = FXCollections.observableList(new ArrayList<String>());
//		   
//           while(rs.next()) {
//        	   int playerid = rs.getInt(1);
//        	 //  String first_name  = rs.getString(2); 
//				//String last_name = rs.getString(3); 
//				//String address = rs.getString(4); 
//				//String postal_code = rs.getString(5); 
//				//String province = rs.getString(6); 
//				//int phone_number = rs.getInt(7); 
//				
//        	   
//        	   list.add("Player id: " + playerid);
//           }
//           
//        //   listView.setItems(list);
//
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	private void getData2() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);

			Statement st = con.createStatement();
			
			String q1 = "Select * from game";
			
			ResultSet rs1 = st.executeQuery(q1);		
			
           ObservableList<String> list = FXCollections.observableList(new ArrayList<String>());
		   
           while(rs1.next()) {
        	   int gameID = rs1.getInt(1);
        	   String gametitle = rs1.getString(2);
        	   
        	   list.add(" game ID: " + gameID + " Game title: " + gametitle);
           }
           
           listView.setItems(list);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	private void  addUser() {
	    	
	    	try {
				Class.forName("oracle.jdbc.OracleDriver");
				
				Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);

				//int playerid = Integer.parseInt(playerID.getText());
				int gameid = Integer.parseInt(gameID.getText());

				String  gametitle = gameTitle.getText();
				//String  firstname = firstName.getText();

				
				
				String addUserQuery = "insert into game VALUES( ? , ?)";
				//String addUserQuery1 = "insert into player VALUES( ? )";
				PreparedStatement pst = con.prepareStatement(addUserQuery);
				//PreparedStatement pst1 = con.prepareStatement(addUserQuery1);

			//	pst1.setInt(1, playerid);
			//	pst1.setString(2, firstname);
				pst.setInt(1,gameid);
				pst.setString(2,gametitle);
			


				pst.executeUpdate();
//				pst1.executeUpdate();

			//	playerID.setText("");

				gameTitle.setText("");
				gameID.setText("");
				
				con.close();
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
	
	static private void createTable() {

		try {

			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);

			Statement st = con.createStatement();
			String query = "CREATE TABLE game (game_id NUMBER(1),game_title VARCHAR2(20))"; 

			st.executeUpdate(query);
			st.executeUpdate("insert into game values (1, 'Overball')");
			st.executeUpdate("insert into game values (2, 'Crash of the titans')");
			st.executeUpdate("insert into game values (3, 'Fall guys')");
			st.executeUpdate("insert into game values (4, 'Rocket league')");
			st.executeUpdate("insert into game values (5, 'Paladins')");
			st.executeUpdate("insert into game values (6, 'Crystal maze')");
			st.executeUpdate("insert into game values (7, 'Dishonored 2')");

			System.out.println("Done");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	public static void main(String[] args) {
		launch(args);
	}
}

	
//	@Override
//	public void start(Stage stage) {
//
//				GridPane root = new GridPane();
//				Scene scene = new Scene(root,500,500);
//				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//				
//				root.add(listView, 0, 10);
//				
//				Label id = new Label("Player ID:                 ");
//				root.add(id, 0, 0);	
//				TextField id1 = new TextField();
//				root.add(id1, 1, 0);
//				
//				Label gameid = new Label("Game ID:                 ");
//				root.add(gameid, 0, 1);	
//				TextField gameid1 = new TextField();
//				root.add(gameid1, 1, 1);
//				
//				Label fname = new Label("First Name:              ");
//				root.add(fname, 0, 2);
//				TextField fname1 = new TextField();
//				root.add(fname1, 1, 2);
//						
//				Label lname = new Label("Last Name:              ");
//				root.add(lname, 0, 3);
//				TextField lname1= new TextField();
//				root.add(lname1, 1, 3);
//				
//				Label address = new Label("Address:         ");
//				root.add(address, 0, 4);
//				TextField address1 = new TextField();
//				root.add(address1, 1, 4);
//				
//				Label postCode = new Label("postCode:         ");
//				root.add(postCode, 0, 5);	
//				TextField pCode = new TextField();
//				root.add(pCode, 1, 5);
//				
//				Label province = new Label("Province:        ");
//				root.add(province, 0, 6);
//				TextField province1 = new TextField();
//				root.add(province1, 1, 6);
//	
//				
//				Label phonenum = new Label("phonenum:         ");
//				root.add(phonenum, 0, 7);	
//				TextField phone = new TextField();
//				root.add(phone, 1, 7);
//				
//				
//				Label game = new Label("Game Name:         ");
//				root.add(game, 0, 8);	
//				TextField game1 = new TextField();
//				root.add(game1, 1, 8);
//		
//					
//				
//				Button btn = new Button("Display Data");
//				root.add(btn, 0, 9);
//				
//								
//				btn.setOnAction(e -> {
//					
//					String id2 = id1.getText();
//					String gameid2 = game.getText();
//										
//					try {
//						Class.forName("oracle.jdbc.OracleDriver");
//						
//						Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//
//						
//						Statement statement = con.createStatement();
//
//						
//						String query = "Select * from game";
//						String query1 = "Select playerID from player";
//						String query2 = "Select player_game_id from playerandgame";
//						
//						ResultSet rs = statement.executeQuery(query + query1 + query2);
//
//						
//						
//
//						ObservableList<String> list =  FXCollections.observableList(new ArrayList<String>());
//						
//						while(rs.next()) {
//							int gameID = rs.getInt(1);
//							String gameTitle = rs.getString(2);
//							int playerID = rs.getInt(3);
//							int player_game_id =  rs.getInt(4);
//							
//							
//							list.add("Game ID: "+ gameID + " Game Title: " + gameTitle + "Player ID: "+ playerID + "playerID and game ID "+ player_game_id);
//							list.add("New user");
//
//						}
//							
//						
//					   	listView.setItems(list);
//						
//						rs.close();
//
//						con.close();
//						
//						
//					} catch (ClassNotFoundException | SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//
//									
//				});
//				
//		    stage.setScene(scene);
//			stage.show();
//	}
//	
////	static private void createTable() {
////		
////		
////	}
//	
//	private void getData() {
//		// TODO Auto-generated method stub
//	
//	}
//	
//		
//			
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}
