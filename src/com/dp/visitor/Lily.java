package com.dp.visitor;

public class Lily implements Flower {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visite(this);
	}

}
