package QA.HSBC.Utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Records {
	
	ArrayList<String> employees=new ArrayList<String>();
	
	public Records() {
		employees.add("chri");
		employees.add("tony");
		employees.add("Ali");
	}
public ArrayList<String> showemployees() {
	
	return employees;
}
	public void addRecord(String name) {
		employees.add(name);
	}
	
	public void removeRecord(int reno) {
		employees.remove(reno);
	}
	
}
