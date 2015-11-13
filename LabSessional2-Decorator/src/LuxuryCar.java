
public class LuxuryCar extends CarDecorator {
 
    public LuxuryCar(ICar c) {
        super(c);
    }
     
    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
