package javaInventory;

class Paper extends ProductPart4{
	//two new variables
	private String type;
	private int thickness;

	//default Paper constructor
	public Paper(){
		super();
		this.type = null;
		this.thickness = 0;
	}

	//overloaded Paper constructor
	public Paper(int itemNumber, String productName, int stockCount, double pricePerUnit, String type, int thickness){
		super(itemNumber, productName, stockCount, pricePerUnit);
		this.type = type;
		this.thickness = thickness;
	}

	//overridden toString method
	public String toString(){
		return 
		"ITEM NUMBER           = " + getItemNumber() + "\n" +
		"PRODUCT NAME          = " + getProductName() + "\n" +
		"STOCK COUNT           = " + getStockCount() + "\n" +
		"PRICE PER UNIT        = " + getPricePerUnit() + "\n" +
		"PAPER TYPE            = " + this.type + "\n" +
		"PAPER THICKNESS (GSM) = " + this.thickness + "\n" +
		"INVENTORY VALUE       = " + super.inventoryValue() + "\n" +
		"INVENTORY VALUE + 5%  = " + inventoryValue() + "\n";
	}

	//inventory value with 5% restock fee 
	public double inventoryValue(){
		double totalVal = getPricePerUnit() * getStockCount();
		double restockValue = 0.05 * totalVal;
		double finalVal = totalVal + restockValue;
		return finalVal;
	}
}