package designpattern;

public class Demo {

	public static void main(String[] args) {
		HTMLTag parentTag = new HTMLParentElement("<html>");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");
		HTMLTag p1 = new HTMLParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");
		parentTag.addChildTag(p1);
		HTMLTag child1 = new HTMLElement("<P>");
		child1.setStartTag("<P>");
		child1.setEndTag("</P>");
		child1.setTagBody("Testing my HTML tag library");
		p1.addChildTag(child1);
		child1 = new HTMLElement("<P>");
		child1.setStartTag("<P>");
		child1.setEndTag("</P>");
		child1.setTagBody("Paragraph 2");
		p1.addChildTag(child1);
		parentTag.generateHtml();

	}

}
