package scenariobasedpractice.GeoMeasure;

public class Line {
private int x1,x2,y1,y2;
	
	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double getLength() {
		return Math.sqrt(
				Math.pow(x2- x1,2)+
				Math.pow(y2-y1, 2)				
				);
	}
}
