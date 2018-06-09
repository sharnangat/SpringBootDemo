package com.output;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.input.A;

@Component
public class SumService {


	
	
@Autowired	
private A a;
	
	 
public int  calculateSum(int x,int y){
	
	
	   
       
	
		return x+y;
	
	
} 	
	
	
}
