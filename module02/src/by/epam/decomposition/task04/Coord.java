package by.epam.decomposition.task04;

public class Coord {
	private String name;
	private double x;
	private double y;

	public Coord(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "[Точка = " + name + ", x=" + x + ", y=" + y + "]";
	}
	
	
}
