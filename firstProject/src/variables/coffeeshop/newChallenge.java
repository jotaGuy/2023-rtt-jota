package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import advancedloop.ForEachLoop;

public class newChallenge implements ForEachLoop{

	public static List<Product> products = new ArrayList<>();
	List<Product> order = new ArrayList<>();
	double subTotal = 0;
	float salesTax = 0.04f;
	String total = "";
	private static final DecimalFormat df = new DecimalFormat("0.00");

	Scanner input = new Scanner(System.in);

	public void setupProduct() {

		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(6.77);
		products.add(cookie);

		Product sandwhich = new Product();
		sandwhich.setName("Bacon, Cheese & Hame");
		sandwhich.setPrice(8.50);
		products.add(sandwhich);

	}

	private void printProduct(Product product) {
		System.out.println("Product Name: " + product.getName() + " \tPrice: " + product.getPrice());
	}

	public void printAllProducts() {
		for (Product product : products) {
			printProduct(product);
		}
	}

	public void printOrderList() {
		for (Product product : order) {
			printProduct(product);
		}
	}

	public void userSelectProduct() {
		System.out.println("Enter product name to order: ");
		String orderSelection = input.nextLine();

		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);
				System.out.println("Added " + product.getName() + " to your order.");
			}
		}
	}

	public int userProductMenu() {
		System.out.println("\n1) Print the menu items and prices");
		System.out.println("2) Add an item to your order");
		System.out.println("3) Print the items in your order");
		System.out.println("4) Checkout");
		System.out.println("\nWhat do you want to do: ");
		int select = input.nextInt();
		input.nextLine();

		return select;
	}

	public void getOrderTotal() {
		for (Product product : order) {
			subTotal += product.getPrice();
		}
		double total = (subTotal + (subTotal * salesTax));
		System.out.println("Your order total is: " + df.format(total));
	}

	public void totalSales() {
		// TODO Auto-generated method stub
		double coffee = 5.43d;
		double tea = 4.33d;
		double cookie = 6.7d;

		double subTotal = 0;
		double salesTax = 0;

		// 3 items of the first product
		subTotal = coffee * 3;

		// 4 items of second product
		subTotal = subTotal + (tea * 4);

		// 2 items of third product
		subTotal = subTotal + (cookie * 2);

		DecimalFormat df = new DecimalFormat("#,###.00");

		// System.out.println("subTotal:\t " + df.format(subTotal));

		salesTax = subTotal * 0.09;

		// System.out.println("Sales Tax:\t " + df.format(salesTax));

		// System.out.println("Total:\t\t " + df.format(subTotal + salesTax));
	}

	public static void main(String[] args) {
		newChallenge cf = new newChallenge();
		cf.setupProduct();
		

		while (true) {
			int userSelection = cf.userProductMenu();
			if (userSelection == 1) {
				cf.printAllProducts();
			} else if (userSelection == 2) {
				cf.userSelectProduct();
			} else if (userSelection == 3) {
				cf.printOrderList();
			} else {
				cf.getOrderTotal();
				break;
			}
		}

	}

	@Override
	public void forLoop(products) {
		// TODO Auto-generated method stub
		
	}

}
