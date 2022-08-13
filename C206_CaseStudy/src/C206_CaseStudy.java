import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		ArrayList<CCACategory> ccaCategoryList = new ArrayList<CCACategory>();
		
		parentList.add(new Parent("John", "John@gmail.com", 82138321, "Blk 101C"));
		studentList.add(new Student("John", "John@gmail.com", 82138321, "Blk 101C",1,"Jane", 4, "D1-01","Mrs Francis",0));
		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				C206_CaseStudy.setHeader("VIEW ALL STUDENT");
				C206_CaseStudy.viewAllStudent(studentList);
			} else if (option == 2) {
				C206_CaseStudy.setHeader("ADD STUDENT");
				Student stu = inputStudent();
				C206_CaseStudy.addStudent(studentList, stu);
				System.out.println("Student added!");
				
			} else if (option == 3) {
				C206_CaseStudy.setHeader("DELETE STUDENT");
				int position = findStudentPosition(studentList);
				C206_CaseStudy.deleteStudent(studentList, position);
				System.out.println("Student deleted!");
				
			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("CCA REGISTRATION SYSTEM");
		System.out.println("1. View Student");
		System.out.println("2. Add Student");
		System.out.println("3. Delete Student");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	//FIND ALL STUDENTS IN ARRAYLIST
	public static String retrieveAllStudent(ArrayList<Student> studentList) { //Haykal
		String output = "";

		for (int i = 0; i < studentList.size(); i++) {

			output += String.format("%s", studentList.get(i).toString());
		}
		return output;
	}
	
	
	//DISPLAY ALL STUDENTS IN studentList
	public static void viewAllStudent(ArrayList<Student> studentList) { //Haykal
		String output = String.format("%-15s %-10s %-10s %-10s %-15s %-10s %-10s\n","STUDENT ID", "NAME", "GRADE", "CLASS", "TEACHER", "CCA ID", "LOWER PRIMARY?");
		 output += retrieveAllStudent(studentList);	
		System.out.println(output);
	}
	
	//GET STUDENT DETAILS TO ADD
	public static Student inputStudent() { //Haykal
		int studentID = Helper.readInt("Enter student ID > ");
		String name = Helper.readString("Enter student name > ");
		int grade = Helper.readInt("Enter grade > ");
		String classroom = Helper.readString("Enter class > ");
		String teacher = Helper.readString("Enter teacher name > ");
		
		Student stu = new Student("", "", 0 ,"", studentID, name, grade, classroom, teacher, 0);
		return stu;
	}
	
	//ADD stu INTO studentList
	public static void addStudent(ArrayList<Student> studentList, Student stu) { //Haykal
		studentList.add(stu);
	}
	
	//FINDING STUDENT POSITION WITHIN A LIST
	public static int findStudentPosition(ArrayList<Student> studentList) { //Haykal
		int position = 0;
		boolean found = true;
		while (found != false) {
			int stuPos = Helper.readInt("Enter student ID > ");
			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getStudentID() == stuPos) {
					position = i;
					found = false;
				}
			}
			if (position == -1) {
				System.out.print("Unable to find Student ID\n");
			}
		}
		return position;
	}
	
	//DELETE STUDENT BASED ON position
	public static void deleteStudent(ArrayList<Student> studentList, int position) { 
		studentList.remove(position);
	}
	

}
