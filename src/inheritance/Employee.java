package inheritance;

public class Employee {
	
	//Make employee class abstract
	//make the method pay an abstract method
	//make all the subclasses have a custom pay
	//make bonus a non-abstract method in employee
	//and make clerk have a custom bonus

	void pay() {
		System.out.println("Pay an employee");
	}

	void terminate() {
		System.out.println("Terminate the employee");
	}
	
	void bouns() {
		System.out.println("pay 3.5% bonus");
	}

}
