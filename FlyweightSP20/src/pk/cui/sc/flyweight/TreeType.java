package pk.cui.sc.flyweight;

public class TreeType {
	private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void plant(int x, int y) {
        System.out.println(this.toString()+"is planted at ("+x+","+y+")");
    }
    @Override
    public String toString() {
    	return new String("TreeType[name="+name+", color="+color+", data="+otherTreeData+"]");
    }
}
