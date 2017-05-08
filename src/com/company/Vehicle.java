package com.company;

/**
 * Created by zz9ffd on 2017-05-05.
 */
public class Vehicle {

	private String vehicleLicencePlateNum;
	private String vehicleType;
	private String vehicleMake;
	private Integer vehicleWeight;
	private Integer vehicleMileage;
	private Double vehicleGPSPosLong = 50.0000000;
	private Double vehicleGPSPosLat = 20.0000000;
	private String vehicleDriverName;

	//----Constructor----------------------------------------------------------

	public Vehicle(String vehicleLicencePlateNum, String vehicleType, String vehicleMake, Integer vehicleWeight, Integer vehicleMileage, String vehicleDriverName) {
		this.vehicleLicencePlateNum = vehicleLicencePlateNum;
		this.vehicleType = vehicleType;
		this.vehicleMake = vehicleMake;
		this.vehicleWeight = vehicleWeight;
		this.vehicleMileage = vehicleMileage;
		this.vehicleDriverName = vehicleDriverName;
	}

	//----Getters----------------------------------------------------------

	public String getVehicleLicencePlateNum() {
		return vehicleLicencePlateNum;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public Integer getVehicleWeight() {
		return vehicleWeight;
	}

	public Integer getVehicleMileage() {
		return vehicleMileage;
	}

	public Double getVehicleGPSPosLong() {
		return vehicleGPSPosLong;
	}

	public Double getVehicleGPSPosLat() {
		return vehicleGPSPosLat;
	}

	public String getVehicleDriverName() {
		return vehicleDriverName;
	}

	//----Setters----------------------------------------------------------

	public void setVehicleLicencePlateNum(String vehicleLicencePlateNum) {
		this.vehicleLicencePlateNum = vehicleLicencePlateNum;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public void setVehicleWeight(Integer vehicleWeight) {
		this.vehicleWeight = vehicleWeight;
	}

	public void setVehicleMileage(Integer vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}

	public void setVehicleGPSPos (Double vehicleGPSPosLong, Double vehicleGPSPosLat) {
		this.vehicleGPSPosLong = vehicleGPSPosLong;
		this.vehicleGPSPosLat = vehicleGPSPosLat;
	}

	public void setVehicleDriverName(String vehicleDriverName) {
		this.vehicleDriverName = vehicleDriverName;
	}
}
