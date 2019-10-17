package programstatements;

public class HitOrMiss {

	public static void main(String[] args) {
		/*boolean array[] = new boolean[10];*/
		// TODO Auto-generated method stub
		boolean array[]= {true,false,true,true,false,false,true,true,true,true};
		for(int i=0;i<10;i++) {
			if(array[i]=true) {
		
			System.out.println("Hit");
		}
		else if (array[i]||array[i-1])
		{
			System.out.println("Miss");
		}
		else {
			System.out.println("Miss and Hit");
		}
		}
	}

}
	
