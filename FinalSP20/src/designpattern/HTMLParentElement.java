package designpattern;

import java.util.ArrayList;
import java.util.List;

public class HTMLParentElement extends HTMLTag{
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HTMLTag>children;
	public HTMLParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.children = new ArrayList<>();
	}
	@Override
	public String getTagName() {
		return tagName;
	}
	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}
	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	@Override
	public void addChildTag(HTMLTag htmlTag){
		children.add(htmlTag);
	}
	@Override
	public void removeChildTag(HTMLTag htmlTag){
		children.remove(htmlTag);
	}
	@Override
	public List<HTMLTag>getChildren(){
		return children;
	}
	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HTMLTag tag : children){
			tag.generateHtml();
		}
		System.out.println(endTag);
	}
}
