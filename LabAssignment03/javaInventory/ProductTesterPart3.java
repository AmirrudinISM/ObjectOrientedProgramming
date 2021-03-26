package javaInventory;

import java.util.Scanner;

class ProductTesterPart3{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int numberOfProducts = -1;
		int inpID = 0;
		String inpName = "";
		int inpStockCount = 0;
		double inpPrice = 0;

		//array of products
		ProductPart3 [] productArray;

		while (numberOfProducts < 0){
			//prompt user for number of products
			System.out.print("Enter number of products to add: ");
			numberOfProducts = inp.nextInt();
			//reject negative value
			if (numberOfProducts < 0){
				System.out.println("Please enter an amount greater than 0");
			}
			//handle the value 0 by exiting the system
			else if (numberOfProducts == 0){
				System.out.print("Exiting program...");
				System.out.print("Thank you.");
			}

			else{
				productArray = new ProductPart3[numberOfProducts];
				//loop for product input
				for (int i = 0; i < numberOfProducts; i++){
					System.out.print("["+i+"]"+"Enter Product ID:    ");
					inpID = inp.nextInt();

					inp.nextLine();

					System.out.print("["+i+"]"+"Enter Product Name:  ");
					inpName = inp.nextLine();

					System.out.print("["+i+"]"+"Enter stock count:   ");
					inpStockCount = inp.nextInt();

					System.out.print("["+i+"]"+"Enter Product Price: ");
					inpPrice = inp.nextDouble();

					productArray[i] = new ProductPart3(inpID, inpName, inpStockCount, inpPrice);

					System.out.println("=======================");
				}

				System.out.println("====INVENTORY====");
				//display product information
				for (int i = 0; i < numberOfProducts; i++){
					System.out.println(productArray[i]);
					System.out.println("-------------------");	
				}
			}
		}
	}
}