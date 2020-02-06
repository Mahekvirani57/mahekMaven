package com.mahek.mahek;

import com.mahek.mahek.sweet;

public class Chocolate extends sweet{
    Chocolate(String name, int weight, int cost) {
		super(name, weight, cost);
		// TODO Auto-generated constructor stub
	}

	protected String getType(){
  	  return "chocolate";
    }
}