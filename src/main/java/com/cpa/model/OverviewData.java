package com.cpa.model;

import java.io.Serializable;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
@DynamoDBTable(tableName="Overview")
public class OverviewData implements Serializable {

	private static final long serialVersionUID = -2905222732878308734L;

	private String noOfPieces;
	private String weight;
	private String shipper;
	private String consgnee;
	private String agent;
	private String origin;
	private ServiceLevelAgreement temperature;
	private ServiceLevelAgreement humidity;
	private List<CardDetails> cardsList;
	@DynamoDBAttribute
	public String getNoOfPieces() {
		return noOfPieces;
	}

	public void setNoOfPieces(final String noOfPieces) {
		this.noOfPieces = noOfPieces;
	}
	@DynamoDBAttribute
	public String getWeight() {
		return weight;
	}

	public void setWeight(final String weight) {
		this.weight = weight;
	}
	@DynamoDBAttribute
	public String getShipper() {
		return shipper;
	}

	public void setShipper(final String shipper) {
		this.shipper = shipper;
	}
	@DynamoDBAttribute
	public String getConsgnee() {
		return consgnee;
	}

	public void setConsgnee(final String consgnee) {
		this.consgnee = consgnee;
	}
	@DynamoDBAttribute
	public String getAgent() {
		return agent;
	}

	public void setAgent(final String agent) {
		this.agent = agent;
	}
	@DynamoDBAttribute
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(final String origin) {
		this.origin = origin;
	}
	@DynamoDBAttribute
	public ServiceLevelAgreement getTemperature() {
		return temperature;
	}

	public void setTemperature(final ServiceLevelAgreement temperature) {
		this.temperature = temperature;
	}
	@DynamoDBAttribute
	public ServiceLevelAgreement getHumidity() {
		return humidity;
	}

	public void setHumidity(final ServiceLevelAgreement humidity) {
		this.humidity = humidity;
	}
	@DynamoDBAttribute
	public List<CardDetails> getCardsList() {
		return cardsList;
	}

	public void setCardsList(final List<CardDetails> cardsList) {
		this.cardsList = cardsList;
	}

}
