package dbHelpers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.M_85_Friends;

public class ClaimQuery {
	Connection conn;
	ResultSet rs;

	public ClaimQuery() throws ClassNotFoundException, SQLException {

		// conn = [call your static DB method]
		try {
			conn = DB.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doUserProdcut(String username) throws SQLException {
		String sql = "Select * from claim WHERE username=?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, username);
		
		this.rs = st.executeQuery();	
		
	}
	
	public void updateClaim(String claimstatus,String serialno) throws SQLException {
		String temp_claimstatus = claimstatus;
		if(temp_claimstatus == "approved") {
		String sql = "Update claim set claimstatus=? WHERE serialno=?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, "rejected");
		st.setString(2, serialno);
		st.executeUpdate();	
		}
		else {
			String sql = "Update claim set claimstatus=? WHERE serialno=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, "approved");
			st.setString(2, serialno);
			 st.executeUpdate();	
		}	
	}
	
	public String getHTMLTable() throws SQLException {
		String table = "";
		table += "<table border=1>";
		table += "<tr><th>dateofclaim</th><th>claimstatus</th><th>description</th><th>serialno</th></tr>";

		while (this.rs.next()) {


			String temp_dateofclaim = this.rs.getString("dateofclaim");
			String temp_claimstatus = this.rs.getString("claimstatus");
			String temp_description = this.rs.getString("description");
			String temp_username = this.rs.getString("username");
			String temp_serial = this.rs.getString("serialno");
			M_85_Friends friend = new M_85_Friends(temp_dateofclaim, temp_claimstatus, temp_description,temp_username,temp_serial);
			table += "<tr>";
			table += "<td>";
			table += friend.getclaimdate();
			table += "</td>";
			table += "<td>";
			table += friend.getclaimstatus();
			table += "</td>";
			table += "<td>";
			table += friend.getdescription();
			table += "</td>";
			table += "<td>";
			table += friend.getserialno();
			table += "</td>";
			table += "<td>";
			table += "<a href='C_85_updateClaim?claimstatus=" + friend.getclaimstatus() + "&&serialno=" + friend.getserialno() + "&&username=" + friend.getusername() + "'>Update Claim</a>";
			table += "</td>";
			
			table += "</tr>";
		}
		return table;
	}
}
