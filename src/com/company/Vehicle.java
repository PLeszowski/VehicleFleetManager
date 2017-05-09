package com.company;

/**
 * Created by zz9ffd on 2017-05-05.
 */
public class Vehicle {

	private String vehicleLicencePlateNum;
	private String vehicleType = " VEHICLE TYPE NOT SET";
	private String vehicleBrand = " VEHICLE BRAND NOT SET";
	private Integer vehicleWeight = 0;
	private Integer vehicleMileage = 0;
	private Double vehicleGPSPosLong = 50.0000000;
	private Double vehicleGPSPosLat = 20.0000000;
	private Driver vehicleDriverName;

	//----Constructor----------------------------------------------------------

	public Vehicle(String vehicleLicencePlateNum) {
		this.vehicleLicencePlateNum = vehicleLicencePlateNum;
	}

	//----Getters----------------------------------------------------------

	public String getVehicleLicencePlateNum() {
		return vehicleLicencePlateNum;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public Integer getVehicleWeight() {
		return vehicleWeight;
	}

	public Integer getVehicleMileage() {
		return vehicleMileage;
	}

	public Double getVehicleGPSPosLong() {return vehicleGPSPosLong;}

	public Double getVehicleGPSPosLat() {return vehicleGPSPosLat;}

	public String getVehicleDriverName() {
		if (vehicleDriverName != null)
			return vehicleDriverName.getDriverName();
		else
			return "NO DRIVER";
	}

	//----Setters----------------------------------------------------------

	public void setVehicleLicencePlateNum(String vehicleLicencePlateNum) {
		this.vehicleLicencePlateNum = vehicleLicencePlateNum;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public void setVehicleWeight(Integer vehicleWeight) {
		this.vehicleWeight = vehicleWeight;
	}

	public void setVehicleMileage(Integer vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}

	public void setVehicleGPSPos(Double vehicleGPSPosLong, Double vehicleGPSPosLat) {
		this.vehicleGPSPosLong = vehicleGPSPosLong;
		this.vehicleGPSPosLat = vehicleGPSPosLat;
	}

	public void setVehicleDriverName(Driver vehicleDriverName) {
		this.vehicleDriverName = vehicleDriverName;
	}
}
