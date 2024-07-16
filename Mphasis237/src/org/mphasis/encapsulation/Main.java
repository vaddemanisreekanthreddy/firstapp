package org.mphasis.encapsulation;

public class Main {
	public static void main(String[] args) {

//	 For Car
         System.out.println("--------------------CAR------------------------");
         Car c=new Car();
         c.setSeatingCapacity(4);
         c.setModel("Mercedes-Benz C-Class");
         c.setManufacturer("Mercedes-Benz");
         c.setYear(2020);
         c.displayDetails();
         c.accelerate();
         c.brake();
         
//     For MotorCycle
         System.out.println("---------------------MOTOR CYCLE-----------------------");
         MotorCycle mc=new MotorCycle();
         mc.setEngineCapacity(2);
         mc.setModel("Harley-Davidson Street Glide");
         mc.setManufacturer("Harley-Davidson");
         mc.setYear(2022);
         mc.displayDetails();
         mc.startEngine();
         mc.stopEngine();

//     For Truck
         System.out.println("----------------------TRUCK----------------------");
         Truck tr=new Truck();
         tr.setCargoCapacity(50);
         tr.setModel("Ford F-150");
         tr.setManufacturer("Ford");
         tr.setYear(2023);
         tr.displayDetails();
         tr.loadCargo();
         tr.unloadCargo();
         
         
	}
}
