package com.hr.demo.main;

import java.util.Arrays;
import java.util.List;

import com.hr.demo.pesonnel.ServiceLicenseAgreement;
import com.hr.demo.pesonnel.SubContractor;

public class ApproveSLAMain {
	public static void main(String[] args) {

		int minTimeOffPercent = 98;
		int maxResolutionDays = 2;
		ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(minTimeOffPercent, maxResolutionDays);

		SubContractor subcontractor1 = new SubContractor("Adya Shukla", "adya-shuks@abc.com", 3000, 15);
		SubContractor subcontractor2 = new SubContractor("Anubha Shukla", "anubha-shukla@def.com", 3000, 15);
		List<SubContractor> collabs = Arrays.asList(subcontractor1, subcontractor2);

		for (SubContractor s : collabs) {
			s.approveSLA(companySla);
		}
	}
}
