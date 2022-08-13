import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
// C206 AY2022 SEM1 - Eclipse 21-09 JDK16
public class C206_CaseStudyTest {
	// prepare test data
	private Student stu1;
	private Student stu2;
	private Student stu3;
	
	private ArrayList<Student> studentList;

//	public C206_CaseStudyTest() {
//		super();
//	}
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		stu1 = new Student("John", "John@gmail.com", 82138321, "Blk 101C", 1,"Jane", 4, "D1-01","Mrs Francis",0);
		stu2 = new Student("Pepe", "Pepe@gmail.com", 98761234, "Blk 121B", 2,"John", 4, "D1-01","Mrs Francis",0);
		stu3 = new Student("Fond", "Fond@gmail.com", 87322139, "Blk 181D", 3,"James", 4, "D1-01","Mrs Francis",0);
		
		studentList = new ArrayList<Student>();
	}

	
	@Test
	public void testAddStudent() {
		// Student list is not null, so that can add a new item
		assertNotNull("Test if there is valid student arraylist to add to", studentList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addStudent(studentList, stu1);		
		assertEquals("Test if that student arraylist size is 1?", 1, studentList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Student is added same as 1st item of the list?", stu1, studentList.get(0));
		
		//Add another student. test The size of the list is 2?
		C206_CaseStudy.addStudent(studentList, stu2);
		C206_CaseStudy.addStudent(studentList, stu3);
		assertEquals("Test that Student arraylist size is 3?", 3, studentList.size());
		assertSame("Test that Student is added same as 3rd item of the list?", stu3, studentList.get(2));
	}

	@Test
	public void testRetrieveAllStudents() {
		// Test if Student list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid student arraylist to add to", studentList);
		
		//test if the list of student retrieved from the casestudy is empty
		String allStudent= C206_CaseStudy.retrieveAllStudent(studentList);
		String testOutput = "";
		assertEquals("Check that ViewAllStudentlist", testOutput, allStudent);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addStudent(studentList, stu1);
		C206_CaseStudy.addStudent(studentList, stu2);
		assertEquals("Test if that student arraylist size is 2?", 2, studentList.size());
		
		//test if the expected output string same as the list of student retrieved from the Case Study
		allStudent = C206_CaseStudy.retrieveAllStudent(studentList);

		testOutput = String.format("%-15s %-10s %-10s %-10s %-15s %-10s %-10s\n",1,"Jane", 4, "D1-01","Mrs Francis",0, "No");
		testOutput += String.format("%-15s %-10s %-10s %-10s %-15s %-10s %-10s\n",2,"John", 4, "D1-01","Mrs Francis",0, "No");
		
	
		assertEquals("Check that ViewAllStudentList", testOutput, allStudent);
		
	}
	
	@Test
	public void testDeleteStudent() {
		// Student list is not null, so that can add a new item
		assertNotNull("Test if there is valid student arraylist to remove from", studentList);
		
		//Given an empty list, after adding 1 item and removing it the size is 0
		C206_CaseStudy.addStudent(studentList, stu1);
		studentList.remove(stu1);
		assertEquals("Test if that student arraylist size is 0?", 0, studentList.size());
		
		
		//Add another 3 student and remove. test The size of the list is 1 after removing 1?
		C206_CaseStudy.addStudent(studentList, stu1);
		C206_CaseStudy.addStudent(studentList, stu2);
		C206_CaseStudy.addStudent(studentList, stu3);
		studentList.remove(stu1);
		studentList.remove(stu2);
		assertEquals("Test that Student arraylist size is 1?", 1, studentList.size());
	}
	
	
	
	
	@After
	public void tearDown() throws Exception {
		stu1 = null;
		stu2 = null;
		stu3 = null;
		studentList = null;


	}

}
