import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
		static String DB_URL = "jdbc:mysql://localhost/";

		//  Database credentials
		static final String USER = "root";
		static final String PASS = "123456";


			
			static public void ReadAlbums() {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					String sql = null;
					stmt = conn.createStatement();
					
					sql ="SELECT AlbumName, NumSubscribed  FROM Artists";
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
				         //Retrieve by column name
				         int NumSubscribed = rs.getInt("NumSubscribed");
				         String name = rs.getString("AlbumName");
				         //Display values
				         System.out.print("Number subcribed : " + NumSubscribed);
				         System.out.print(", Name: " + name);
				      }
				      rs.close();
					
					
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
			static public void ReadSongs() {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					String sql = null;
					stmt = conn.createStatement();
					
					sql ="SELECT SongName, DateRealease FROM Songs";
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
				         //Retrieve by column name
				         int DateRealease = rs.getInt("DateRealease");
				         String name = rs.getString("SongName");
				         //Display values
				         System.out.print("DateRealease : " + DateRealease);
				         System.out.print(", Name: " + name);
				      }
				      rs.close();
					
					
					
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
			static public void ReadArtists() {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					String sql = null;
					stmt = conn.createStatement();
					
					sql ="SELECT ArtistName,NumSonsgs  FROM Artist";
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()){
				         //Retrieve by column name
				         int NumSonsgs = rs.getInt("NumSonsgs");
				         String name = rs.getString("ArtistName");
				         //Display values
				         System.out.print("Number of songs : " + NumSonsgs);
				         System.out.print(", Name: " + name);
				      }
				      rs.close();
					
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
