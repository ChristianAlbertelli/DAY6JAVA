package QA.HSBC.Utilities;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;
import QA.HSBC.Entities.Student;



@Service
public class StudentRecords {

	ArrayList<Student> list=new ArrayList<Student>();
	
	public StudentRecords() {
		Student stu1=new Student();
		stu1.regno=102;
		stu1.name="chri";
		stu1.marks=149;
		
		list.add(stu1);
		
	}
	
	public ArrayList<Student> showStudents(){
		return list;
	}
	
	public void addrecord(Student st) {
		list.add(st);
	}
	
	
	Student ref;
	public ArrayList<Student> singlerecord(String single) {
		int i=0;
		for(i<Student.size();i++) {
			if(Student[i].name==single) {
				ref=Student[1];
			}
		}
		ref=student.get(i);
		return ref;
	}
}
