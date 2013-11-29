package tests;

import static org.junit.Assert.*;
import main.Lift;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_query_floor_EC_EC {

	private Lift lift;

	@Before
	public void Setup() {
		lift = new Lift();
	}

	@Test
	public void TestCase1() {
		lift.setFloor(1);
		assertEquals(1, lift.query_floor());
	}

	
	@After
	public void TearDown() {
		lift = null;
	}

}
