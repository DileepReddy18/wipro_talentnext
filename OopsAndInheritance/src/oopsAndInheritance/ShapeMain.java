package oopsAndInheritance;

class Shape{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}
class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}
	@Override
	void erase() {
		System.out.println("Erasing trinagle");
	}
}
class Cricle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing cricle");
	}
	@Override
	void erase() {
		System.out.println("Erasing cricle");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing square");
	}
	@Override
	void erase() {
		System.out.println("Erasing Square");
	}
}
public class ShapeMain {
	public static void main(String[] args) {
	Shape t=new Triangle();
	Shape c=new Cricle();
	Shape s=new Square();
	t.draw();
	t.erase();
	c.draw();
	c.erase();
	s.draw();
	s.erase();
}
}
