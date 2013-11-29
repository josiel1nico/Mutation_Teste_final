package tests;

import static org.junit.Assert.*;
import main.Lift;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_go_down_EC_EC {

	private Lift lift;

	@Before
	public void Setup() {
		lift = new Lift();
	}

	@Test
	public void TestCase1() {
		lift.setFloor(1);
		lift.go_down();
		assertEquals(1, lift.getFloor());
	}

	@Test
	public void TestCase2() {
		lift.setFloor(2);
		lift.go_down();
		assertEquals(1, lift.getFloor());
	}

	@After
	public void TearDown() {
		lift = null;
	}
}
