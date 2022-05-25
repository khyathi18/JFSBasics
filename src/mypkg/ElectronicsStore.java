package mypkg;

public class ElectronicsStore 
{
	String deviceName,deviceId;
	int deviceCost;
	public ElectronicsStore() {
		System.out.println("Enter Device Details...");
	}
	public ElectronicsStore(String deviceName,String deviceId,int deviceCost)
	{
		this.deviceName=deviceName;
		this.deviceId=deviceId;
		this.deviceCost=deviceCost;
}
	@Override
	public String toString() {
		return "Electronics Details--> [Name of the device is " + deviceName + ", \n Unique Id of the device is " + deviceId + ", \n Price of the device is " + deviceCost + "]";
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public int getDeviceCost() {
		return deviceCost;
	}
	public void setDeviceCost(int deviceCost) {
		this.deviceCost = deviceCost;
	}
	
	
}