package co.grandcircus;
/*
 * @Atiba Franklin
 */

public class Circle {
	
	private double rad;

	public Circle(double radius) {
		this.rad = radius;
	}
	public double getCircumference() {
		return (Math.PI * rad * 2);
	}
	public double getArea() {
		Double area = Math.PI * (rad * rad);
		return area;
	}
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
	}
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	
}
