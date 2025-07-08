package oopsAndInheritance;

public class Question1Box {
	double w;
	double h;
	double d;
	Question1Box(double w,double h,double d){
		this.w=w;
		this.h=h;
		this.d=d;
	}
	double vol() {
		return w*h*d;
	}
	
}
class Box{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1Box obj=new Question1Box(2,3,4);
		double res=obj.vol();
		System.out.println(res);
	}

}
