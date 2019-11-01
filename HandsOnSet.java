package programstatements;

import java.util.HashSet;
import java.util.Set;



public class HandsOnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<NorthDallasCity> details = new HashSet<NorthDallasCity>();
		
		NorthDallasCity city1 = new NorthDallasCity(75202 ,"canton street","City Museum");
		NorthDallasCity city2 = new NorthDallasCity(75226 ,"clover street","Art center");
		
		details.add(city1);
		details.add(city2);
		
		for(NorthDallasCity pr:details){
            //System.out.println(pr);
            
            if (pr.getName().contains("clover"))
            {
            	System.out.println(pr);
            }
		
	}

}
}

class NorthDallasCity {
	int zipcode;
	String name;
	String speciality;
	
	NorthDallasCity(int zipcode,String name,String speciality){
		this.zipcode=zipcode;
		this.name=name;
		this.speciality=speciality;
	}
	
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}	
	
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "zipcode  : " + zipcode +"  name " + name + " City Speciality : " + speciality;
		
	}
	
}
