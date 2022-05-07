package dbHelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {
	Connection conn;

	public DeleteQuery() throws ClassNotFoundException, SQLException {

		// conn = [call your static DB method]
		try {
			conn = DB.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doDelete(int id) throws SQLException {
		String sql = "DELETE FROM friends WHERE id=?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, id);
		
		st.executeUpdate();	
		
	}

}
