package programstatements;

public enum EnumSample {
	

		LEVIS( "high",500),
		ADIDAS("normal",250),
		HANES("low",100);
	    
	
		public String currentpopularity;
		public double avgprice;
		
		EnumSample(String popularity ,double price ){
		 this.currentpopularity=popularity;
		 this.avgprice=price;
	 }
	

	}


