package com.salesreport.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesreport.service.SalesReportService;
import com.salesreport.model.ApiResponse;
import com.salesreport.model.SalesReport;

import net.sf.jasperreports.engine.JRException;
@RestController
@RequestMapping("/api")
public class SalesReportController {
	@Autowired
	SalesReportService salesReportService;
	
	@PostMapping("/sales-report")
	public ResponseEntity<ApiResponse> saveEtimsData(@RequestBody SalesReport salesReport) {
		ApiResponse response = new ApiResponse("Invoice printed successfully", 200);
		
		try {
			salesReportService.exportReport("pdf", salesReport);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok(response);
	}
}
