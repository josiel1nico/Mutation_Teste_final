package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import main.Paperround;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_addPaper_EC_PW {

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
		paperround.addPaper(1);
		paperround.addMagazine(60);
		assertEquals(1, paperround.getPapers().size());
	}

	@Test
	public void TestCase2() {
		paperround.addPaper(-1);
		paperround.addMagazine(60);
		assertEquals(0, paperround.getPapers().size());
	}
	
	@Test
	public void TestCase3() {
		paperround.addPaper(163);
		assertEquals(1, paperround.getPapers().size());
	}
	
	@Test
	public void TestCase4() {
		for (int i = 0; i < 100; i++) {
			paperround.addPaper(1);
		}
		assertEquals(60, paperround.getPapers().size());
	}

	@After
	public void TearDown() {
		paperround = null;
	}
}
