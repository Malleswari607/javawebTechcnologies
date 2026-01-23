package com.ibm.enums.types;

public enum Apples {
		RED_DEL(100),
		GOLDEN_DEL(300),
		FUJI(60),
		GREEN(250);
		private int price;
	    private Apples(int price) {
	    	this.price=price;
	    }
	    public int getprice() {
	    	return price;
	    }
}
