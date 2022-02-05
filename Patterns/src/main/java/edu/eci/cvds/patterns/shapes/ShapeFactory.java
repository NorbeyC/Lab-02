package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class ShapeFactory {

	public static Shape create(RegularShapeType shape) {
		switch(shape){
			case "Triangle":
				Triangle tri = new Shape();
				return tri;
				break;

			case "Quadrilateral":
				Quadrilateral qua = new Shape();
				return qua;
				break;
			
			case "Pentagon":
				Pentagon pen = new Shape();
				return pen;
				break;

			case "Hexagon":
				Triangle hex = new Shape();
				return hex;
				break;
		}
		
	}
}

