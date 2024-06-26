package task10;

public class Employee {
	//  declare private variable 
	 private int id;
	 private String FirstName;
	 private String LastName;
	 private String Name;
	 private int Salary;
	 // declare var
	 int Annual;
	 int Newsalary;
	 
	 
	// user defined parameterized  constructor , passing the value to the method
	 public Employee(int ID,String firstname,String lastname, String name, int salary ) {
		 // assigning value to a private var 
		 this.id=ID;
		 this.FirstName=firstname;
		 this.LastName=lastname;
		 this.Name=name;
		 this.Salary=salary;
		 
		 
	 }
	 //creating get method  to retrieve and returning the value
	 
	 public int getid() {
		 return id;
		 
	 }
	 
	 public String getfirstame() {
		 return FirstName;
		 
	 }
	 
	 public String getlastname() {
		 return LastName;
		 		 
	 }
	 
	 public String getName( ) {
		
		 return Name;		 
		 
	 }
	 
	 public int getsalary() {
		 return Salary;
		 
	 }
	 // creating set method to assign the value
	 
		
		  public void setsalary(int salary) { 
		  this.Salary=salary;
		  }
		 
	 
	 // creating  set method to calculate annual salary
		/*
		 * public int setannualsalary() {
		 *  return Annual = Salary*12;
		 * 
		 * }
		 */
	 // creating get method to retrieve the value and return the value
	 public  int getannualsalary() {		
		return Annual = Salary*12;
		 	  		 
	 }
	 // creating return  method to calculate new salary by passing the percentage inside the method
	 public  int raiseSalary(int percentage) {
		 Newsalary = (Annual + (Annual*percentage/100));
		 return Newsalary;
		 
		 
	 }
	 // creating toString to return  the output in given format
	 
	 public String toString() {
		 
		 return "Employee id=  " + id + "  Name=  " + Name + "  New Salary= " + Newsalary;
		 
	 }
	 
	 
}


