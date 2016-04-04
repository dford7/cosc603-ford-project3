package edu.towson.cis.cosc603.project4.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		double edge1 = Math.abs((p2.x - p1.x));  
		double edge2 = Math.abs((p2.y - p1.y));
		
		return edge1 * edge2;
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		double edge1 = Math.pow((p2.x - p1.x), 2);  
		double edge2 = Math.pow((p2.y - p1.y), 2);
		
		return Math.sqrt(edge1 +  edge2);
	}
}
