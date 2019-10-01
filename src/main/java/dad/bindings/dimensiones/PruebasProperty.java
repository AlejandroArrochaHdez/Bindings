package dad.bindings.dimensiones;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class PruebasProperty {

	public static void main(String[] args) {

		DoubleProperty a = new SimpleDoubleProperty(4);
		DoubleProperty b = new SimpleDoubleProperty(5);
		DoubleProperty c = new SimpleDoubleProperty();
		
		// o = pbservableValue, ov = oldValue, nv = newValue
		a.addListener((o, ov, nv) -> System.out.println("A antes valia " + ov + " y ahora vale " + nv));
		
		c.bind(a.multiply(b));
		c.addListener((o, ov, nv)-> System.out.println("C antes valia " + ov + " y ahora vale " + nv));
		
		
//		System.out.println(c.doubleValue());
		
		b.set(6);
		
//		System.out.println(c.doubleValue());
		
		a.set(3);
		
//		System.out.println(c.doubleValue());
		
		
	}

}
