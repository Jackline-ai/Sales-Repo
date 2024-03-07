package com.salesreport.model;

import java.util.List;

public class SalesReport {
	private Long id;
	private String tradeName;
	private String address;
	private String city;
	private String clientInfo;
	private String name;
	private String clientAddress;
	private String salesInfo;
	private String email;
	private String tel;
	private String invoiceNo;
	private String date;
	private List<SaleItems>items;
	private double totalCashSales;
	private double totalCreditSales;
	private double totalDiscountAllowed;
	private double totalSales;
	private double netSales;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<SaleItems> getItems() {
		return items;
	}
	public void setItems(List<SaleItems> items) {
		this.items = items;
	}
	public double getTotalCashSales() {
		return totalCashSales;
	}
	public void setTotalCashSales(double totalCashSales) {
		this.totalCashSales = totalCashSales;
	}
	public double getTotalCreditSales() {
		return totalCreditSales;
	}
	public void setTotalCreditSales(double totalCreditSales) {
		this.totalCreditSales = totalCreditSales;
	}
	public double getTotalDiscountAllowed() {
		return totalDiscountAllowed;
	}
	public void setTotalDiscountAllowed(double totalDiscountAllowed) {
		this.totalDiscountAllowed = totalDiscountAllowed;
	}
	public double getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	public double getNetSales() {
		return netSales;
	}
	public void setNetSales(double netSales) {
		this.netSales = netSales;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClientInfo() {
		return clientInfo;
	}
	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getSalesInfo() {
		return salesInfo;
	}
	public void setSalesInfo(String salesInfo) {
		this.salesInfo = salesInfo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
