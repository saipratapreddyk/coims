package com.cpa.model;

import java.util.List;

public class SensorDeatils {
	private String currentLocation;
	private List<SensorData> sensorData;

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public List<SensorData> getSensorData() {
		return sensorData;
	}

	public void setSensorData(List<SensorData> sensorData) {
		this.sensorData = sensorData;
	}

}
