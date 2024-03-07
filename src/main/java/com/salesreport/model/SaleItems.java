package com.salesreport.model;

public class SaleItems {
private Long salesId;
private String date;
private String productName;
private double quantity;
private String salesDetails;
private double unitPrice;
private double discount;
private double amount;
public Long getSalesId() {
	return salesId;
}
public void setSalesId(Long salesId) {
	this.salesId = salesId;
}
public String getSalesDetails() {
	return salesDetails;
}
public void setSalesDetails(String salesDetails) {
	this.salesDetails = salesDetails;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getQuantity() {
	return quantity;
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
}
