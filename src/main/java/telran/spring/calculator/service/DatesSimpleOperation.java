package telran.spring.calculator.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import telran.spring.calculator.dto.DateDaysOperationData;
import telran.spring.calculator.dto.OperationData;

@Service("operationDays")
public class DatesSimpleOperation implements Operation {

	@Override
	public String execute(OperationData data) {
		DateDaysOperationData dateDaysOperationData = (DateDaysOperationData) data;	
	
		LocalDate dateFrom = LocalDate.parse(dateDaysOperationData.date);	
		LocalDate dateTo = dateFrom.plusDays(dateDaysOperationData.days);
				
		return String.format("New days is %s\n", dateTo.toString());
	}

}
