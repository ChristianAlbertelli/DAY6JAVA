package QA.HSBC.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.HSBC.Utilities.Records;

@RestController
public class First {
	
	@Autowired
	Records ref;
	
	@GetMapping("/showrecords")
	public ArrayList<String> displayallrecords() {
		return ref.showemployees();
	}
	
	@GetMapping("/addrecord/{name}")
	public String addingRecord(@PathVariable("name") String name) {
		ref.addRecord(name);
		return "Record updated";
	}
	
	@GetMapping("/removerecord/{r}")
	public String removingRecord(@PathVariable("r") int reno) {
		ref.removeRecord(reno);
		return "Record deleted";
	}
}
