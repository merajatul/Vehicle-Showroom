
public class SportsVehicle extends Vehicle{
	private boolean isTurbo;
	public SportsVehicle(String vehicleType,int modelNumber,int enginePower,int tireSize,boolean isTurbo) {
		super(vehicleType,modelNumber,"oil",enginePower,tireSize);
		this.isTurbo = isTurbo;
	}
	
	
	public void setTurbo(boolean isTurbo) {
		this.isTurbo = isTurbo;
	}
	public boolean getIsTurbo() {
		return isTurbo;
	}
    
}
