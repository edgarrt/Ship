package ships;



public class CruiseShip extends Ship{

	/*CruiseShip
Number of rooms.
Number of passengers
Number of stops
Entertainment programs
Price per person
Cuisine Type
*/
	int rooms,pass,stops;
	String entertain, cuisine;
	double price;
	

	CruiseShip( int length ,int width,int  height , int density, int max, int displ , int yr, int crew, String name , String madeby, String mater,int room, int pass, int stop , double price, String e , String c){
		super(length,width,height,density,max,displ,yr,crew,name,madeby, mater );
		this.rooms = room;
		this.pass = pass;
		this.stops = stop; 
		this.price = price;
		this.entertain = e;
		this.cuisine = c ;
		
	}
	

	void goingto(String g){
		System.out.print("This Cruise ship is on its way to " + g);
		
	}
	
	void print(){
		System.out.println("This Cruise ship extends Ship class");
		System.out.format("This ship is %d feet long, %d ft wide, and %d ft tall \n", length,width,height);
		System.out.format("Its desnity is %d, max weight being %d , and its displacement is %d\n", density,max_weight,displacement);
		System.out.format("It was made in the year %d, can have a max crew of %d\n", year_made,max_crew);
		System.out.format("It has %d total rooms, and %d total passangers\n", rooms,pass);
		System.out.format("It has been %d days since their last stop, and the price per passanger is $%.1f\n", stops,price);
		System.out.format("For entertainment it has %ss and serves %s as food\n", entertain,cuisine);
		System.out.format("The Ships name is %s, made by %s, and is made out of %s\n", name,madeBy,mater);
	
	}
}
