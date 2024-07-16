package org.mphasis.encapsulation;

class Car extends Vehicle {
	int seatingCapacity;

	@Override
	void displayDetails() {
		System.out.println(getManufacturer());
		System.out.println(getModel());
		System.out.println(getSeatingCapacity());
		System.out.println(getYear());
	}

	void accelerate() {
        System.out.println("Accelerated");
	}

	void brake() {
       System.out.println("Break Done");
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

}
