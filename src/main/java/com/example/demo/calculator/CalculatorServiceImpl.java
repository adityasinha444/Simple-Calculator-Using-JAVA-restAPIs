package com.example.demo.calculator;

import org.springframework.stereotype.Service;

@Service  
public class CalculatorServiceImpl implements CalculatorService {  
	@Override
	public double calculate(double a, double b, String operation) {
		
		double result;
		
		switch(operation.toLowerCase()) {
			case "add":
				result = a + b;
				break;
				
			case "sub":
				result = a - b;
				break;
				
			case "mul":
                result = a * b;
                break;
                
            case "div":
                if(b != 0) {
                    result = a / b;
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                break;
                
            default:
                throw new IllegalArgumentException("Invalid Operation. Please use add / sub / mul / div");
				
		}
		
		return result;
	}
}


