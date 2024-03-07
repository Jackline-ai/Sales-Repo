package com.salesreport.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
	public static String getCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_sss");
        Date currentDate = new Date();
        return "Sales_Report"+dateFormat.format(currentDate)+".pdf";
    }

}
