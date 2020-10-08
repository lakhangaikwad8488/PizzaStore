package com.java.yaksha;

import java.util.Scanner;

import com.java.entity.FoodProduct;
import com.java.entity.Order;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int itemno;
		String bank;
		
		System.out.println("Enter the number of Pizza");
		itemno=sc.nextInt();
		System.out.println("Enter the Pizza details");
		
		
		Order o=new Order();
		
		for(int i=0;i<itemno;i++)
		{
			FoodProduct fd=new FoodProduct();
		System.out.println("Enter the Pizza id");
		fd.setFoodId(sc.nextInt());
		System.out.println("Enter the Pizza name");
		fd.setFoodName(sc.next());
		System.out.println("Enter the cost per unit");
		fd.setCostPerUnit(sc.nextDouble());
		System.out.println("Enter the quantity");
		fd.setQuantity(sc.nextInt());
		o.addToCart(fd);
		
		}
		
		
		System.out.println("Enter the bank name to avail offer[HDFC/SBI/ICICI/CUB/OTHERS]");
		bank=sc.next();
		o.findDiscount(bank);
		
		
		System.out.println("Calculated Bill Amount:"+o.calculateTotalBill());
		
		
		
	}
}
