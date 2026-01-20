package scenariobasedpractice.BagnBallOrganizer;

public class Ball {
private static int uniId=1;
	
	private int id;
	private String color;
	private String size;
	
	public Ball(String color, String size) {
		this.id = uniId++;
		this.color = color;
		this.size = size;
	}
	
	public int getId() {
		return id;
	}
	public String getColor() {
		return color;
	}
	public String getSize() {
		return size;
	}
}
