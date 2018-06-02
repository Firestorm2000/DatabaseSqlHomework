import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
		
		static public void UpdateAlbum(String name,int id) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName(Main.JDBC_DRIVER);
	            conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
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
		static public void UpdateSong(String name,int id) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName(Main.JDBC_DRIVER);
	            conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
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
		static public void UpdateArtist(String name,int id) {
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName(Main.JDBC_DRIVER);
	            conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
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