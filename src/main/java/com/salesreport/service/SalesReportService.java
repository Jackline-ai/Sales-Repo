package com.salesreport.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.salesreport.model.SalesReport;
import  com.salesreport.utils.Utilities;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
@Service
public class  SalesReportService{
    	
      
	public String exportReport(String reportFormat,SalesReport salesReport) throws FileNotFoundException, JRException {

		String path = "/home/jackline/Desktop/Reports/";

		// Load the report template

		List<SalesReport> salesReports = new ArrayList<SalesReport>();
		salesReports.add(salesReport);

		File file = ResourceUtils.getFile("classpath:Sales_Report.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(salesReports);
		Map<String, Object> parameters = new HashMap<>();
		
		JRBeanCollectionDataSource dataSourceSalesHeader = new JRBeanCollectionDataSource(salesReports);
		parameters.put("SALES_HEADER_DATASOURCE", dataSourceSalesHeader);
		
		JRBeanCollectionDataSource dataSourceSalesItems = new JRBeanCollectionDataSource(salesReports);
		parameters.put("SALES_ITEMS_DATASOURCE", dataSourceSalesItems);
		
		JRBeanCollectionDataSource dataSourceSalesTotals = new JRBeanCollectionDataSource(salesReports);
		parameters.put("SALES_TOTALS_DATASOURCE", dataSourceSalesTotals);
		
		parameters.put("createdBy", "Jackline");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		if (reportFormat.equalsIgnoreCase("xml")) {
			return JasperExportManager.exportReportToXml(jasperPrint);

		}

		else if (reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint, path + Utilities.getCurrentDateTime());

		}

		return "report generated in path: " + path;
	}


}


