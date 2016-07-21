package ships;


public class CargoShip extends Ship{
	
	/*
CargoShip - 
Carry Capacity in tons
Volume of cargo carried
Cargo type
dayswithout stop
fuelcapacity
	 */
	int cap, vol, days_sinceStop, fuelCap;
	String cargoType;
	
	CargoShip( int length ,int width,int  height , int density, int max, int displ , int yr, int crew, String name , String madeby, String mater, int cap, int vol , int days, int fuel, String cargo){
		super(length,width,height,density,max,displ,yr,crew,name,madeby, mater );
			
		
		this.cap = cap;
		this.vol= vol;
		this.days_sinceStop = days;
		this.fuelCap = fuel;
		this.cargoType = cargo; 	
	}
	

	void print(){
		System.out.println("This Cargo ship extends Ship class");
		System.out.format("This ship is %d feet long, %d ft wide, and %d ft tall \n", length,width,height);
		System.out.format("Its density is %d, max weight being %d , and its displacement is %d\n", density,max_weight,displacement);
		System.out.format("It was made in the year %d, can have a max crew of %d\n", year_made,max_crew);
		System.out.format("It has a capacity of %d, volume of %d\n", cap,vol);
		System.out.format("It has been %d days since their last stop, and can hold up to %d gallon of fuel\n", days_sinceStop,fuelCap);
		System.out.format("Its cargo is %s\n", cargoType);
		System.out.format("The Ships name is %s, made by %s, and is made out of %s\n", name,madeBy,mater);
		
	}
	
	void goingto(String g){

		System.out.print("This Cargo ship is on its way to " + g);
		
	}
	
	
	
}
