
public class HeavyVehicle extends Vehicle {
	
	private int weight;
	

	public HeavyVehicle(String vehicleType,int modelNumber,int enginePower,int tireSize,int weight) {
		// TODO Auto-generated constructor stub
		super(vehicleType,modelNumber,"diesel",enginePower,tireSize);
		this.weight = weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}

}
