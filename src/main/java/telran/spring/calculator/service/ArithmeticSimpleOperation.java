package telran.spring.calculator.service;

import org.springframework.stereotype.Service;

import telran.spring.calculator.dto.ArithmeticOperationData;
import telran.spring.calculator.dto.OperationData;

@Service("arithmetic")
public class ArithmeticSimpleOperation implements Operation {

	@Override
	public String execute(OperationData data) {
		double res = 0, op1, op2;
		ArithmeticOperationData arithmeticOperationData = (ArithmeticOperationData) data;
		op1 = arithmeticOperationData.operand1;
		op2 = arithmeticOperationData.operand2;
		switch (arithmeticOperationData.additionalData) {
		case "+":
			res = op1 + op2;
			break;
		case "-":
			res = op1 - op2;
			break;
		case "/":
			res = op1 / op2;
			break;
		case "*":
			res = op1 * op2;
			break;
		default:
			throw new RuntimeException("Unknown arithmetic operation!");
		}
		// res =(arithmeticOperationData.operand1 + arithmeticOperationData.operand2);
		return String.format("Result operation is %s\n", String.valueOf(res));
	}

}
