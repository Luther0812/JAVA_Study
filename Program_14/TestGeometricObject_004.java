/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_14;

/**
 * @author up
 *
 */
public class TestGeometricObject_004 {
	public static void main(String[] args){
		GeometricObject_001 geoObject1 = new Circle(5);
		GeometricObject_001 geoObject2 = new Rectangle(5, 3);
		
		System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));
		
		displayGeometricObject(geoObject1);
		displayGeometricObject(geoObject2);
	}
	
	public static boolean equalArea(GeometricObject_001 object1, GeometricObject_001 object2){
		return object1.getArea() == object2.getArea();
	}
	
	public static void displayGeometricObject(GeometricObject_001 object){
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}

}
