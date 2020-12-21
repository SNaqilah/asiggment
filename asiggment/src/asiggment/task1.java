package asiggment;

import java.util.Scanner;




public class task1 {

	public static void main(String[] args) {
		//question 1
Scanner input = new Scanner (System.in);
System.out.println("Asiggment");
		printNameCust();
		printCustGender();
		printIC();
		printCustAddress();	
		printProduct();
		printItemsBuy();
		
	}
	public static void printNameCust() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Customer Name: ");
		String name=input.next();
		System.out.println("Your customer name is " + name);
		System.out.println();
	}
	public static void printCustGender() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Customer Gender: ");
		char gender=input.next().charAt(0);
		System.out.println("Your gender is " + gender);
		System.out.println();
}
	public static void printIC() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Customer Age: ");
		int age=input.nextInt();
		System.out.println("Your age is " + age);
		System.out.println();

}
	
	public static void printCustAddress() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Customer Address: "               );
		String address=input.nextLine();
		System.out.println("Your address is " + address);
		System.out.println();
	}
	
	public static void printProduct() {
		System.out.println("Product items!");
		System.out.println("Backpack [Citrus $170]");
		System.out.println("Backpack [Gourmand $122]");
		System.out.println("Backpack [Floral $385]");
		System.out.println("Backpack [Fruity $136]");
		System.out.println("Backpack [Spicy $148]");
		System.out.println("Backpack [Aquatic $126]");
	}
    public static void printItemsBuy() {
        Scanner in = new Scanner(System.in); 
     
        System.out.print("Price of Product $: ");
        int num1 = in.nextInt();
  
        System.out.print("Quantity: ");
        int num2 = in.nextInt();
   
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
}
    
 


}


