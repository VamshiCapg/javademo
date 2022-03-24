package com.capg.collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		TreeSet<Product> ts = new TreeSet<Product>(new PriceComparator());
		
		//TreeSet<Product> ts = new TreeSet<Product>(new BrandNameComparator());
	
	    
	   Product p1 = new Product();
	   p1.setPid(100);
	   p1.setPname("laptop");
	   p1.setBrandName("ASUS");
	   p1.setPrice(55000);
	   
	   Product p2 = new Product();
	   p2.setPid(101);
	   p2.setPname("tv");
	   p2.setBrandName("SOny");
	   p2.setPrice(20000);
	   
	   Product p3 = new Product();
	   p3.setPid(102);
	   p3.setPname("refrigerator");
	   p3.setBrandName("LG");
	   p3.setPrice(40000);
	   
	   
	   Product p4 = new Product();
	   p4.setPid(103);
	   p4.setPname("ac");
	   p4.setBrandName("Daikan");
	   p4.setPrice(45000);
	   
	   Product p5 = new Product();
	   p5.setPid(104);
	   p5.setPname("washingmachine");
	   p5.setBrandName("samsung");
	   p5.setPrice(30000);
	   
	   ts.add(p1);
	   ts.add(p2);
	   ts.add(p3);
	   ts.add(p4);
	   ts.add(p5);
	   
	   System.out.println(ts);
	 	
	    
	}

}

