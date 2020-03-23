
public class CoffeeMachineAdapter implements TouchScreenInterface {
	private OldMachine oldMachine;
	
	public CoffeeMachineAdapter(OldMachine oldMachine) {
		this.oldMachine = oldMachine;
	}

	public String chooseFirstSelection() {
		return oldMachine.selectionOne();
	}
	
	public String chooseSecondSelection() {
		return oldMachine.selectionTwo();
	}
	
}
