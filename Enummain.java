package programstatements;

public class Enummain {

	public static void main(String[] args) {
		// TODO Auto-generated method st

EnumSample[] toArray = EnumSample.values();
System.out.println("List of Brands with values\n");
for (EnumSample po1: toArray){
	System.out.println(po1 +">>"+po1.currentpopularity+ ">>" +po1.avgprice);
	}

}
}