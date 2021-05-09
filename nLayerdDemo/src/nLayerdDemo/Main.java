package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.jLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.AbcProductDao;
import nLayerdDemo.entities.concretes.Product;
import nLayerdDemo.jLogger.jLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile çözülecek 
		ProductService productService = new ProductManager(new AbcProductDao(),
				new jLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	

	}

}
