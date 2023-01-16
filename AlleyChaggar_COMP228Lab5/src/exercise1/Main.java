package exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
	
public class Main {
	// properties for database 
	static final String DATABASE_URL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD";
	static final String USER_NAME = "COMP228_F22_om_63";	
	static final String PASS = "password";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createTable();
		//createPlayer();
		//createPlayerAndGame();
		//getData();
		getData();
		
	}
	
	static private void createTable() {

		try {

			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);

			Statement st = con.createStatement();
			String query = "CREATE TABLE game (game_id NUMBER(4),game_title VARCHAR2(20))";

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

	static private void getData() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);

			Statement st = con.createStatement();

			String query = "Select * from game";

			ResultSet rs = st.executeQuery(query);

			System.out.println("gameID \t gametitle");
			while (rs.next()) {

				int game_id = rs.getInt(1);
				String game_title = rs.getString(2);

				System.out.println(game_id + "\t" + game_title);
			}

			rs.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    static private void updateUser() {
    	
    	try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);

			Statement st = con.createStatement();
			
			String q = "update game set game_title = 'overball' where game_id = 1";
			st.executeUpdate(q);
			
			con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    static private void deleteUser() {
    	
    	try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);

			Statement st = con.createStatement();
			
			String deleteQuery = "delete from game where game_id = 3";
			st.executeUpdate(deleteQuery);
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    }

    
    static private void  addUser() {
    	
    	try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);

			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter Employee id and Name : ");
			int gameid = sc.nextInt();
			
			String  gametitle = sc.nextLine();
			
			
			String addUserQuery = "insert into game VALUES( ? , ? )";
			PreparedStatement pst = con.prepareStatement(addUserQuery);
			
			pst.setInt(1, gameid);
			pst.setString(2,gametitle);
			
			pst.executeUpdate();
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    
    static private void selectUsers() {
    	
    	try {
    	Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
		
		String q = "Select * from empl where empno > ?";
		PreparedStatement pst = con.prepareStatement(q);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Employee id: ");
		int userInput = sc.nextInt();
		pst.setInt(1, userInput);
		ResultSet rs = pst.executeQuery();
		System.out.println("empno \t name");
		while(rs.next()) {
			
			int empno = rs.getInt(1);
			String name = rs.getString(2);
			
			System.out.println(empno + "\t"+name);
		}
		

    	} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}

	
//	static private void createTable() {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			
//			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//			
//			
//			Statement statement = con.createStatement();
//			
//			// Creates the three tables
//			
//			
//			String query = "CREATE TABLE game ("
//					+ "game_id NUMBER(1),"
//					+ "game_title VARCHAR2(20))";
//			String query2 = "CREATE TABLE player (player_id NUMBER(1),first_name VARCHAR2(20),last_name VARCHAR2(20),address VARCHAR2(20), postal_code VARCHAR2(6), province CHAR(2), phone_number NUMBER(9))";
//			String query3 = "CREATE TABLE playerandgame (player_game_id NUMBER(2),game_id NUMBER(1),player_id NUMBER(1),playing_date VARCHAR2(20),score NUMBER(30))";
//			
//			
//			statement.executeUpdate(query);
//			statement.executeUpdate("insert into game values (1, 'Overball')");
//			statement.executeUpdate("insert into game values (2, 'Crash of the titans')");
//			statement.executeUpdate("insert into game values (3, 'Fall guys')");
//			statement.executeUpdate("insert into game values (4, 'Rocket league')");
//			statement.executeUpdate("insert into game values (5, 'Paladins')");
//			statement.executeUpdate("insert into game values (6, 'Crystal maze')");
//			statement.executeUpdate("insert into game values (7, 'Dishonored 2')");
//
//			
//			System.out.print("Done: ");
//			con.close();
//
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	static private void createPlayerAndGame() {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			
//			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//			
//			
//			Statement statement = con.createStatement();
//			
//			// Creates the three tables
//			
//			;
//			String query = "CREATE TABLE playerandgame (player_game_id NUMBER(2),game_id NUMBER(1),player_id NUMBER(1),playing_date VARCHAR2(20),score NUMBER(30))";
//			
//			statement.executeUpdate(query);
//
//			
//			System.out.print("Done: ");
//			con.close();
//
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	
//	static private void createPlayer() {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			
//
//			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//			
//			
//			Statement statement = con.createStatement();
//			 
//			
//			String query2 = "CREATE TABLE player (player_id NUMBER(1),first_name VARCHAR2(20),last_name VARCHAR2(20),address VARCHAR2(20), postal_code VARCHAR2(6), province CHAR(2), phone_number NUMBER(9))";
//			statement.executeUpdate(query2);
//
//			
//			System.out.print("Done: ");
//			con.close();
//
//
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		
//	
//	}
//	
//	
//	
//	static private void getData() {
//
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			
//			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//
//			
//			Statement statement = con.createStatement();
//
//			String query = "Select * from game";
//			String query1 = "Select * from player";
//			String query2 = "Select * from playerandgame";
//			
//			ResultSet rs = statement.executeQuery(query);
//			ResultSet rs1 = statement.executeQuery(query1);
//			ResultSet rs2 = statement.executeQuery(query2);
//			
//			
//			while(rs.next()) {
//				int gameID = rs.getInt(1);
//				String gameTitle = rs.getString(2);
//				
//				System.out.println("Alley's data");
//				System.out.println("Game ID: "+ gameID + " Game Title: " + gameTitle);
//			}
//			
//			while(rs1.next()) {
//				int playerID = rs1.getInt(1);
//				String first_name  = rs1.getString(2); 
//				String last_name = rs1.getString(3); 
//				String address = rs1.getString(4); 
//				String postal_code =rs1.getString(5); 
//				String province = rs1.getString(6); 
//				int phone_number = rs1.getInt(7); 
//				
//			}
//			
//			while(rs2.next()) {
//				int playerID = rs2.getInt(1);
//				String gameTitle = rs2.getString(2);
//				int player_game_id =  rs2.getInt(3);
//				int game_id =  rs2.getInt(4);
//				String playing_date = rs2.getString(5);
//				int score = rs2.getInt(6);						
//			}			
//			
//			
//			rs.close();
//			rs1.close();
//			rs2.close();
//			con.close();
//			
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	
//	}
//
//	
//	
//	static private void updateInfo() {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			
//			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//			
//			Statement statement = con.createStatement();
//			
//			String query = "update game set ";
//			
//			statement.executeUpdate(query);
//			
//			con.close();
//
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//
//	}
//
//	static private void deleteInfo() {
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			
//			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//			
//			Statement statement = con.createStatement();
//			
//			String delquery = "delete game set ";
//			
//			statement.executeUpdate(delquery);
//			
//			con.close();
//
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	static private void addUser() {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			
//			Connection con = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASS);
//			
//			Statement statement = con.createStatement();
//			
//			
//			
//			//statement.executeUpdate();
//			
//			con.close();
//
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
