package com.functionalInterface;

import java.util.*;

@FunctionalInterface
public interface AccountNames {
	
	//List<String> accountDt(); //supplier
	
	//List<Integer> accountDt(int i); //predicate
	
	void accountDt(String name); //consumer
	

}
