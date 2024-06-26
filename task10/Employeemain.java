package task10;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instance to call the method
		Employee objEmployee = new Employee(1001, "Micheal", "Paul", "Micheal Paul", 30000);
		objEmployee.getid();
		objEmployee.getfirstame();
		objEmployee.getlastname();
		objEmployee.getName();
		objEmployee.getsalary();
		objEmployee.setsalary(30000);
		//objEmployee.getsalary();
		objEmployee.getannualsalary();
		objEmployee.raiseSalary(10);
		System.out.println(objEmployee.toString());
		
		
	}

}
