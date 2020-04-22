package com.cpa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpa.model.OverviewData;
import com.cpa.model.SensorDeatils;
import com.cpa.service.AWBService;

@RestController
public class AWBController {
 
	private AWBService awbSevice;
	private static final Logger LOG = LoggerFactory.getLogger(AWBController.class);
	
	@GetMapping(path = "/overview")
	public ResponseEntity<OverviewData> getOverviewDetails(@RequestParam("awbnumber") String awbnumber) {
		
		return new ResponseEntity<OverviewData>(awbSevice.getOverviewAndSegmentData(awbnumber), HttpStatus.OK);
	}
	
	@GetMapping(path = "/sensorlog")
	public SensorDeatils getSensorDetails(@RequestParam("awbnumber") String awbNumber) {
		
		return awbSevice.getSensorDetails(awbNumber);
		
	}
	
}
