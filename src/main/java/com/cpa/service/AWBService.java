package com.cpa.service;

import com.cpa.model.OverviewData;
import com.cpa.model.SensorDeatils;

public interface AWBService {

	OverviewData getOverviewAndSegmentData(final String awbNumber);

	SensorDeatils getSensorDetails(final String awbNumber);
}
