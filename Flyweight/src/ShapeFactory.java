import java.util.HashMap;


public class ShapeFactory {
	private static final HashMap<String, CircleType> circleMap = 
			new HashMap();
	public static CircleType getCircleType(String name, String color, int radius) {
		CircleType result = circleMap.get(name);
        if (result == null) {
            result = new CircleType(name, color, radius);
            circleMap.put(name, result);
        }
        return result;
	}
}

