package inheritance;

public class TestInheritanceConcepts {

	public static void main(String[] args) {

		Developer dev1 = new Developer();

		dev1.pay();
		dev1.bouns();
		dev1.fourOoneK();

		SalesPerson salesPerson1 = new SalesPerson();

//		salesPerson1.pay();
//		salesPerson1.bouns();
		salesPerson1.fourOoneK();
		
		
		Clerk clerk1 = new Clerk();
		clerk1.pay();
		clerk1.bonus();
		
		
		

	}

}
