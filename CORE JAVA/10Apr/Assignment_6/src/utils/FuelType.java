package utils;

public enum FuelType {
	PETROL, DIESEL, CNG, EV;
	@Override
	public String toString() {
		return name().toUpperCase();
	}
}
