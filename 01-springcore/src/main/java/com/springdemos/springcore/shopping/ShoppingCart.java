package com.springdemos.springcore.shopping;

public class ShoppingCart {
	private String customername;
	Item item;

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [customername=" + customername + ", item=" + item + "]";
	}

}