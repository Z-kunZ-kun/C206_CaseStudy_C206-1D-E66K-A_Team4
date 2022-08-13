
public class Student extends Parent {
	private int studentID;
	private String name;
	private int grade;
	private String classroom;
	private String teacher;
	private int ccaID;
	private boolean lowerPrimary;

	public Student(String parentName, String parentEmail, int contactNo, String address, int studentID, String name,
			int grade, String classroom, String teacher, int ccaID) {
		super(parentName, parentEmail, contactNo, address);
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classroom = classroom;
		this.teacher = teacher;
		this.ccaID = ccaID;
		this.lowerPrimary = false;

	}

	public String toString() {
		String output = "";
		
		output = String.format("%-15s %-10s %-10s %-10s %-15s %-10s %-10s\n", studentID, name, grade, classroom, teacher, ccaID,isLowerPrimary(lowerPrimary));
		return output;
	}

	public String isLowerPrimary(boolean lowerPrimary) {
		String avail;

		if (lowerPrimary == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return name;
	}

	public void setStudentName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getCCAID() {
		return ccaID;
	}

	public void setCCAID(int ccaID) {
		this.ccaID = ccaID;
	}

	public boolean getlowerPrimary() {
		return lowerPrimary;
	}

	public void setLowerPrimary(boolean lowerPrimary) {
		this.lowerPrimary = lowerPrimary;
	}

}
