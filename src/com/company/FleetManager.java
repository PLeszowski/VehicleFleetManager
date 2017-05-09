package com.company;

import java.util.*;

/**
 * Created by zz9ffd on 2017-05-05.
 */
public class FleetManager {

	List<Vehicle> allVehicles = new ArrayList<>();
	List<Vehicle> inUseVehicles = new ArrayList<>();

	public FleetManager() {
	}


	public void addVehicle(Vehicle vehicle) {

		System.out.println("Added vehicle with licence plate number: " + vehicle.getVehicleLicencePlateNum() + ".");
		allVehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		System.out.println("Removed vehicle with licence plate number: " + vehicle.getVehicleLicencePlateNum() + ".");
		allVehicles.remove(vehicle);
	}

	public void removeVehicleByLicencePlateNum(String licencePlateNum) {

		Vehicle vehicle = searchAllVehiclesByLicencePlateNum(licencePlateNum);

		if (vehicle == null) {
			System.out.println("Vehicle with licence plate number " + licencePlateNum + " not found.");
		} else {
			System.out.println("Removed vehicle with licence plate number: " + licencePlateNum + ".");
			allVehicles.remove(vehicle);

			vehicle = searchInUseVehiclesByLicencePlateNum(licencePlateNum);

			if (vehicle != null) {
				inUseVehicles.remove(vehicle);
			}

		}

	}

	public void listAllVehicles() {

		System.out.println("All vehicles in fleet:");

		for (Vehicle vehicle : allVehicles) {
			System.out.println(vehicle.getVehicleBrand() + ": " + vehicle.getVehicleLicencePlateNum());
		}

		System.out.println("Amount of vehicles in fleet: " + allVehicles.size());
	}

	public void addInUseVehicle(Vehicle vehicle) {

		if (vehicle.getVehicleDriverName() == "NO DRIVER") {
			System.out.println("Vehicle cannot leave base without driver");
		} else {
			if (searchAllVehicles(vehicle)) {

				if (searchInUseVehicles(vehicle)) {
					System.out.println("Vehicle with licence plate number " + vehicle.getVehicleLicencePlateNum() + " is already in use");
				} else {
					inUseVehicles.add(vehicle);
					System.out.println("Vehicle with licence plate number " + vehicle.getVehicleLicencePlateNum() + " is now in use");
				}
			} else {
				System.out.println("Vehicle not in fleet");
			}
		}
	}

	public void addInUseVehicleByLicencePlateNum(String licencePlateNum) {

		Vehicle vehicle = searchAllVehiclesByLicencePlateNum(licencePlateNum);

		if (vehicle == null) {
			System.out.println("Vehicle with licence plate number " + licencePlateNum + " not found");
		} else {

			if (searchInUseVehicles(vehicle)) {
				System.out.println("Vehicle with licence plate number " + licencePlateNum + " is already in use");
			} else {
				System.out.println("Vehicle with licence plate number " + licencePlateNum + " is now in use");
				inUseVehicles.add(vehicle);
			}
		}
	}

	public void removeInUseVehicle(Vehicle vehicle) {

		if (searchInUseVehicles(vehicle)) {
			inUseVehicles.remove(vehicle);
			System.out.println("Vehicle with licence plate number " + vehicle.getVehicleLicencePlateNum() + " is on base");
		} else {
			if (searchAllVehicles(vehicle)) {
				System.out.println("Vehicle with licence plate number " + vehicle.getVehicleLicencePlateNum() + " was already on base");
			} else {
				System.out.println("Vehicle not in fleet");
			}
		}
	}

	public void removeInUseVehicleByLicencePlateNum(String licencePlateNum) {

		Vehicle vehicle = searchInUseVehiclesByLicencePlateNum(licencePlateNum);

		if (vehicle == null) {
			vehicle = searchAllVehiclesByLicencePlateNum(licencePlateNum);
			if (vehicle == null) {
				System.out.println("Vehicle with licence plate number " + licencePlateNum + " is not in fleet");
			} else {
				System.out.println("Vehicle with licence plate number " + licencePlateNum + " was already on base");
			}
		} else {
			System.out.println("Vehicle with licence plate number " + licencePlateNum + " is now on base");
			inUseVehicles.remove(vehicle);
		}
	}

	public void listAllInUseVehicles() {

		System.out.println("All vehicles in use:");

		for (Vehicle vehicle : inUseVehicles) {
			System.out.println(vehicle.getVehicleDriverName() + ": " + vehicle.getVehicleLicencePlateNum());
		}

		System.out.println("Amount of vehicles in use: " + inUseVehicles.size());
	}

	public void displayVehicleDataByLicencePlateNum(String licencePlateNum) {

		Vehicle vehicle = searchAllVehiclesByLicencePlateNum(licencePlateNum);

		if (vehicle == null) {
			System.out.println("Vehicle with licence plate number " + licencePlateNum + " not found");
		} else {
			System.out.println("Data of vehicle with licence plate number: " + licencePlateNum + ":");
			System.out.println("Type: " + vehicle.getVehicleType());
			System.out.println("Make: " + vehicle.getVehicleBrand());
			System.out.println("Weight: " + vehicle.getVehicleWeight());
			System.out.println("Mileage: " + vehicle.getVehicleMileage());
		}
	}

	public void displayGPSPosition(Vehicle vehicle) {

		if (searchAllVehicles(vehicle)) {
			System.out.println("Vehicle with licence plate number " + vehicle.getVehicleLicencePlateNum() + " is at GPS position " + vehicle.getVehicleGPSPosLong() + " Longitude, " + vehicle.getVehicleGPSPosLat() + " Latitude");
		} else {
			System.out.println("No GPS position, vehicle not in fleet.");
		}
	}

	public void displayGPSPositionByDriver(String driversName) {

		Vehicle vehicle = searchAllVehiclesByDriversName(driversName);

		if (vehicle == null) {
			System.out.println("Vehicle with driver " + driversName + " not found");
		} else {
			System.out.println("Vehicle with driver " + vehicle.getVehicleDriverName() + " is at GPS position " + vehicle.getVehicleGPSPosLong() + " Longitude, " + vehicle.getVehicleGPSPosLat() + " Latitude");
		}
	}

	private Vehicle searchAllVehiclesByLicencePlateNum(String licencePlateNum) {


		Vehicle vehicleID = null;

		for (Vehicle vehicle : allVehicles) {

			if (vehicle.getVehicleLicencePlateNum().equals(licencePlateNum)) {
				vehicleID = vehicle;
			}
		}
		return vehicleID;
	}

	private Vehicle searchAllVehiclesByDriversName(String driversName) {

		Vehicle vehicleID = null;

		for (Vehicle vehicle : allVehicles) {

			if (vehicle.getVehicleDriverName().equals(driversName)) {
				vehicleID = vehicle;
			}
		}
		return vehicleID;
	}

	private boolean searchAllVehicles(Vehicle searchedVehicle) {

		boolean vehicleFound = false;

		for (Vehicle vehicle : allVehicles) {

			if (vehicle == searchedVehicle) {
				vehicleFound = true;
			}
		}
		return vehicleFound;
	}

	private boolean searchInUseVehicles(Vehicle searchedVehicle) {

		boolean vehicleFound = false;

		for (Vehicle vehicle : inUseVehicles) {

			if (vehicle == searchedVehicle) {
				vehicleFound = true;
			}
		}
		return vehicleFound;
	}

	private Vehicle searchInUseVehiclesByLicencePlateNum(String licencePlateNum) {

		Vehicle vehicleID = null;

		for (Vehicle vehicle : inUseVehicles) {

			if (vehicle.getVehicleLicencePlateNum().equals(licencePlateNum)) {
				vehicleID = vehicle;
			}
		}
		return vehicleID;
	}


}
