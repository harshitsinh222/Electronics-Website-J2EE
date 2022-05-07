package dbHelpers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.M_85_Friends;

public class ReadProductQuery {
	Connection conn;
	ResultSet rs;

	public ReadProductQuery() throws ClassNotFoundException, SQLException {

		// conn = [call your static DB method]
		try {
			conn = DB.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doUserProdcut(String username) throws SQLException {
		String sql = "Select * from registeredproduct WHERE username=?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, username);
		
		this.rs = st.executeQuery();	
		
	}
	
	public String getHTMLTable() throws SQLException {
		String table = "";
		table += "<table border=1>";
		table += "<tr><th>productname</th><th>serialno</th><th>purchasedate</th></tr>";

		while (this.rs.next()) {


			String temp_productname = this.rs.getString("productname");
			String temp_serialno = this.rs.getString("serialno");
			String temp_purchasedate = this.rs.getString("purchasedate");
			String temp_username = this.rs.getString("username");
			M_85_Friends friend = new M_85_Friends(temp_productname, temp_serialno, temp_purchasedate,temp_username);
			table += "<tr>";
			table += "<td>";
			table += friend.getproductname();
			table += "</td>";
			table += "<td>";
			table += friend.getserialno();
			table += "</td>";
			table += "<td>";
			table += friend.getpurchasedate();
			table += "</td>";
			table += "</tr>";
		}
		return table;
	}
}
