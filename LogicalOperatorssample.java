package Operators;

public class LogicalOperatorssample1 {

	public static void main(String[] args) {
		int x=10, y=9, z=5;
		System.out.println("x>y & y>z "+ (x>y & y>z));
		System.out.println("x>y & y<z "+ (x>y & y<z) );
		System.out.println("x>y || y<z "+ (x>y || y<z));
		System.out.println("!(x>y || x>z) "+ !(x>y || x>z ));
		// TODO Auto-generated method stub

	}

}
