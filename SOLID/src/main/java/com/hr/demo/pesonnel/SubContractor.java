package com.hr.demo.pesonnel;

public class SubContractor {

	private String email;
	private String name;
	private final int monthlyInc;
	private int nbHoursPerWeek;

	
	public SubContractor(String email, String name, int monthlyInc, int nbHoursPerWeek) {
		this.email = email;
		this.name = name;
		this.monthlyInc = monthlyInc;
		this.nbHoursPerWeek = nbHoursPerWeek;
	}

	public void requestTimeOff(int nbDays, Employee manager) {
		throw new RuntimeException("Not Implemented");
	}
	
	public boolean approveSLA(ServiceLicenseAgreement sla) {
		boolean res = false;
		if(sla.getMinUptimePercent() >= 98 ) {
			res = true;
		}
		System.out.println("SLA Approval for " + this.name + ":" + res);
		
		return res;
	}
}
