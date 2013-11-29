package tests;

import static org.junit.Assert.*;
import main.Lift;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_go_to_EC_PW {

	private Lift lift;

	@Before
	public void Setup() {
		lift = new Lift();
	}

	@Test
	public void TestCase1() {
		lift.setFloor(1);
		lift.go_to(1);
		assertEquals(1, lift.getFloor());
	}

	@Test
	public void TestCase2() {
		lift.setFloor(1);
		lift.go_to(3);
		assertEquals(3, lift.getFloor());
	}

	@Test
	public void TestCase3() {
		lift.setFloor(1);
		lift.go_to(4);
		assertEquals(4, lift.getFloor());
	}

	@Test
	public void TestCase4() {
		lift.setFloor(1);
		lift.go_to(5);
		assertEquals(5, lift.getFloor());
	}

	@Test
	public void TestCase5() {
		lift.setFloor(2);
		lift.go_to(1);
		assertEquals(1, lift.getFloor());
	}
	
	
	@After
	public void TearDown() {
		lift = null;
	}

}
