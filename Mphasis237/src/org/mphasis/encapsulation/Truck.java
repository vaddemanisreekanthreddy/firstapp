package org.mphasis.encapsulation;

class Truck extends Vehicle {
	double cargoCapacity;

	@Override
	void displayDetails() {
		System.out.println(getManufacturer());
		System.out.println(getModel());
		System.out.println(getCargoCapacity());
		System.out.println(getYear());
	}

	void loadCargo() {
		System.out.println("Cargo Loaded Successfully");
	}

	void unloadCargo() {
		System.out.println("Cargo Unloaded Successfully");

	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

}
