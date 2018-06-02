import java.sql.*;
import java.util.Scanner;

public class Main {
	// JDBC driver name and database URL
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	public static String DB_URL = "jdbc:mysql://localhost/music";

	   //  Database credentials
	public static final String USER = "root";
	public static final String PASS = "123456";
	   
	public static void main(String[] args){
		//DropDB();  //Drops Database
		//CreateDB();  //Creates Database with Tables
		
		System.out.println("Which Table to use:");
		System.out.println("1 - Songs");
		System.out.println("2 - Albums");
		System.out.println("3 - Artists");
		Scanner scn = new Scanner(System.in);
		int table = scn.nextInt();
		
		if(table >= 1 && table <= 3){
			System.out.println("What to do:");
			System.out.println("1 - Create");
			System.out.println("2 - Read");
			System.out.println("3 - Update");
			System.out.println("4 - Delete");
		}else {
			System.out.println("Wrong number!");
		}
		
		int crud = scn.nextInt();
		
		if(table == 1 && crud == 1) {
			System.out.println("Song:");
			System.out.println("Release Date:");
			Create.CreateSongs(scn.nextLine(), scn.nextLine());
		}
		if(table == 2 && crud == 1) {
			System.out.println("Album:");
			String tmp = scn.nextLine();
			System.out.println("Number of Subscriptions:");
			Create.CreateAlbums(tmp, scn.nextInt());
		}
		if(table == 3 && crud == 1) {
			System.out.println("Artist:");
			System.out.println("Number of Songs:");
			Create.CreateArtist(scn.nextInt(), scn.nextLine());
		}
		if(table == 1 && crud == 2) {
			Read.ReadSongs();
		}
		if(table == 2 && crud == 2) {
			Read.ReadAlbums();
		}
		if(table == 3 && crud == 2) {
			Read.ReadArtists();
		}
		
		scn.close();
		
		Connection conn = null;
		Statement stmt = null;
		try {
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
			DB_URL = "jdbc:mysql://localhost/music";
			conn.close();
			stmt.close();
			
			//Tables Creation
			//Songs
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			sql = "CREATE TABLE Songs " +
					"(id INT UNSIGNED AUTO_INCREMENT, " +
					" SongName VARCHAR(255), " + 
					" PRIMARY KEY ( id ))"; 
			
			stmt.executeUpdate(sql);
			System.out.println("Created Table Songs");
			stmt.close();
			
			//Albums
			stmt = conn.createStatement();
			sql = "CREATE TABLE Albums " +
					"(id INT UNSIGNED AUTO_INCREMENT, " +
					" AlbumName VARCHAR(255),2 " + 
					" NumSubscribed int, " + 
					" PRIMARY KEY ( id ))"; 
			
			stmt.executeUpdate(sql);
			System.out.println("Created Table Albums");
			stmt.close();
			
			//Artists
			stmt = conn.createStatement();
			sql = "CREATE TABLE Artists " +
					"(id INT UNSIGNED AUTO_INCREMENT, " +
					" ArtistName VARCHAR(255), " + 
					" NumSonsgs int, " + 
					" PRIMARY KEY ( id ))"; 
			
			stmt.executeUpdate(sql);
			System.out.println("Created Table Artists");
			stmt.close();
			
			//Playlist
			stmt = conn.createStatement();
			sql = "CREATE TABLE Playlists " +
					"(id INT UNSIGNED AUTO_INCREMENT, " +
					" Song_id int unsigned, " +
					" Artist_id int unsigned, " + 
					" Album_id int unsigned, " +
					" PRIMARY KEY ( id )," +
					" FOREIGN KEY (Song_id) "
					+ "REFERENCES Songs(id)," +
					" FOREIGN KEY (Album_id)"
					+ " REFERENCES Albums(id)," +
					" FOREIGN KEY (Artist_id)"
					+ " REFERENCES Artists(id)) ";
			
			stmt.executeUpdate(sql);
			System.out.println("Created Table Playlists");
			stmt.close();
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