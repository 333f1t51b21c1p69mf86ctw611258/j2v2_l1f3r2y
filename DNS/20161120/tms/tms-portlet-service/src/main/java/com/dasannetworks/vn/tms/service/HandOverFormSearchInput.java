package com.dasannetworks.vn.tms.service;

import lombok.Data;

@Data
public class HandOverFormSearchInput extends BaseServiceInput {

	private String customerCode;
	private String contactPoint;
	private String email;
	private String location;
	private String personInCharge;
	private String handOverFormNumber;
	private String assignDate;
	private String estimatedReturnDate;

	@Override
	public void advanceSearch(boolean advancedSearch, String keywords) {
		if (!advancedSearch) {
			setAndSearchCondition(false);
			setExactly(false);

			customerCode = keywords;
			contactPoint = keywords;
			email = keywords;
			location = keywords;
			personInCharge = keywords;
			handOverFormNumber = keywords;
			assignDate = keywords;
			estimatedReturnDate = keywords;
		}
	}

}
