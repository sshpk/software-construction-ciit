package adapter;

public class Square implements Shape{
	LagacySquare lagacySquare;

	public Square(Point topLeft, Point bottomRight) {
		lagacySquare = new LagacySquare(topLeft.x, topLeft.y, bottomRight.x, bottomRight.x);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
