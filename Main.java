import java.sql.*;

public class Main {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static String DB_URL = "jdbc:mysql://localhost/";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "123456";
	   
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try {
			//DropDB();  //Drops Database
			//CreateDB();  //Creates Database with Tables
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			
		} catch(SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void CreateDB(){
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			//DB Creation
			stmt = conn.createStatement();
			String sql = "CREATE DATABASE Music";
			stmt.executeUpdate(sql);
			System.out.println("DB Created");
			DB_URL += "music";
			
			//Tables Creation
			//Songs
			sql = "CREATE TABLE Songs " +
					"(id INT UNSIGNED AUTO_INCREMENT, " +
					" SongName VARCHAR(255) NOT NULL," +
					" DateRealease DATETIME, " +
					" PRIMARY KEY ( id ))"; 
			
			stmt.executeUpdate(sql);
			System.out.println("Created Table Songs");
			
			//Albums
			sql = "CREATE TABLE Albums " +
					"(id INT UNSIGNED AUTO_INCREMENT, " +
					" AlbumName VARCHAR(255) NOT NULL, " + 
					" NumSubscribed int, " + 
					" PRIMARY KEY ( id ))"; 
			
			stmt.executeUpdate(sql);
			System.out.println("Created Table Albums");
			
			//Artists
			sql = "CREATE TABLE Artists " +
					"(id INT UNSIGNED AUTO_INCREMENT, " +
					" ArtistName VARCHAR(255) NOT NULL, " + 
					" NumSonsgs int, " + 
					" PRIMARY KEY ( id ))"; 
			
			stmt.executeUpdate(sql);
			System.out.println("Created Table Artists");
			
			//Playlist
			sql = "CREATE TABLE Playlists " +
					"(id INT UNSIGNED AUTO_INCREMENT, " +
					" Song_id int NOT NULL, " +
					" Artist_id int NOT NULL, " + 
					" Album_id int NOT NULL, " +
					" PRIMARY KEY ( id ))" +
					"FOREIGN KEY (Song_id) REFERENCES Songs(id)" +
					"FOREIGN KEY (Album_id) REFERENCES Albums(id)" +
					"FOREIGN KEY (Artist_id) REFERENCES Artists(id)"; 
			
			stmt.executeUpdate(sql);
			System.out.println("Created Table Playlists");
			
		} catch(SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void DropDB(){
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			//DB Drop
			stmt = conn.createStatement();
			String sql = "DROP DATABASE Music";
			stmt.executeUpdate(sql);
			System.out.println("DB Dropped");
			DB_URL = "jdbc:mysql://localhost/";
			
			
		} catch(SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
