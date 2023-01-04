package telran.spring.calculator.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

import telran.spring.calculator.dto.DatesOperationData;
import telran.spring.calculator.dto.OperationData;

@Service("betweenDays")
public class DatesBetweenOperation implements Operation {

	@Override
	public String execute(OperationData data) {
		DatesOperationData datesOperationData = (DatesOperationData) data;

		LocalDate dateFrom = LocalDate.parse(datesOperationData.dateFrom);
		LocalDate dateTo = LocalDate.parse(datesOperationData.dateTo);
		return String.format("%d days from %s to %s\n", ChronoUnit.DAYS.between(dateFrom, dateTo), dateFrom.toString(),
				dateTo.toString());
	}

}
