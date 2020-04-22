package com.cpa.service;

import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.cpa.model.OverviewData;

@Repository
public class AWBDyanamoRepo {

	private DynamoDBMapper mapper;

	public OverviewData getOverviewAndSegmentData(final String awbNumber) {

		return mapper.load(OverviewData.class, awbNumber);
	}

}
