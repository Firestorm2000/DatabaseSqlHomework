import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
		static String DB_URL = "jdbc:mysql://localhost/";

		//  Database credentials
		static final String USER = "root";
		static final String PASS = "123456";


			
			public void ReadAlbums() {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					String sql = null;
					stmt = conn.createStatement();
					
					sql ="SELECT AlbumName, NumSubscribed  FROM Artists";
					stmt.executeUpdate(sql);
					
					
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
			public void ReadSongs() {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					String sql = null;
					stmt = conn.createStatement();
					
					sql ="SELECT SongName, DateRealease FROM Songs";
					stmt.executeUpdate(sql);
					
					
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
			public void ReadArtists() {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					String sql = null;
					stmt = conn.createStatement();
					
					sql ="SELECT ArtistName,NumSonsgs  FROM Artist";
					stmt.executeUpdate(sql);
					
					
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
