package javaInventory;

class ProductTesterPart1{
	public static void main(String[] args) {
		//instantiation using default constructors
		ProductPart1 prod1 = new ProductPart1();
		ProductPart1 prod2 = new ProductPart1();
		//using overloaded constructors (ID, name, stock, price)
		ProductPart1 prod3 = new ProductPart1(1, "Pen", 50, 1.2);
		ProductPart1 prod4 = new ProductPart1(2, "Test Pad", 10, 3.5);
		ProductPart1 prod5 = new ProductPart1(3, "Whiteboard Marker", 50, 1.2);
		ProductPart1 prod6 = new ProductPart1(4, "Eraser", 200, 0.8);

		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
		System.out.println(prod4);
		System.out.println(prod5);
		System.out.println(prod6);
	}
}