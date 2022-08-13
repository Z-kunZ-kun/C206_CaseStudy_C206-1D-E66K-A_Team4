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
				C206_CaseStudy.viewAllStudent(studentList);
				

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
	
	public static String retrieveAllStudent(ArrayList<Student> studentList) {
		String output = "";

		for (int i = 0; i < studentList.size(); i++) {

			output += String.format("%s\n", studentList.get(i).toString());
		}
		return output;
	}
	
	public static void viewAllStudent(ArrayList<Student> studentList) {
		C206_CaseStudy.setHeader("CCA REGISTRATION SYSTEM");
		String output = String.format("%-15s %-10s %-10s %-10s %-15s %-10s %-10s\n","STUDENT ID", "NAME", "GRADE", "CLASS", "TEACHER", "CCA ID", "LOWER PRIMARY?");
		 output += retrieveAllStudent(studentList);	
		System.out.println(output);
	}
	
//	public static String viewAllStudent(ArrayList<Student> studentList) { 
//		System.out.print("\n");
//		C206_CaseStudy.setHeader("STUDENT LIST");
//		String output = String.format("%-10s %-14s %-10s %-10s %-10s %-10s\n", "Student ID", "Student Name", "GRADE",
//				"CLASSROOM", "TEACHER", "REGISTERED?");
//		output += retrieveAllStudent(studentList);
//		System.out.println(output);
//		return output;
//	}

}
