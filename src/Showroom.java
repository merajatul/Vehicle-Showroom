import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Showroom {
    
	int numberOfVisitors;
	private List<Vehicle> vehicleList;
	
	public Showroom() {
		super();
		this.vehicleList = new ArrayList<Vehicle>();
		numberOfVisitors = 30;
		
	}
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		
		if(vehicle.vehicleType == "sports") {
			numberOfVisitors = numberOfVisitors + 20;
		}
		
		System.out.println("Vehicle Added!!\n");
		
		
	}
	public void showDetails() {
		
		
		
		if(vehicleList.size()==0) {
			System.out.println("No Vehicles to show\n");
		}
	
	    else {
		System.out.println("The vehicles are: ");
		for(int i =0;i<vehicleList.size();i++) {
			System.out.println("Index :" +i);
			System.out.println("Vehicle Type :" + vehicleList.get(i).vehicleType);
			System.out.println("Model Number :" + vehicleList.get(i).modelNumber);
			System.out.println("Engine Type :" + vehicleList.get(i).engineType);
			System.out.println("Engine Power :" + vehicleList.get(i).enginePower);
			System.out.println("Tire Size :" + vehicleList.get(i).tireSize);
			System.out.println();
			
			
			
		}
		
	}
}
	
	public void showVehiclesWithVisitors() {
		
		System.out.println("Expected Visitor Count: " +numberOfVisitors);
		
		showDetails();
		
	}
	public void removeVehicle() {
		
		Scanner sc = new Scanner(System.in);
		if(vehicleList.size()==0) {
			System.out.println("No Vehicles available\n");
		}
		else {
			int index =  -1;
			boolean ok = true;
			showDetails();
			

			while(index<0 || index>= vehicleList.size()) {
				if(ok == false) {
					System.out.println("Entered input is invalid");
				}
				
				ok = false;
				System.out.println("Enter a valid index: ");
				index = sc.nextInt();
				
				}
			if(vehicleList.get(index).vehicleType == "sports") {
				numberOfVisitors = numberOfVisitors - 20;
			}
			vehicleList.remove(index);
			System.out.println("Vehicle Removed!!\n");
				
			}

				
			
				
				
				
	}
			
			
			
		
		
	
	public void setVisitors(int numberOfVisitors ) {
		this.numberOfVisitors = numberOfVisitors;
	}
	public int getVisitors( ) {
		return numberOfVisitors;
	}
	
	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}
	
	

}
