import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static String DB_URL = "jdbc:mysql://localhost/";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "123456";


		
		public void DeleteAlbum(String name) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				String sql = null;
				String albumName = name;
				stmt = conn.createStatement();
				
				sql = "DELETE FROM Albums" + "WHERE AlbumName = "+albumName+"";
				stmt.executeUpdate(sql);
				System.out.println("Album deleted");
				
				
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
		public void DeleteArtist(String name) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				String sql = null;
				String artistName = name;
				stmt = conn.createStatement();
				
				sql = "DELETE FROM Artist" + "WHERE ArtistName = "+artistName+"";
				stmt.executeUpdate(sql);
				System.out.println("Artist deleted");
				
				
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
		public void DeleteSong(String name) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				String sql = null;
				String songName = name;
				stmt = conn.createStatement();
				
				sql = "DELETE FROM Songs" + "WHERE SongName = "+songName+"";
				stmt.executeUpdate(sql);
				System.out.println("Song deleted");
				
				
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
