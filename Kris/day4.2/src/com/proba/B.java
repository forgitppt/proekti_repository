package com.proba;

public class B extends A {

	@Override
	public int kvadrat(int i) {
		int odA = super.kvadrat(i);
		if(odA % 2 == 0){
			return odA;
		}else{
			return 2*odA;
		}
	}
}
