package com.cpa.model;

public class SensorData {

	private String time;
	private String temperature;
	private String humidity;
	private String light;
	private String vibration;
	private String battery;
	private String location;
	private String status;
	private String sensorId;

	public String getTime() {
		return time;
	}

	public void setTime(final String time) {
		this.time = time;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(final String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(final String humidity) {
		this.humidity = humidity;
	}

	public String getLight() {
		return light;
	}

	public void setLight(final String light) {
		this.light = light;
	}

	public String getVibration() {
		return vibration;
	}

	public void setVibration(final String vibration) {
		this.vibration = vibration;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(final String battery) {
		this.battery = battery;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(final String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(final String sensorId) {
		this.sensorId = sensorId;
	}

}
