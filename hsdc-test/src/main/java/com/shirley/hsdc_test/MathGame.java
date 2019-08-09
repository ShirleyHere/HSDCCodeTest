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
		String returnS = "";
		
		if(i % 3 == 0 || s.contains("3")){
			returnS += "Fizz";
		}
		
		if(i % 5 == 0 || s.contains("5")){
			returnS += "Buzz";
		}
		
		if("".equals(returnS)){
			return s;
		}else{
			return returnS;
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
