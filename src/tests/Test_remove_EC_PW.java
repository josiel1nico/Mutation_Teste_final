package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import main.Paperround;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_remove_EC_PW {

	private Paperround paperround;
	private List<Integer> papers;
	private List<Integer> magazines;

	@Before
	public void Setup() {
		this.paperround = new Paperround();
		this.papers = new ArrayList<>();
		this.magazines = new ArrayList<>();
		paperround.setPapers(papers);
		paperround.setMagazines(magazines);
	}

	@Test
	public void TestCase1() {
		paperround.remove(-1);
	}

	@Test
	public void TestCase2() {
		paperround.remove(1);
		assertEquals(0, paperround.getPapers().size());
		assertEquals(0, paperround.getMagazines().size());
	}

	@Test
	public void TestCase3() {
		paperround.addPaper(1);
		paperround.remove(1);
		assertEquals(0, paperround.getPapers().size());
		
	}


	@Test
	public void TestCase4() {
		paperround.addPaper(163);
		paperround.remove(163);
		assertEquals(0, paperround.getPapers().size());
	}

	@After
	public void TearDown() {
		paperround = null;
	}
}
