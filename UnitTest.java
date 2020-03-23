import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void testAdapter() {
		OldMachine machine = new OldMachine();
		CoffeeMachineAdapter adapter = new CoffeeMachineAdapter(machine);
		
		assertNotNull(adapter);
	}
	
	@Test
	void testFirstSecletion() {
		OldMachine machine = new OldMachine();
		CoffeeMachineAdapter adapter = new CoffeeMachineAdapter(machine);
		
		assertEquals(adapter.chooseFirstSelection(), "You've selected Regular Coffee");
	}
	
	void testSecondSelection() {
		OldMachine machine = new OldMachine();
		CoffeeMachineAdapter adapter = new CoffeeMachineAdapter(machine);
		
		assertEquals(adapter.chooseSecondSelection(),"You've selected Decaf Coffee");
	}

}


