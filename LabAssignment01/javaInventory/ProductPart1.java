package javaInventory;

import java.util.Scanner;

public class ProductPart1{
	private int itemNumber;
	private String productName;
	private int stockCount;
	private double pricePerUnit;

	public ProductPart1(){
		itemNumber = 0;
		productName = null;
		stockCount = 0;
		pricePerUnit = 0;
	}

	//overload default constructor
	public ProductPart1(int itemNumber, String productName, int stockCount, double pricePerUnit){
		this.itemNumber = itemNumber;
		this.productName = productName;
		this.stockCount = stockCount;
		this.pricePerUnit = pricePerUnit;
	}

	//toString override
	public String toString(){
		return "ITEM NUMBER = " + this.itemNumber + "\n" +
		"PRODUCT NAME = " + this.productName + "\n" +
		"STOCK COUNT = " + this.stockCount + "\n" +
		"PRICE PER UNIT = " + this.pricePerUnit + "\n";
	}

	//Item number
	public void setItemNumber(int itemNumber){
		this.itemNumber = itemNumber;
	}

	public int getItemNumber(){
		return this.itemNumber;
	}

	// product name
	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return this.productName;
	}

	//stock count
	public void setStockCount(int stockCount){
		this.stockCount = stockCount;
	}

	public int getStockCount(){
		return this.stockCount;
	}


	//unit price
	public void setPricePerUnit(double pricePerUnit){
		this.pricePerUnit = pricePerUnit;
	}

	public double getPricePerUnit(){
		return this.pricePerUnit;
	}
}