package com.company;

public class Main {

	public static void main(String[] args) {
		// write your code here
		Vehicle car1 = new Vehicle("KR00001");
		Vehicle car2 = new Vehicle("KR00002");
		Vehicle truck3 = new Vehicle("KR00003");
		Vehicle truck4 = new Vehicle("KR00004");
		Vehicle bus5 = new Vehicle("KR00005");
		Vehicle bus6 = new Vehicle("KR00006");

		Driver driver1 = new Driver("PATRYK");
		Driver driver2 = new Driver("MAREK");
		Driver driver3 = new Driver("EDEK");
		Driver driver4 = new Driver("JUZEK");
		Driver driver5 = new Driver("FRANEK");
		Driver driver6 = new Driver("TOMEK");

		//car1.setVehicleDriverName(driver1);
		car2.setVehicleDriverName(driver2);
		truck3.setVehicleDriverName(driver3);
		truck4.setVehicleDriverName(driver4);
		bus5.setVehicleDriverName(driver5);
		bus6.setVehicleDriverName(driver6);

		// Simulate acquisition of GPS positions (in reality they would come from outside_
		car1.setVehicleGPSPos(50.0183219, 19.9198574);
		car2.setVehicleGPSPos(50.02586278, 19.9278954);
		truck3.setVehicleGPSPos(50.0359874, 19.9302587);
		truck4.setVehicleGPSPos(50.0487654, 19.9402598);
		bus5.setVehicleGPSPos(50.0548596, 19.9541157);
		bus6.setVehicleGPSPos(50.0683219, 19.9633264);

		FleetManager fleetManager = new FleetManager();

		System.out.println("----------add all vehicles-----------------");
		fleetManager.addVehicle(car1);
		fleetManager.addVehicle(car2);
		fleetManager.addVehicle(truck3);
		fleetManager.addVehicle(truck4);
		fleetManager.addVehicle(bus5);
		fleetManager.addVehicle(bus6);

		System.out.println("----------list All Vehicles-----------------");
		fleetManager.listAllVehicles();

		System.out.println("----------remove some vehicles-----------------");
		fleetManager.removeVehicleByLicencePlateNum("KR00003");
		fleetManager.removeVehicle(bus6);

		System.out.println("----------list All Vehicles-----------------");
		fleetManager.listAllVehicles();


		System.out.println("----------display Vehicle Data By Licence Plate Num-----------------");
		fleetManager.displayVehicleDataByLicencePlateNum("KR00003");
		fleetManager.displayVehicleDataByLicencePlateNum("KR00004");

		System.out.println("----------add In Use Vehicle-----------------");

		fleetManager.addInUseVehicle(car1);
		fleetManager.addInUseVehicle(truck3);
		fleetManager.addInUseVehicleByLicencePlateNum("KR00004");
		fleetManager.addInUseVehicleByLicencePlateNum("KR00004");
		fleetManager.addInUseVehicle(bus5);
		fleetManager.addInUseVehicle(bus5);
		fleetManager.addInUseVehicleByLicencePlateNum("KR00005");

		System.out.println("----------list All InUse Vehicles-----------------");
		fleetManager.listAllInUseVehicles();


		System.out.println("----------remove In Use Vehicle-----------------");
		fleetManager.removeInUseVehicle(car1);
		fleetManager.removeInUseVehicle(car1);
		fleetManager.removeInUseVehicleByLicencePlateNum("KR00005");
		fleetManager.removeInUseVehicleByLicencePlateNum("KR00005");

		System.out.println("----------list All In Use Vehicles-----------------");
		fleetManager.listAllInUseVehicles();

		System.out.println("----------display GPS Position-----------------");
		fleetManager.displayGPSPosition(car1);
		fleetManager.displayGPSPosition(car2);
		fleetManager.displayGPSPosition(truck3);
		fleetManager.displayGPSPosition(truck4);
		fleetManager.displayGPSPosition(bus5);
		fleetManager.displayGPSPosition(bus6);

		System.out.println("----------display GPS Position By Driver-----------------");
		fleetManager.displayGPSPositionByDriver("PATRYK");
		fleetManager.displayGPSPositionByDriver("MAREK");
		fleetManager.displayGPSPositionByDriver("PIOTREK");
		fleetManager.displayGPSPositionByDriver("WOJTEK");
		fleetManager.displayGPSPositionByDriver("JUZEK");
		fleetManager.displayGPSPositionByDriver("STEFAN");
	}


}
