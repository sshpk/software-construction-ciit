 public class Meal {
    protected MealImp imp;
    public Meal() {
        imp = new AmericanMealImp();
    }
    public Meal(String type) {
        if (type.equals("American"))
            imp = new AmericanMealImp();
        if (type.equals("Italian"))
            imp = new ItalianMealImp();
        if (type.equals("French"))
            imp = new FrenchMealImp();
    }

    public void getFirstCourse() {
        imp.getAppetizer();
    }

    public void getSecondCourse() {
        imp.getMeat();
    }

    public void getBeverage() {
        imp.getBeverage();
    }

    public void getDessert() {
        imp.getDessert();
    }
}
