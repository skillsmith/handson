package programstatements;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " All Products (52)  ";
		StringBuilder obj=new StringBuilder(str);
		System.out.println(str.trim());
		System.out.println(str.toLowerCase());
		//System.out.println(str.substring(15,17));
		int s;
		int t;
		s=str.indexOf("(");
			
		t=str.indexOf(")");
		System.out.println( str.substring(s + 1, t));
		
		
		obj.deleteCharAt(14);
		obj.deleteCharAt(16);
		obj.insert(14, "[");	
		
		System.out.println(obj.insert(17, "]"));
	}

}

