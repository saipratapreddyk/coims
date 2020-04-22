package com.cpa.model;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
@DynamoDBDocument
public class ServiceLevelAgreement implements Serializable {
	
	private static final long serialVersionUID = 3283629901229422395L;
	private String agreement;
	private String systemWarning;

	@DynamoDBAttribute
	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(final String agreement) {
		this.agreement = agreement;
	}
	@DynamoDBAttribute
	public String getSystemWarning() {
		return systemWarning;
	}

	public void setSystemWarning(final String systemWarning) {
		this.systemWarning = systemWarning;
	}

}
