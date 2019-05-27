package pk.cuiatd.sc.sp19.sessional1.lab.q1;

public class Demo {
	public static void main(String[] args) {
		DisplayService service = new FeedbackDisplayService();
		service.display();
		service = new ErrorDisplayService();
		service.display();
		service = new OrderDisplayService();
		service.display();
	}
}
