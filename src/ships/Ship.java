package ships; 


public class Ship {

	/*Ship class
..length, width, height, density
..maximum crew members.
..name
..weight of ship
..weight it can carry
..displacement of ship.
..year made.
..made by - brand.
..material []
..write public methods. getter, setters.
..goingto() etc.
*/
	
	int length,width,height, density, weight,max_weight,displacement,year_made;
	int max_crew;
	String name;
	String madeBy; 
	String mater;
	
	Ship( int length , int width, int height , int density, int max, int displ , int yr, int crew, String name , String madeby , String mater ){
	
		this.length = length;
		this.width  = width;
		this.height = height;
		this.density = density;
		this.max_weight = max;
		this.displacement = displ;
		this.year_made = yr;
		this.max_crew = crew;
		this.name = name;
		this.madeBy = madeby;
		this.mater = mater; 
	}
	
	void print(){
		System.out.format("This ship is %d feet long, %d ft wide, and %d ft tall \n", length,width,height);
		System.out.format("Its desnity is %d, max weight being %d , and its displacement is %d\n", density,max_weight,displacement);
		System.out.format("It was made in the year %d, can have a max crew of %d\n", year_made,max_crew);
		System.out.format("The Ships name is %s, made by %s, and is made out of %s\n", name,madeBy,mater);
		
				
	}

	void goingto(String g){
		System.out.print("This ship is on its way to " + g);
	}
	
	
	public static void main(String [] args){
		Ship ships [] = new Ship[3];
	
		ships[0] = new CruiseShip(100, 50, 70, 300, 100000, 300000,1999,250,"THE ONLY CRUISE SHIP", "BOATSNBOATS","Steel", 300,1000,45,75.00,"Concert","Fish ");
		ships[0].print();
		ships[0].goingto("NorthPole");
		System.out.println();
		System.out.println();
		
		ships[1] = new CargoShip(400,100,100,700,500000, 500000, 2011, 500, "The one and only Cargo Ship", "CargoShip Masters","Steel", 1000000,3000000,101,10000,"Cars From Japan");
		ships[1].print();
		ships[1].goingto("Mexico");
		System.out.println();
		System.out.println();
		
		ships[2] = new Ship(50,30,40,1000,25000,10000,2016,12,"Puny Ship", "Some Guy", "Paper");
		ships[2].print();
		ships[2].goingto("The Bay\n");
		
	}
	
}
