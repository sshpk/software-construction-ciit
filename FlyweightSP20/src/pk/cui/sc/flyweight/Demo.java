package pk.cui.sc.flyweight;

public class Demo {
	static int PLOT_SIZE = 500;
	static int TREES_TO_PLANT = 1000;
	static int TREE_TYPES = 2;

	public static void main(String[] args) {
		Forest forest = new Forest();
		for (int i = 0; i < Math.floor(TREES_TO_PLANT / TREE_TYPES); i++) {
			forest.plantTree(random(0, PLOT_SIZE), random(0, PLOT_SIZE),
					"Summer Oak", Color.GREEN, "Oak texture stub");
			forest.plantTree(random(0, PLOT_SIZE), random(0, PLOT_SIZE),
					"Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
		}
		forest.display();

		System.out.println(TREES_TO_PLANT + " trees planted");
		System.out.println("---------------------");
		System.out.println("Memory usage:");
		System.out.println("Tree size (8 bytes) * " + TREES_TO_PLANT);
		System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
		System.out.println("---------------------");
		System.out.println("Total: " + ((TREES_TO_PLANT * 8 + TREE_TYPES * 30) / 1024 ) +
				"KB (instead of " + ((TREES_TO_PLANT * 38) / 1024 ) + "KB)");
	}

	private static int random(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
}
