package dbHelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.M_85_Friends;
import java.sql.Statement;

public class ReadQuery {
	Connection conn;
	ResultSet rs;

	public ReadQuery() throws ClassNotFoundException, SQLException {

		// conn = [call your static DB method]
		try {
			conn = DB.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doRead(String username, String password, String phoneno, String email, String name, String address)
			throws SQLException {
		// READ your Data and save it in ResultSet

		String temp_username = username;
		String temp_password = password;
		String temp_phoneno = phoneno;
		String temp_email = email;
		String temp_name = name;
		String temp_address = address;

		if (temp_name != null && temp_email != null && temp_address != null && temp_email != null
				&& temp_phoneno != null && temp_password != null && temp_username != null) {

			String sql2 = "INSERT INTO customeraccount VALUES (?,?,?,?,?,?)";
			PreparedStatement st2 = conn.prepareStatement(sql2);
			st2.setString(1, temp_username);
			st2.setString(2, temp_password);
			st2.setString(3, temp_phoneno);
			st2.setString(4, temp_email);
			st2.setString(5, temp_name);
			st2.setString(6, temp_address);
			st2.executeUpdate();

		}

	}

	public void doRead() throws SQLException {
		String sql = "select * from customeraccount";
		PreparedStatement st = conn.prepareStatement(sql);
		this.rs = st.executeQuery();
	}

	public String dooRead(String user, String pass) throws Exception {
//		String temp_username = M_85_Friends.getusername();
//		String temp_password = M_85_Friends.getpassword();
		String userNameDB = "";
		String passwordDB = "";
		Statement statement = null;
		try {
			conn = DB.getConnection();
			statement = conn.createStatement();
			rs = statement.executeQuery("select username , password from customeraccount;");
			while (rs.next()) // Until next row is present otherwise it return false
			{
				userNameDB = rs.getString("username"); // fetch the values present in database
				passwordDB = rs.getString("password");

				if (user.equals(userNameDB) && pass.equals(passwordDB)) {
					return "SUCCESS"; //// If the user entered values are already present in the database, which means
										//// user has already registered so return a SUCCESS message.
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Invalid user credentials";

	}
	
	public void doProductRead(String username, String productname, String serialno, String purchasedate)
			throws SQLException {
		// READ your Data and save it in ResultSet

		String temp_username = username;
		String temp_productname = productname;
		String temp_serialno = serialno;
		String temp_purchasedate= purchasedate;


		if (temp_username != null && temp_productname != null && temp_serialno != null && temp_purchasedate != null) {

			String sql2 = "INSERT INTO registeredproduct VALUES (?,?,?,?)";
			PreparedStatement st2 = conn.prepareStatement(sql2);
			st2.setString(4, temp_username);
			st2.setString(1, temp_productname);
			st2.setString(2, temp_serialno);
			st2.setString(3, temp_purchasedate);
			st2.executeUpdate();

		}

	}
	
	
	
	public void doProductRead() throws SQLException {
		String sql = "select * from registeredproduct";
		PreparedStatement st = conn.prepareStatement(sql);
		this.rs = st.executeQuery();
	}
	
	public void doClaimRead(String username, String claimdate, String description, String serialno, String claimstatus)
			throws SQLException {
		// READ your Data and save it in ResultSet

		String temp_username = username;
		String temp_claimdate = claimdate;
		String temp_description = description;
		String temp_serialno= serialno;
		String temp_claimstatus= claimstatus;


		if (temp_username != null && temp_claimdate != null && temp_description != null && temp_serialno != null && temp_claimstatus != null) {

			String sql2 = "INSERT INTO claim VALUES (?,?,?,?,?)";
			PreparedStatement st2 = conn.prepareStatement(sql2);
			st2.setString(1, temp_claimdate);
			st2.setString(2, temp_claimstatus);
			st2.setString(3, temp_description);
			st2.setString(4, temp_username);
			st2.setString(5, temp_serialno);
			st2.executeUpdate();

		}

	}
	
	public void doavailProd(String productname, String model)
			throws SQLException {
		String temp_productname = productname;
		String temp_model = model;
		if (temp_productname != null && temp_model != null ) {
			String sql2 = "INSERT INTO availableproduct VALUES (?,?)";
			PreparedStatement st2 = conn.prepareStatement(sql2);
			st2.setString(1, temp_productname);
			st2.setString(2, temp_model);
			st2.executeUpdate();
		}
		
	}
	public void doClaimRead() throws SQLException {
		String sql = "select * from claim";
		PreparedStatement st = conn.prepareStatement(sql);
		this.rs = st.executeQuery();
	}
	public void doavailProd() throws SQLException {
		String sql = "select * from availableproduct";
		PreparedStatement st = conn.prepareStatement(sql);
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
			String temp_username = this.rs.getString("purchasedate");
			M_85_Friends friend = new M_85_Friends(temp_username, temp_productname, temp_serialno,temp_purchasedate);
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
	
	public void doUser() throws SQLException {
		String sql = "select * from customeraccount";
		PreparedStatement st = conn.prepareStatement(sql);
		this.rs = st.executeQuery();
	}
	
	public String getuserTable() throws SQLException {
		String table = "";
		table += "<table border=1>";
		table += "<tr><th>Username</th><th>Password</th><th>Phone no</th><th>Email</th><th>Name</th><th>Address</th></tr>";

		while (this.rs.next()) {


			String temp_username = this.rs.getString("username");
			String temp_password= this.rs.getString("password");
			String temp_phoneno = this.rs.getString("phoneno");
			String temp_email = this.rs.getString("email");

			String temp_name = this.rs.getString("name");
			String temp_address= this.rs.getString("address");
			M_85_Friends friend = new M_85_Friends(temp_username, temp_password, temp_phoneno,temp_email,temp_name,temp_address);
			table += "<tr>";
			table += "<td>";
			table += friend.getusername();
			table += "</td>";
			table += "<td>";
			table += friend.getpassword();
			table += "</td>";
			table += "<td>";
			table += friend.getphoneno();
			table += "</td>";
			table += "<td>";
			table += friend.getemail();
			table += "</td>";
			table += "<td>";
			table += friend.getname();
			table += "</td>";
			table += "<td>";
			table += friend.getaddress();
			table += "</td>";
			table += "<td>";
			table += "<a href='C_85_userregisteredproduct?username=" + friend.getusername() + "'>View Registered Product</a>";
			table += "</td>";
			table += "<td>";
			table += "<a href='C_85_viewuserclaim?username=" + friend.getusername() + "'>View Claim</a>";
			table += "</td>";
			table += "</tr>";
		}
		return table;
	}
}
