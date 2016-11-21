package com.dasannetworks.vn.tms.service;

import lombok.Data;

/**
 *
 */
@Data
public class DeviceSearchInput extends BaseServiceInput {
	private String serialNumber;
	private String macAddress;
	private String manufacturerSerial;
	private String productName;
	private String partNumber;

	@Override
	public void advanceSearch(boolean advancedSearch, String keywords) {
		if (!advancedSearch) {
			setAndSearchCondition(false);
			setExactly(false);

			serialNumber = keywords;
			macAddress = keywords;
			manufacturerSerial = keywords;
			productName = keywords;
			partNumber = keywords;
		}
	}

}
