package com.dasannetworks.vn.tms.service;

/**
 *
 */
public class DeviceSearchInput {
    private String serialNumber;
    private String macAddress;
    private String manufacturerSerial;
    private String productName;
    private String partNumber;
    private boolean andSearchCondition;
    private int start;
    private int end;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getManufacturerSerial() {
        return manufacturerSerial;
    }

    public void setManufacturerSerial(String manufacturerSerial) {
        this.manufacturerSerial = manufacturerSerial;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isAndSearchCondition() {
        return andSearchCondition;
    }

    public void setAndSearchCondition(boolean andSearchCondition) {
        this.andSearchCondition = andSearchCondition;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void advanceSearch(boolean advancedSearch, String keywords) {
        if (!advancedSearch) {
            setManufacturerSerial(keywords);
            setProductName(keywords);
            setAndSearchCondition(false);
            setPartNumber(keywords);
            setMacAddress(keywords);
            setSerialNumber(keywords);
        }
    }
}
