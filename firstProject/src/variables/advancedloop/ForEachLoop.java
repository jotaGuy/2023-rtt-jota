package advancedloop;

import java.util.List;
import java.util.stream.Collectors;

import coffeeshop.Product;

public class ForEachLoop {

	public void forLoop (products) {
			List<Product> streamCheap = products.stream().filter(product -> {
				System.out.println("Product was added");
				return product.getPrice() < 6.0;
			}).collect(Collectors.toList());	
			
			System.out.println(streamCheap.toString());
			
			System.out.println("===========");
		}
}
