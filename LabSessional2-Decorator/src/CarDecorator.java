
public abstract class CarDecorator implements ICar{
	protected ICar car;
	
	public CarDecorator(ICar car) {
		this.car = car;
	}
	@Override
	public void assemble() {
		car.assemble();
		
	}

}
