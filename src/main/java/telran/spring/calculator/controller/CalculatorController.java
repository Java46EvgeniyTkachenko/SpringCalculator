package telran.spring.calculator.controller;

import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telran.spring.calculator.dto.*;
import telran.spring.calculator.service.*;

@RestController
@RequestMapping("calculate")
public class CalculatorController {
	Map<String, Operation> calculationProcess;
	public CalculatorController(Map<String, Operation> calculationProcess) {
		
		this.calculationProcess = calculationProcess;
	}
	@PostMapping
	String sendMessage(@RequestBody OperationData data) {
		Operation operation  = calculationProcess.get(data.operationName);
		return operation != null ? operation.execute(data) : "Wrong type " + data.operationName;
	}
	@GetMapping
	Set<String> getTypes() {
		return calculationProcess.keySet();
	}
}
