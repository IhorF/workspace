package HomeWork;


public class Task1 {
	public static void main(String[] args) {
		equation(8,9,2);
	}
	static void equation(int a, int b, int c){
		double d=b*b-4*a*c;
		if(d<0)
			System.out.println("г������ ����'���� ����.");
		else if(d==0){
			double x=(-1*b)/(2*a);
			System.out.println("г������ �� ���� ����'����: "+x);	
			
		}
		else if(d>0){
			double x1=((-1*b)-Math.sqrt(d))/(2*a);
			double x2=((-1*b)+Math.sqrt(d))/(2*a);
			System.out.println("г������ �� ��� ����'����: "+x1+", "+x2);	
			
		}
		
		
	}
}
