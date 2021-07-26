package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationMain {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Hotel> hotelList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation system");
		addHotal();
		// System.out.println(hotelList);
	}

	// method for add hotel
	public static void addHotal() {

		System.out.println("Enter hotel name");
		String hotelName = input.nextLine();
		System.out.println("Enter hotal rate of regular customer ");
		int rateOfRegularCustomer = input.nextInt();
		Hotel hotel = new Hotel(hotelName, rateOfRegularCustomer);
		System.out.println(hotel);
		hotelList.add(hotel);
	}
}
