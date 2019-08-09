package com.shirley.hsdc_test;

public class MathGame {
	public String caculate_1(int i){
        if(i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        }else if(i % 3 == 0){
            return "Fizz";
        }else if(i % 5 == 0){
            return "Buzz";
        }else{
        	return "" + i;
        }

	}
	
	public String caculate_2(int i){
		String s = String.valueOf(i);
		
        if((i % 3 == 0 && i % 5 == 0) || (s.contains("3") && s.contains("5")) ){
            return "FizzBuzz";
        }else if(i % 3 == 0 || s.contains("3")){
            return "Fizz";
        }else if(i % 5 == 0 || s.contains("5")){
            return "Buzz";
        }else{
        	return "" + i;
        }

	}
	
	public void output1(){
		for (int i = 1; i <= 100; i++) {
				System.out.println(caculate_1(i));
		}
	}
	
	public void output2(){
		for (int i = 1; i <= 100; i++) {
				System.out.println(caculate_2(i));
		}
	}
	
}
