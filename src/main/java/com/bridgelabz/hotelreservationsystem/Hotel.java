package com.bridgelabz.hotelreservationsystem;

public class Hotel {
	private String hotelName;
	private int rateOfRegularCustomer;

	public Hotel(String hotelName, int rateOfRegularCustomer) {
		super();
		this.hotelName = hotelName;
		this.rateOfRegularCustomer = rateOfRegularCustomer;
	}

	public Hotel() {
		super();
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRateOfRegularCustomer() {
		return rateOfRegularCustomer;
	}

	public void setRateOfRegularCustomer(int rateOfRegularCustomer) {
		this.rateOfRegularCustomer = rateOfRegularCustomer;
	}

	@Override
	public String toString() {
		return "Hotal [hotelName=" + hotelName + ", rateOfRegularCustomer=" + rateOfRegularCustomer + "]";
	}
	
	
}
