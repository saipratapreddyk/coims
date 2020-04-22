package com.cpa.model;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class SegementDetails implements Serializable {

	private static final long serialVersionUID = -1659202486016025918L;
	private String location;
	private String timeStamp;
	private boolean inCurrentLocation;

	@DynamoDBAttribute
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@DynamoDBAttribute
	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@DynamoDBAttribute
	public boolean isInCurrentLocation() {
		return inCurrentLocation;
	}

	public void setInCurrentLocation(boolean inCurrentLocation) {
		this.inCurrentLocation = inCurrentLocation;
	}

}
