package main;

import java.util.ArrayList;
import java.util.List;

public class Paperround {

	private List<Integer> papers;
	private List<Integer> magazines;

	public Paperround() {
		this.papers = new ArrayList<Integer>();
		this.magazines = new ArrayList<Integer>();
	}

	public void addPaper(int houseNumber) {
		if ((houseNumber >= 1 && houseNumber <= 163) && papers.size() < 60) {
			this.papers.add(houseNumber);
		}
	}

	public void addMagazine(int houseNumber) {
		if (hasPaper(houseNumber)) {
			this.magazines.add(houseNumber);
		}
	}

	private boolean hasPaper(int houseNumber) {
		for (int i = 0; i < papers.size(); i++) {
			if (papers.get(i) == houseNumber) {
				return true;
			}
		}
		return false;
	}

	public void remove(int houseNumber) {
		if (houseNumber >= 1 && houseNumber <= 163) {
			papers.remove(new Integer(houseNumber));
			magazines.remove(new Integer(houseNumber));
		}
	}

	public void setMagazines(List<Integer> magazines) {
		this.magazines = magazines;
	}

	public void setPapers(List<Integer> papers) {
		this.papers = papers;
	}

	public List<Integer> getPapers() {
		return this.papers;
	}

	public List<Integer> getMagazines() {
		return this.magazines;
	}
}
