
public class NewMachine implements TouchScreenInterface {

	public static void main(String[] args) {
		CoffeeMachineAdapter adapter = new CoffeeMachineAdapter(new OldMachine());
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
		
	}
}
