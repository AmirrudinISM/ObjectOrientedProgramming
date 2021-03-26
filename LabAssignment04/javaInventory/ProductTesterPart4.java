package javaInventory;

import java.util.Scanner;

class ProductTesterPart4{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int numberOfProducts = -1;
		int inpID = 0;
		String inpName = "";
		int inpStockCount = 0;
		double inpPrice = 0;
		//paper input
		String inpType = "";
		int inpThickness = 0;

		//array of products
		ProductPart4 [] productArray;

		while (numberOfProducts < 0){
			//prompt user for number of products
			System.out.print("Enter number of products to add: ");
			numberOfProducts = inp.nextInt();
			//reject negative value
			if (numberOfProducts < 0){
				System.out.println("Please enter an amount greater than 0");
			}
			//handle value 0 by exiting the system
			else if (numberOfProducts == 0){
				System.out.print("Exiting program...");
				System.out.print("Thank you.");
			}

			else{

				productArray = new ProductPart4[numberOfProducts];
				//loop for value input from user
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

					//creates generic product when index is odd
					if (i % 2 == 1){
						productArray[i] = new ProductPart4(inpID, inpName, inpStockCount, inpPrice);
					}
					//creates paper when index is even
					else{
						inp.nextLine();

						System.out.print("["+i+"]"+"Enter paper type:  ");
						inpType = inp.nextLine();

						System.out.print("["+i+"]"+"Enter paper thickness:   ");
						inpThickness = inp.nextInt();

						productArray[i] = new Paper(inpID, inpName, inpStockCount, inpPrice, inpType, inpThickness);
					}

					System.out.println("=======================");
				}

				//display information
				System.out.println("====INVENTORY====");
				
				for (int i = 0; i < numberOfProducts; i++){
					System.out.println(productArray[i]);
					System.out.println("-------------------");	
				}
			}
		}
	}
}