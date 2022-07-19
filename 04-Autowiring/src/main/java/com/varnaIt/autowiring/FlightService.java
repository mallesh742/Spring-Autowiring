package com.varnaIt.autowiring;

public class FlightService {
	
	FlightDao fltDao;

	public void setFltDao(FlightDao fltDao) {
		this.fltDao = fltDao;
	}

}
