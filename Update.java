import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static String DB_URL = "jdbc:mysql://localhost/";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "123456";


		
		public void UpdateAlbum(String name,int id) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				String sql = null;
				stmt = conn.createStatement();
				
				sql = "UPDATE Albums " +
		                   "SET name = "+name+" WHERE id ="+id+"";
				stmt.executeUpdate(sql);
				System.out.println("Album updated");
				
				
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
		public void UpdateSong(String name,int id) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				String sql = null;
				stmt = conn.createStatement();
				
				sql = "UPDATE Albums " +
		                   "SET name = "+name+" WHERE id ="+id+"";
				stmt.executeUpdate(sql);
				System.out.println("Song updated");
				
				
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
		public void UpdateArtist(String name,int id) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				String sql = null;
				stmt = conn.createStatement();
				
				sql = "UPDATE Albums " +
		                   "SET name = "+name+" WHERE id ="+id+"";
				stmt.executeUpdate(sql);
				System.out.println("Arist updated");
				
				
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
