import java.sql.*;
import java.text.SimpleDateFormat;

public class Create {

static public void CreateSongs(String date,String song) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(Main.JDBC_DRIVER);
            conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
			String sql = null;
			Date DateRelease = SimpleDateFormat.parse(date);
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
		Class.forName(Main.JDBC_DRIVER);
        conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
		String sql = null;
		int numberOfSongs = numberSongs;
		String artistName = name;
		stmt = conn.createStatement();
		
		sql = "INSERT INTO Songs VALUES ('"+artistName+"' , '"+numberOfSongs+"' )";
		stmt.executeUpdate(sql);
		System.out.println("Artist Created");
		
		
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
static public void CreateAlbums(String name, int numberSubcribed) {
	Connection conn = null;
	Statement stmt = null;
	try {
		Class.forName(Main.JDBC_DRIVER);
        conn = DriverManager.getConnection(Main.DB_URL,Main.USER,Main.PASS);
		String sql = null;
		int number = numberSubcribed;
		stmt = conn.createStatement();
		
		sql = "INSERT INTO Albums (AlbumName, NumSubscribed) VALUES ('"+name+"' , '"+number+"' )";
		stmt.executeUpdate(sql);
		System.out.println("Album Created");
		
		
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
