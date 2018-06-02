import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	
		static public void DeleteAlbum(String name) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName(Main.JDBC_DRIVER);
	            conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
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
		static public void DeleteArtist(String name) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName(Main.JDBC_DRIVER);
	            conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
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
		static public void DeleteSong(String name) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName(Main.JDBC_DRIVER);
	            conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
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
