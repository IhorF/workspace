package HomeWorkJavaCore;

public class Rectangle {
	int length;
	int width;
	Rectangle(){}
	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	void perumetr(){
	int	length=this.length;
	int	width=this.width;
		System.out.println("Периметр прямокутника = "+2*(length+width));
		
	}
	
	void ploshcha(){
	int	length=this.length;
	int	width=this.width;
		System.out.println("Площа прямокутника = "+length*width);
		
	}

	public static void main(String[] args) {
		Rectangle p1=new Rectangle();
		p1.length=10;
		p1.width=8;
		Rectangle p2=new Rectangle(15, 11);
		p1.ploshcha();
		p2.ploshcha();
		p1.perumetr();
		p2.perumetr();

	}

}
