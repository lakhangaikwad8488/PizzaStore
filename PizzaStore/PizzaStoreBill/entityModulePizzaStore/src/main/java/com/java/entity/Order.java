package com.java.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private double discountPercentage;
	private List<FoodProduct> foodList=new ArrayList<FoodProduct>();

	
	
	
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public List<FoodProduct> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<FoodProduct> foodList) {
		this.foodList = foodList;
	}
	
	
	public boolean findDiscount(String bankName)
	{
		if(bankName.equals("HDFC")) {
			discountPercentage=15.0;
		}
	else if(bankName.equals("ICICI")) {
			discountPercentage=25.0;
		}
	else if(bankName.equals("CUB")) {
		discountPercentage=30.0;
	}
	else if(bankName.equals("SBI")) {
		discountPercentage=50.0;
	}
	else if(bankName.equals("OTHERS")) {
		discountPercentage=0.0;
	}
		setDiscountPercentage(discountPercentage);
		return true;
			
	}
	
	
	public boolean addToCart(FoodProduct foodProductObject)
	{
	List<FoodProduct> f=getFoodList();
	f.add(foodProductObject);	
	setFoodList(f);
	return true;
		
	}
	
	
	public double calculateTotalBill()
	{
		double bill = 0;
		List<FoodProduct> f=getFoodList();
		for(int i=0;i<f.size();i++)
		{
		//	System.out.println(f.get(i).getCostPerUnit());
		//	System.out.println(f.get(i).getQuantity());
		bill+=f.get(i).getQuantity()*f.get(i).getCostPerUnit()*1.0;
			
		}
	//	System.out.println(bill);
	//	System.out.println(dis);
		bill=bill-((bill*getDiscountPercentage())/100);
		return bill;
		
		
	}
}
