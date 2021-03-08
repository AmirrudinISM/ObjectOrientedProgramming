package javaInventory;

import java.util.Scanner;

class ProductTesterPart2{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int inpID = 0;
		String inpName = "";
		int inpStockCount = 0;
		double inpPrice = 0;

		//instantiation using default constructors
		ProductPart2 prod1 = new ProductPart2();
		ProductPart2 prod2 = new ProductPart2();
		//using overloaded constructors (ID, name, stock, price)
		ProductPart2 prod3 = new ProductPart2(1111, "Whiteboard Markers", 200, 2.80);
		ProductPart2 prod4 = new ProductPart2(2222, "A4 Paper 500 sheets", 180, 11.50);

		ProductPart2 [] productArray = new ProductPart2[2];

		for (int i = 0; i < 2; i++){
			System.out.print("Enter Product ID:    ");
			inpID = inp.nextInt();

			inp.nextLine();

			System.out.print("Enter Product Name:  ");
			inpName = inp.nextLine();

			System.out.print("Enter stock count:   ");
			inpStockCount = inp.nextInt();

			System.out.print("Enter Product Price: ");
			inpPrice = inp.nextDouble();

			productArray[i] = new ProductPart2(inpID, inpName, inpStockCount, inpPrice);
		}

		System.out.println("====INVENTORY====");
		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
		System.out.println(prod4);
		System.out.println(productArray[0]);
		System.out.println(productArray[1]);
	}
}