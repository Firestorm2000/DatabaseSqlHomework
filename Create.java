import java.sql.*;
import java.text.SimpleDateFormat;

public class Create {

// JDBC driver name and database URL
static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
static String DB_URL = "jdbc:mysql://localhost/";

//  Database credentials
static final String USER = "root";
static final String PASS = "123456";

static public void CreateSongs(String date,String song) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = null;
			Date DateRelease =SimpleDateFormat.parse(date);
			String SongName = song;
			stmt = conn.createStatement();
			
			sql = "INSERT INTO Songs VALUES ('"+SongName+"' , '"+DateRelease+"' )";
			stmt.executeUpdate(sql);
			System.out.println("Songs Updated");
			
			
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

static public void CreateArtist(int numberSongs,String name) {
	Connection conn = null;
	Statement stmt = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql = null;
		int numberOfSongs = numberSongs;
		String artistName = name;
		stmt = conn.createStatement();
		
		sql = "INSERT INTO Songs VALUES ('"+artistName+"' , '"+numberOfSongs+"' )";
		stmt.executeUpdate(sql);
		System.out.println("Artists Updated");
		
		
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
static public void CreateAlbums(int numberSubcribed,String name) {
	Connection conn = null;
	Statement stmt = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql = null;
		int number = numberSubcribed;
		stmt = conn.createStatement();
		
		sql = "INSERT INTO Songs VALUES ('"+name+"' , '"+number+"' )";
		stmt.executeUpdate(sql);
		System.out.println("Artists Updated");
		
		
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
