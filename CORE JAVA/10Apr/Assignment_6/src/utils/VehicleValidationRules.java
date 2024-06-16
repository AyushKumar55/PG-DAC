package utils;

import java.time.LocalDate;

import custom_exceptions.*;

/*
 * Will contain different method for validation rules
 */
public class VehicleValidationRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
	}

	public static void validateFuelType(String fuelType) throws VehicleException {
		for(FuelType f : FuelType.values()) {
			if(f.name().equals(fuelType)) {
				System.out.println("This is a valid fuel type");
				return;
			}
		}
		throw new VehicleException("This is not a valid fuel type");
	}
	
	public static void validateDL(LocalDate date) throws VehicleException {
		if(date.isBefore(LocalDate.now())){
			throw new VehicleException("Your DL has EXPIRED !!!");
		}
		System.out.println("DL IS VALID");
	}

	public static void validateSpeed(int speed) 
			throws VehicleException {
		if (speed < MIN_SPEED)
			throw new VehicleException("Speed too low !!!!");
		if (speed > MAX_SPEED)
			throw new VehicleException("Speed too high , FATAL !!!!");
		System.out.println("speed within range...");
	}
}

