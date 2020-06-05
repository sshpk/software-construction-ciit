package pk.cui.sc.prototype;

import java.util.HashMap;
import java.util.Map;


public class ShapeRegistry {
	private Map<String, Shape> registry = new HashMap<String,Shape>();
    public ShapeRegistry() {
    Circle circle = new Circle("Green", 45);
    Rectangle rectangle = new Rectangle("Blue", 8,10);
    registry.put("Big green circle", circle);
    registry.put("Medium blue rectangle", rectangle);
    }
    public Shape put(String key, Shape shape) {
        registry.put(key, shape);
        return shape;
    }
    public Shape get(String key) {
    	Shape s = registry.get(key);
    	return s.clone();
    }

}
