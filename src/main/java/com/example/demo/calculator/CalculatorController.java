package com.example.demo.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;
    
	@GetMapping
	public String calculate(
			@RequestParam double a,
			@RequestParam double b,
			@RequestParam String operation) {
		
			try {
	            double result = calculatorService.calculate(a, b, operation);
	            return "Result: " + result;
	        } catch (IllegalArgumentException e) {
	            return e.getMessage();
	        }
	}
}
