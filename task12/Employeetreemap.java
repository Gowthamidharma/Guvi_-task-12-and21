package task12;

import java.util.TreeMap;


public class Employeetreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a treemap of employee id and name
		TreeMap<Integer,String> employee = new TreeMap<Integer,String>();
		
		//add employee dtail to tree map
		employee.put(101, "Mithun");
		employee.put(102, "Nikil");
		employee.put(103, "Ajay");
		employee.put(105, "Yogi");
		employee.put(106, "Yuvraj");
		employee.put(107, "Neelam");
		
		
		
		// print in alphabetic order
		
		for(String name:employee.values()) {
			System.out.println(name);		
			
		}	

	}

}
