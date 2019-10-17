package programstatements;

public class MaxByteCanHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=0;
		do {
			
			x=(byte) (x+1);
			if (x%10!=0) {
			System.out.println(x);
			
		}
			else {
				System.out.println("Dekho dekho it is Deca");
			}
	}while(x>0);

}
}
