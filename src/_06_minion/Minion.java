package _06_minion;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public String getName() {
		return name;
	}

	public int getEyes() {
		return eyes;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String string) {
		this.master= string;

	}

	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}
}
