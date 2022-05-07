package model;

public class M_85_Friends {
	private String username, password;
	private String phoneno, email, name, address, productname, serialno, purchasedate, claimdate, description, claimstatus ;

	public M_85_Friends(String username, String password, String phoneno, String email,String name,String address) {
		this.username = username;
		this.password = password;
		this.phoneno = phoneno;
		this.email = email;
		this.name = name;
		this.address = address;
	}

	public M_85_Friends(String username, String productname, String serialno, String purchasedate) {
		this.username = username;
		this.productname = productname;
		this.serialno = serialno;
		this.purchasedate = purchasedate;

	}
	
	public M_85_Friends(String username, String claimdate, String description, String serialno, String claimstatus) {
		this.username = username;
		this.claimdate = claimdate;
		this.description = description;
		this.serialno = serialno;
		this.claimstatus = claimstatus;
	}
	

	


	public M_85_Friends() {
		this.username = "";
		this.password = "";
		this.phoneno = "";
		this.email = "";
		this.name = "";
		this.address = "";
		this.productname = "";
		this.serialno = "";
		this.purchasedate = "";
		this.claimdate = "";
		this.claimstatus = "";
		this.description = "";
	}
	

	public M_85_Friends(String username, String password) {
		this.username = username;
		this.password = password;

	}

	public String getusername() {
		return username;
	}

	
	public void setusername(String username) {
		this.username = username;
	}
	
	public String getdescription() {
		return description;
	}

	
	public void setdescription(String description) {
		this.description = description;
	}
	
	public String getclaimdate() {
		return claimdate;
	}
	public void setclaimdate(String claimdate) {
		this.claimdate = claimdate;
	}
	
	public String getclaimstatus() {
		return claimstatus;
	}
	public void setclaimstatus(String claimstatus) {
		this.claimstatus = claimstatus;
	}
	
	public String setdescription() {
		return claimdate;
	}
	public void getdescription(String description) {
		this.description = description;
	}
	
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getphoneno() {
		return phoneno;
	}

	public void setphoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getproductname() {
		return productname;
	}

	public void setproductname(String productname) {
		this.productname = productname;
	}
	
	public String getserialno() {
		return serialno;
	}

	public void setserialno(String serialno) {
		this.serialno = serialno;
	}
	
	public String getpurchasedate() {
		return purchasedate;
	}

	public void setpurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}
	
	@Override
	public String toString() {
		return "Product [username=" + username + ", productname=" + productname + ", serialno=" + serialno + ", purchasedate="
				+ purchasedate + "]";
	}
//	public String toString() {
//		return "Product [username=" + username + ", password=" + password + ", phoneno=" + phoneno + ", email="
//				+ email + ", name=" + name + ", address=" + address + "]";
//	}
//
//	
	


}
