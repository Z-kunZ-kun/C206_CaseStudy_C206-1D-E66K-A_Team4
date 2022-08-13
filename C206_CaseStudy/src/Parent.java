public class Parent {

	private String parentName;
	private String parentEmail;
	private int contactNo;
	private String address;

	public Parent(String parentName, String parentEmail, int contactNo, String address) {
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.contactNo = contactNo;
		this.address = address;

	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getparentEmail() {
		return parentEmail;
	}

	public void setparentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		String output = String.format("%-10s %-10s %-10d %-10d\n", this.parentName, this.parentEmail, this.contactNo,
				this.address);
		return output;
	}

}
