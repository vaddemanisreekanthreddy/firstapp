package org.mphasis.encapsulation;

class MotorCycle extends Vehicle {
	double engineCapacity;

	@Override
	void displayDetails() {
		System.out.println(getManufacturer());
		System.out.println(getModel());
		System.out.println(getEngineCapacity());
		System.out.println(getYear());
	}

	void startEngine() {
		System.out.println("Engine Started Successfully");
	}

	void stopEngine() {
		System.out.println("Engine Stopped Successfully");

	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

}
