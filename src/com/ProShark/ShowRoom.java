package com.ProShark;

import java.util.List;

public class ShowRoom {
	
	Bike bike;
	private List<Bike> bikelistBikes;
	
	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public void setBikelistBikes(List<Bike> bikelistBikes) {
		this.bikelistBikes = bikelistBikes;
	}
	
	public void getbikelistBikes() {
		System.out.println(bikelistBikes);
	}

		




}
