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
		ccaList.add(new CCA("Arts & Entertainment", 05, 12, "Dance Club", "CCA for dance", 30, "Monday", "4pm-6pm", "Hall"));
		int option = 0;
		
		while (option != 10) { 
			 
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
			    
			   	} else if (option == 4) { 
			    C206_CaseStudy.setHeader("VIEW ALL PARENT"); 
			    C206_CaseStudy.viewAllParent(parentList);
			     
			   } else if (option == 5) { 
			    C206_CaseStudy.setHeader("ADD PARENT"); 
			    Parent p = inputParent(); 
			    C206_CaseStudy.addParent(parentList, p); 
			    System.out.println("Parent added!"); 

			   } else if (option == 6) { 
			    C206_CaseStudy.setHeader("DELETE PARENT"); 
			    Parent p = inputParentdelete(); 
			    C206_CaseStudy.removeParent(parentList, p); 
			    System.out.println("Parent deleted!"); 
			    
			   } else if (option == 7) {
					// View all items
					C206_CaseStudy.setHeader("VIEW ALL CCA");
					C206_CaseStudy.viewAllCCA(ccaList);
					
			   } else if (option == 8) {
					C206_CaseStudy.setHeader("ADD CCA");
					CCA CCA = inputCCA();
					C206_CaseStudy.addCCA(ccaList, CCA);
					System.out.println("CCA added!");
					
			   } else if (option == 9) {
					C206_CaseStudy.setHeader("DELETE CCA");
					int position = findCCAPosition(ccaList);
					C206_CaseStudy.deleteCCA(ccaList, position);
					System.out.println("CCA deleted!");
    
				} else if (option == 10) { 
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
		System.out.println("4. View Parent");
		System.out.println("5. Add Parent");
		System.out.println("6. Delete Parent");		
		System.out.println("7. View CCA");
		System.out.println("8. Add CCA");
		System.out.println("9. Delete CCA");		
		System.out.println("10. Quit");
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
	
	// add parent account (include student details)
	  
		 public static Parent inputParent() { //Yu Mei
		  String parentName = Helper.readString("Enter parent name > "); 
		  String parentEmail = Helper.readString("Enter parent email > "); 
		  int contactNo = Helper.readInt("Enter parent contact no. > "); 
		  String address = Helper.readString("Enter parent address > "); 
		   
		 
		  Parent p= new Parent(parentName, parentEmail, contactNo, address); 
		  return p; 
		   
		 } 
		  
		  
		 public static void addParent(ArrayList<Parent> parentList, Parent p) { //Yu Mei
		   
		  parentList.add(p); 
		   
		 } 
		  
		  
		 // view registered parents 
		  
		 public static String retrieveAllParent(ArrayList<Parent> parentList) { //Yu Mei
		  String output = ""; 
		 
		  for (int i = 0; i < parentList.size(); i++) { 
		 
		   output += String.format("%-20s %-30s %-10d %-30s\n", parentList.get(i).getParentName(), 
		     parentList.get(i).getparentEmail(), parentList.get(i).getContactNo() ,parentList.get(i).getAddress()); 
		  } 
		  return output; 
		 } 
		 public static void viewAllParent(ArrayList<Parent> parentList) { //Yu Mei
		  C206_CaseStudy.setHeader("PARENT LIST");  
		  String output = String.format("%-20s %-30s %-10d %-30s\n", "PARENT NAME", "PARENT EMAIL", 
		    "PARENT CONTACT NO", "PARENT ADDRESS"); 
		   output += retrieveAllParent(parentList);  
		  System.out.println(output); 
		 } 
		  
		 // delete parent account 
		  
		 
		 public static Parent inputParentdelete() { //Yu Mei
		  String parentName = Helper.readString("Enter parent name > "); 
		  String parentEmail = Helper.readString("Enter parent email > "); 
		  int contactNo = Helper.readInt("Enter parent contact no. > "); 
		  String address = Helper.readString("Enter parent address > "); 
		   
		 
		  Parent p= new Parent(parentName, parentEmail, contactNo, address); 
		  return p; 
		   
		 } 
		  
		public static void removeParent(ArrayList<Parent> parentList, Parent p) { //Yu Mei
		   
		  parentList.remove(p); 
		   
		 }
		
		
		//FIND ALL CCA IN ARRAYLIST
		public static String retrieveAllCCA(ArrayList<CCA> ccaList) { //Yan
			String output = "";

			for (int i = 0; i < ccaList.size(); i++) {

				output += String.format("%s\n", ccaList.get(i).toString());
			}
			return output;
		}
		
		
		//DISPLAY ALL CCA IN ccaList
		public static void viewAllCCA(ArrayList<CCA> ccaList) { //Yan
			String output = String.format("%-63s %-15d %-15s %-15s %-15s %-19s %-13s\n", "ID", "TITLE", "DESCRIPTION", "NUMBER OF SEATS", "DAY", "TIME", "VENUE");
			 output += retrieveAllCCA(ccaList);
			System.out.println(output);
		}
		
		//GET STUDENT DETAILS TO ADD
		public static CCA inputCCA() { //Yan
			int ccaID = Helper.readInt("Enter CCA ID > ");
			String title = Helper.readString("Enter CCA title > ");
			String description = Helper.readString("Enter CCA description > ");
			int seats = Helper.readInt("Enter number of seats > ");
			String day = Helper.readString("Enter day of CCA > ");
			String time = Helper.readString("Enter time of CCA > ");
			String venue = Helper.readString("Enter venue > ");
			
			CCA CCA = new CCA("", 0, ccaID ,"", title, seats, day, time, venue);
			return CCA;
		}
		
		//ADD CCA INTO ccaList
		public static void addCCA(ArrayList<CCA> ccaList, CCA CCA) { //Yan
			ccaList.add(CCA);
		}
		
		//FINDING CCA POSITION
		public static int findCCAPosition(ArrayList<CCA> ccaList) { //Yan
			int position = 0;
			boolean found = true;
			while (found != false) {
				int ccaPos = Helper.readInt("Enter CCA ID > ");
				for (int i = 0; i < ccaList.size(); i++) {
					if (ccaList.get(i).getID() == ccaPos) {
						position = i;
						found = false;
					}
				}
				if (position == -1) {
					System.out.print("Unable to find CCA \n");
				}
			}
			return position;
		}
		
		//DELETE CCA
		public static void deleteCCA(ArrayList<CCA> ccaList, int position) { 
			ccaList.remove(position);
		}

}
