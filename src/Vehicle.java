
public class Vehicle {
    
	String vehicleType;
	int modelNumber;
	String engineType;
	int enginePower;
	int tireSize;
	
	public Vehicle(String vehicleType,int modelNumber,String engineType,int enginePower,int tireSize) {
		super();
		this.vehicleType = vehicleType;
		this.modelNumber = modelNumber;
		this.engineType = engineType;
		
		this.enginePower = enginePower;
		this.tireSize = tireSize;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	
	public String getEngineType(String engineType) {
		return engineType;
	}
	
	
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public int getEnginePower() {
		return enginePower;
	}
	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}
	public int getTireSize() {
		return tireSize;
	}
	
    
}
