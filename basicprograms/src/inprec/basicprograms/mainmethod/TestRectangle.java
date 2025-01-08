package inprec.basicprograms.mainmethod;
import in.prec.basicprograms.shapes.Rectangle;
public class TestRectangle {
public static void main(String[] args) {
	Rectangle rectangle1=new Rectangle();
	Rectangle rectangle2=new Rectangle();
	Rectangle rectangle3=new Rectangle();
	Rectangle rectangle4=new Rectangle();
	
	float area=rectangle1.calculateArea();
	System.out.println(area);
}
}
