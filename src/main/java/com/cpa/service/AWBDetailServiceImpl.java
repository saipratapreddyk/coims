package com.cpa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.cpa.model.OverviewData;
import com.cpa.model.SensorDeatils;

public class AWBDetailServiceImpl implements AWBService {
	
	private static final Logger LOG = LoggerFactory.getLogger(AWBDetailServiceImpl.class);
	private DynamoDBMapper mapper;

	@Override
	public OverviewData getOverviewAndSegmentData(final String awbNumber) {
		
		return mapper.load(OverviewData.class, awbNumber);
	}

	@Override
	public SensorDeatils getSensorDetails(String awbNumber) {
		return mapper.load(SensorDeatils.class, awbNumber);
		
	}
}
