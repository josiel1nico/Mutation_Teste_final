package main;

public class Lift {

	private int floor;

	public void go_up() {
		if(floor < 5) {
			this.floor = floor + 1;
		}
	}

	public void go_down() {
		if(floor > 1) {
			this.floor = floor - 1;
		}
	}

	public void go_to(int nFloor) {
		if(nFloor >= 1 && nFloor <= 5) {
			this.floor = nFloor;
		}
	}

	public int query_floor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getFloor() {
		return floor;
	}
}
